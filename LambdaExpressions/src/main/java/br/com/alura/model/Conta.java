package br.com.alura.model;

import br.com.alura.exceptions.SaldoInsuficienteException;

/**
 * @author Gabriel Pivoto
 * @version 0.1
 */
public abstract class Conta {

    private String titular;
    private double saldo;
    private int agencia;
    private int numero;
    private static int cont;

    public Conta(String titular, double saldo, int agencia) {
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
        cont++;
        this.numero = cont;
    }

    public void extrato(){
        System.out.println("---------------");
        System.out.println("### Conta " + this.agencia + "-" + this.numero + " ###");
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo em conta: " + this.saldo);
    }

    /**
     * Método que realiza um saque de determinado valor.
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor){
        if(saldo <= valor)
            throw new SaldoInsuficienteException("Saldo insuficiente! - Saldo: " + this.saldo + " - Valor: " + valor);
        else
            this.saldo -= valor;
    }

    /**
     * Método que deposita determinado valor.
     *
     * @param valor
     */
    public void deposita(double valor){
        this.saldo += valor;
    }

    /**
     * Método que realiza transferência de valores entre duas contas.
     *
     * @param valor
     * @param destino
     */
    public void transfere(double valor, Conta destino){
        if(destino == null)
            System.out.println("Impossível realizar a transferência");
        else{
            this.saca(valor);
            destino.deposita(valor);
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }
}
