package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) {

        try{

            OutputStream os = new FileOutputStream("Resources/saida.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Teste");
            bw.newLine();
            bw.close();

        }catch (Exception e){
            System.out.println("Deu ruim");
        }


    }


}
