
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario Thiago = new Funcionario();
		
		Thiago.setNome("Thiago Henrique Pereira");
		Thiago.setCpf("444.444.444.44");
		Thiago.setSalario(2000.0);
		
		System.out.println(Thiago.getNome());
		System.out.println(Thiago.getCpf());
		System.out.println(Thiago.getSalario());

	}

}
