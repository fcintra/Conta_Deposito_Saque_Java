public class sacar extends 	conta{
	private double sacar;
	
	public sacar() {
		this(0.0,0.0);
	}

		// TODO Auto-generated constructor stub
	
	public sacar(Double sacar, Double saldo) {
		super(saldo);
		this.saldo = saldo;
		this.sacar = sacar;
	
	}
	public double getsacar() {
		return sacar;
		
		
	}
	public void setsacar(double sacar) {
		this.sacar = sacar;
		
	}
	public double versaque() {
		double ver = getsacar();
		return ver;
		
	}
}
