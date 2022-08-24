package br.com.alura.utils;

import br.com.alura.model.Conta;

import java.util.Comparator;

/**
 * @author Gabriel Pivoto
 * @version 0.1
 */
public class ComparadorSaldo implements Comparator<Conta> {

    @Override
    public int compare(Conta o1, Conta o2) {
        return Double.compare(o1.getSaldo(),o2.getSaldo());
    }

}
