public class Depositar extends 	conta{
	private double depositar;
	
	public Depositar() {
		this(0.0,0.0);
	}
	public Depositar(double depositar, double saldo) {
		super(saldo);
		this.saldo = saldo;
		this.depositar = depositar;
	
	}
	public double getdepositar() {
		return depositar;
		
		
	}
	public void setdepositar(double depositar) {
		this.depositar = depositar;
		
	}
	public double verdeposito() {
		double ver = getdepositar();
		return ver;
		
	}
}

