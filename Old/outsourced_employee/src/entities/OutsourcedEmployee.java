package entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalCharge;

	public OutsourcedEmployee() {
	}
	
//	Sobrecarga
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAditionalCharge() {
		return additionalCharge;
	}

	public void setAditionalCharge(Double aditionalCharge) {
		this.additionalCharge = aditionalCharge;
	}
	
/*  Sobreescrevendo a fun��o da super pois cada profissional tem um tipo de pagamento  */
	@Override
	public final Double payment() {
		
	//	Tr�s o pagamento de um funcion�rio normal (super) + o adicional do terceiro
		return super.payment() + additionalCharge * 1.1;
	}
}
