package br.com.alura;

import br.com.alura.model.*;
import br.com.alura.utils.*;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Gabriel Pivoto
 * @version 0.1
 */
public class Main {

    public static void main(String[] args) {



        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(new ContaCorrente("Gabriel",1300,20));
        contas.add(new ContaCorrente("Marcos",750,11));
        contas.add(new ContaCorrente("Felipe",1555,35));
        contas.add(new ContaPoupanca("Juliana",250,12));
        contas.add(new ContaPoupanca("Renato",3100,25));
        contas.add(new ContaPoupanca("Carolina",450,5));


        System.out.println("Antes de ordenar: ");
        for (Conta conta:
             contas) {
            conta.extrato();
        }

        //Duas das possíveis opções
        contas.sort(new ComparadorTitular());
        Collections.sort(contas, new ComparadorSaldo());

        System.out.println("\nDepois de ordenar: ");
        for (Conta conta:
                contas) {
            conta.extrato();
        }

    }

}
