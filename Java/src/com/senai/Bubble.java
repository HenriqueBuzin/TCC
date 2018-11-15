package com.senai;

import java.util.Arrays;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

public class Bubble {

    public static int[] Bubble(int[] numbers) {

        int temp = 0;

        for(int i = 0; i < numbers.length; i++){

            for(int j = 0; j < numbers.length - 1; j++){

                if(numbers[j] > numbers[j + 1]){

                    temp = numbers[j];

                    numbers[j] = numbers[j + 1];

                    numbers[j + 1] = temp;

                }

            }

        }

        return numbers;

    }

    public static void main(String[] args) throws IOException {


        Runtime runtimex = Runtime.getRuntime();

        // BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/henrique_buzin/IdeaProjects/Java/src/com/senai/1.000.txt"));
        // int[] numbers = new int[1000];

        // BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/henrique_buzin/IdeaProjects/Java/src/com/senai/10.000.txt"));
        // int[] numbers = new int[10000];

        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/henrique_buzin/IdeaProjects/Java/src/com/senai/100.000.txt"));
        int[] numbers = new int[100000];

        for(int i = 0; bufferedReader.ready() != false; i++){

            numbers[i] = Integer.parseInt(bufferedReader.readLine());

        }

        bufferedReader.close();

        long inicio = System.nanoTime();

        Bubble(numbers);

        long fim = System.nanoTime();

        System.out.println(Arrays.toString(numbers));

        System.out.println(fim - inicio);

        System.out.println(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());

    }

}