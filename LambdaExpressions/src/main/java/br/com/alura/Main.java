package br.com.alura;

import br.com.alura.model.*;
import br.com.alura.utils.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        contas.sort(new Comparator<Conta>() { //classe anônima

            @Override
            public int compare(Conta o1, Conta o2) {
                return o1.getTitular().compareTo(o2.getTitular());
            }
        });


        //Outra forma mais simplificada do código acima
        contas.sort(( c1,  c2) ->  c1.getTitular().compareTo(c2.getTitular()));

        Comparator<Conta> comp = new Comparator<Conta>() {
            @Override
            public int compare(Conta o1, Conta o2) {
                return Double.compare(o1.getSaldo(),o2.getSaldo());
            }
        };

        Comparator<Conta> comp2 = (Conta c1, Conta c2) -> {
            return Double.compare(c1.getSaldo(),c2.getSaldo());
        };


        //Collections.sort(contas, new ComparadorSaldo());

        System.out.println("\nDepois de ordenar: ");

        //Duas opções possíveis
        //contas.forEach((conta) -> conta.extrato());

        contas.forEach(Conta::extrato);


    }

}
