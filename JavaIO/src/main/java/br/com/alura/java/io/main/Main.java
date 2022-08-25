package br.com.alura.java.io.main;

import br.com.alura.java.io.model.Carro;
import br.com.alura.java.io.util.Arquivo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> carros;

        while(flag){
            System.out.println("1 - Cadastrar novo carro");
            System.out.println("2 - Mostrar carros salvos no sistema");
            System.out.println("3 - Ordenar carros por modelo");
            System.out.println("4 - Ordenar carros por quilometros rodados");
            System.out.println("5 - Sair");
            System.out.println("Sua opcao: ");
            int op = sc.nextInt();

            switch (op){
                case 1 -> {
                    sc.nextLine();
                    Carro carro = new Carro();
                    System.out.println("Digite o modelo do carro: ");
                    carro.setModelo(sc.nextLine());
                    System.out.println("Digite a cor do carro: ");
                    carro.setCor(sc.nextLine());
                    System.out.println("Digite o fabricante do carro: ");
                    carro.setFabricante(sc.nextLine());
                    System.out.println("Quantos kms rodados ele tem: ");
                    carro.setKmRodados(sc.nextDouble());
                    Arquivo.escrever(carro);
                    System.out.println("Carro cadastrado com sucesso!");
                }
                case 2 -> {
                    carros = Arquivo.ler();
                    carros.forEach(Carro::mostraInfo);
                }
                case 3 -> {
                    carros = Arquivo.ler();
                    carros.sort((c1,c2) -> c1.getModelo().compareTo(c2.getModelo()));
                    carros.forEach(Carro::mostraInfo);
                }
                case 4 -> {
                    carros = Arquivo.ler();
                    carros.sort((c1,c2) -> Double.compare(c1.getKmRodados(),c2.getKmRodados()));
                    carros.forEach(Carro::mostraInfo);
                }
                case 5 -> {
                    System.out.println("Voce saiu!");
                    flag = false;
                }
            }
        }


    }

}
