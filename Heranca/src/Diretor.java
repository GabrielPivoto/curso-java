public class Diretor extends Funcionario implements SalarioBonus{

    @Override
    public double salarioBonus() {
       return this.getSalario() + 2500;
    }
    
}
