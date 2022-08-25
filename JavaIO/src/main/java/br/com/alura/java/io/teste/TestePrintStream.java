package br.com.alura.java.io.teste;

import java.io.PrintStream;

public class TestePrintStream {

    public static void main(String[] args) {

        try(PrintStream ps = new PrintStream("Resources/texto3.txt")){

            ps.println("Fazendo mais um teste");

        }catch (Exception e){
            System.out.println("Deu ruim");
        }


    }


}
