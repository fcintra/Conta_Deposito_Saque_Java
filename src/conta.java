

public class conta{

	
	protected double saldo;
	


	
	
	public conta() {
	
		this(0.0);
		
		
	}
	public conta(double saldo) {
	this.saldo = saldo;
	
	
	
	}
	
	public double getsaldo() {
		return saldo;
		
	}
	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}
	public String versaldo() {
	
		String ver =""+getsaldo();
		
		return ver;
		
	

	

	}

	
}
