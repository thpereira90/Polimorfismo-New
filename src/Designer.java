
public class Designer extends Funcionario {
	
	public double getBonificacao( ) {
		return super.getBonificacao() + super.getSalario();
	}
}
