package br.com.alura.java.io.teste;

import br.com.alura.java.io.model.Carro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

    public static void main(String[] args) {


        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Resources/objeto.bin"))){

            String nome = "Gabriel Pivoto";
            //Para poder ser serializado, a classe precisa implementar Serializible
            Carro c = new Carro();
            c.setModelo("AirCross");
            c.setCor("Vermelho");
            c.setFabricante("Citroen");
            c.setKmRodados(0);

            oos.writeObject(c);

        }catch (Exception e){
            System.out.println("Deu ruim");
        }


        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Resources/objeto.bin"))){

            Carro c = (Carro) ois.readObject();
            c.mostraInfo();

        }catch (Exception e){

            System.out.println("Deu ruim");
        }



    }

}
