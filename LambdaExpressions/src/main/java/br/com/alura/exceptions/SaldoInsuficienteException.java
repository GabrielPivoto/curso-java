package br.com.alura.exceptions;

/**
 * @author Gabriel Pivoto
 * @version 0.1
 */
public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }

}
