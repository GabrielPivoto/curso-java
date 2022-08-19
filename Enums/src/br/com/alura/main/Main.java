package br.com.alura.main;

public class Main {
    public static void main(String[] args) {

        /* 
        System.out.println(Thread.MAX_PRIORITY);
        
        Thread t = new Thread(() -> System.out.println("rodando..."));

        t.setPriority(Thread.MAX_PRIORITY);

        t.start();
        */

        //Prioridade é uma classe com características especiais

        Prioridade pMin = Prioridade.MIN;
        Prioridade pMax = Prioridade.MAX;

        System.out.println("Prioridade " + pMin.name() + " está na posicao " + pMin.ordinal() + " com valor de " + pMin.getValor());
        System.out.println("Prioridade " + pMax.name() + " está na posicao " + pMax.ordinal() + " com valor de " + pMax.getValor());


    }
}
