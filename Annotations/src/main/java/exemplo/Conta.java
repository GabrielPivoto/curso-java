package exemplo;

public abstract class Conta {

    @DoublePositivo
    protected double saldo;
    private String titular;
    private String banco;
    private String agencia;
    private String numero;

}
