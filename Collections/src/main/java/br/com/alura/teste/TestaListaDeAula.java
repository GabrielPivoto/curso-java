package br.com.alura.teste;

import br.com.alura.model.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaListaDeAula {

    public static void main(String[] args) {

        List<Aula> aulas = new ArrayList<>();
        aulas.add(new Aula("Como tomar agua", 10));
        aulas.add(new Aula("Tutorial de comprar pao", 5));
        aulas.add(new Aula("Como colocar meias", 12));

        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));


    }

}
