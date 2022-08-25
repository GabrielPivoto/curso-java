package br.com.alura.java.io.teste;

import java.io.PrintWriter;

public class TestePrintWriter {

    public static void main(String[] args) {

        try(PrintWriter pw = new PrintWriter("Resources/texto4.txt")){

            pw.println("Mais um teste bem da hora");

        }catch (Exception e){
            System.out.println("Deu ruim");
        }

    }

}
