package entities;

public abstract class SavingsAccount extends Account {

	private double interestRate;

	public SavingsAccount() {
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
/*  A anota��o @Override serve para mostrar ao compilador que � pra sobreescrever o m�todo da
 *  superclasse nessa classe.  */ 
	@Override
	public final void withdraw(Double amount) {
		balance += amount;
	}
}
