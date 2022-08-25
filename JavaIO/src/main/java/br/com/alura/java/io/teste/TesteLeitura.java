package br.com.alura.java.io.teste;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) {

        try {
            // utilização do design pattern Decorator
            InputStream is = new FileInputStream("Resources/texto.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String linhaLer = br.readLine();

            while(linhaLer != null){
                System.out.println(linhaLer);
                linhaLer = br.readLine();
            }

            br.close();

        }catch (Exception e){
            System.out.println("Deu ruim");
        }



    }

}
