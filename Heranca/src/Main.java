
public class Main {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSalario(2000);

		Diretor d = new Diretor();
		d.setSalario(3000);

		CalculadorBonus cb = new CalculadorBonus();
		cb.calculaBonus(g);

	}

}
