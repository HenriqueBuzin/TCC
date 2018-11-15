package com.senai;

public class Exibir {

    public static void main(String[] args) {

        long inicio = System.nanoTime();

        String text = "Olá Mundo!";

        System.out.println(text);

        long fim = System.nanoTime();

        Runtime runtime = Runtime.getRuntime();

        System.out.println(fim - inicio);

        System.out.println((runtime.totalMemory() - runtime.freeMemory()));

    }

}
