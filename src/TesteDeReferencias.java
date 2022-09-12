
public class TesteDeReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Donizete");
		g1.setSalario(5000.0);
		
		Funcionario f = new Funcionario();
		f.setNome("Juca");
		f.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("José");
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setNome("João");
		d.setSalario(2000.0);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		

	}

}
