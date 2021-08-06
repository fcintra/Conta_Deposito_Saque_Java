import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Depositar d = new Depositar();
		sacar as = new sacar();

		double s = 0;
				
		int op = 0;
		
		
		do {
			
			Object[] opcoes = {"Depositar","Sacar","Consultar","Sair"};
			
			op = JOptionPane.showOptionDialog(null,"O que deseja fazer ?","Conta",1,3,null,opcoes,null);
			
			if(op == 0) {
				d.setdepositar(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantia do depósito")));
		
				s = s + d.verdeposito();
				
			}else if(op == 1) {
				as.setsacar(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite quantia do saque")));
				s = s - as.versaque();
			}else if(op==2) {
				
				JOptionPane.showMessageDialog(null,s);
			
			}else {
				JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!!");
			
			}
		}while(op != 3);	

		


}
}
