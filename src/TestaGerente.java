
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("McLOVIN");
		g1.setCpf("222.222.222.22");
		g1.setSalario(5000.0);
		g1.setSenha(01234);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(01234);
		boolean autenticou = g1.autentica(01234);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	
	}
}