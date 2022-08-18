
public class Main {

	public static void main(String[] args) {
		
		ControleBonificacao cb = new ControleBonificacao();

		Funcionario f= new Funcionario();
		f.setNome("Gabriel");
		f.setCpf("111.111.111-11");
		f.setSalario(2500);

		Gerente g = new Gerente();
		g.setNome("Marcos");
		g.setCpf("222.222.222-22");
		g.setSalario(5000);

		cb.registra(f);
		cb.registra(g);

		System.out.println(cb.getSoma());
		

	}

}
