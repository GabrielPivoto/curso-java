package br.com.alura.java.io.util;

import br.com.alura.java.io.model.Carro;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public static void escrever(Carro carro){

        try {

            OutputStream os = new FileOutputStream("Resources/carros.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Carro");
            bw.newLine();
            bw.write(carro.getModelo() + "\n");
            bw.write(carro.getCor() + "\n");
            bw.write(carro.getFabricante() + "\n");
            bw.write(carro.getKmRodados() + "\n");

            bw.close();

        }catch (Exception e){
            System.out.println("Deu ruim");
        }
    }

    public static ArrayList<Carro> ler(){

        ArrayList<Carro> carros = new ArrayList<>();

        try{

            InputStream is = new FileInputStream("Resources/carros.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String linha;

            linha = br.readLine();
            while(linha != null){
                if(linha.contains("Carro")){
                    Carro c = new Carro();
                    c.setModelo(br.readLine());
                    c.setCor(br.readLine());
                    c.setFabricante(br.readLine());
                    c.setKmRodados(Double.parseDouble(br.readLine()));
                    carros.add(c);
                }
                linha = br.readLine();
            }

            br.close();

        }catch (Exception e){
            System.out.println("Deu ruim");
        }


        return carros;
    }


}
