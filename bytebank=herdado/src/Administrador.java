// administrador � um funcionario, Administrador herda da class Funcionario,assina o contrato (interface) Autenticavel
public class Administrador extends Funcionario implements Autenticavel {

	
	private AutenticacaoUtil autenticador;

	public Administrador () {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
   }
}	
