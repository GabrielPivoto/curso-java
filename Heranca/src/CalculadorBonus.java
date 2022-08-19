public class CalculadorBonus {

    public void calculaBonus(SalarioBonus sb){
        if(sb instanceof Diretor)
            System.out.println("Salário com bônus do diretor:" + sb.salarioBonus());
        else
            System.out.println("Salário com bônus do gerente: " + sb.salarioBonus());
    }

    
}
