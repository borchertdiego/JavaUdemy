package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date manufactureDate;
	
	public UsedProduct() {
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
//  Cada produto tem uma tag diferente
	@Override
	public final String priceTag() {
		return  super.getName() 
			  + " (used) $ " 
			  + String.format("%.2f", super.getPrice()) 
			  + " (Manufacture date: "
			  + sdf.format(manufactureDate)
			  + ")";
	}
}
