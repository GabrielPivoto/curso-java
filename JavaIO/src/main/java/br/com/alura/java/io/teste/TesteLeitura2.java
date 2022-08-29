package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(new File("Resources/contas.csv"))){

            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                //System.out.println(linha);

                Scanner linhaScanner = new Scanner(linha);
                linhaScanner.useDelimiter(",");

                String tipoConta = linhaScanner.next();
                int agencia = linhaScanner.nextInt();
                int numeroConta = linhaScanner.nextInt();
                String titular = linhaScanner.next();
                double saldo = linhaScanner.nextDouble();

                String formatado = String.format(new Locale("pt","BR"),"%s - %04d-%d, %s: %.2f",
                        tipoConta, agencia, numeroConta, titular, saldo);

                System.out.println(formatado);
                linhaScanner.close();

                /*
                String[] valores = linha.split(",");
                System.out.println(valores[3]);
                 */
            }

        }catch (Exception e){
            System.out.println("Deu ruim!");
        }


    }

}
