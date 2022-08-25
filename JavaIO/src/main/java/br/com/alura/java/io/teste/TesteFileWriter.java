package br.com.alura.java.io.teste;

import java.io.*;

public class TesteFileWriter {

    public static void main(String[] args) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Resources/texto2.txt"))){

            bw.write("Mais um teste");
            bw.newLine();
            bw.write("Java é bem da hora");

        }catch (Exception e){
            System.out.println("Deu ruim");
        }


    }


}
