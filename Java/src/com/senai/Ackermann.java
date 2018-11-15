package com.senai;

import java.math.BigInteger;

class Ackermann {

    public static BigInteger Ack(BigInteger m, BigInteger n){

        if(m.equals(BigInteger.ZERO)) {

            return n.add(BigInteger.ONE);

        } else if(n.equals(BigInteger.ZERO)) {

            return Ack(m.subtract(BigInteger.ONE), BigInteger.valueOf(1));

        } else {

            return Ack(m.subtract(BigInteger.ONE), Ack(m, n.subtract(BigInteger.ONE)));

        }

    }

    public static void main(String args[]) {

        long inicio = System.nanoTime();

        // BigInteger resultado = Ack(BigInteger.valueOf(1), BigInteger.valueOf(1));
        // BigInteger resultado = Ack(BigInteger.valueOf(1), BigInteger.valueOf(2));
         BigInteger resultado = Ack(BigInteger.valueOf(2), BigInteger.valueOf(1));
        // BigInteger resultado = Ack(BigInteger.valueOf(2), BigInteger.valueOf(2));
        // BigInteger resultado = Ack(BigInteger.valueOf(3), BigInteger.valueOf(1));
        // BigInteger resultado = Ack(BigInteger.valueOf(3), BigInteger.valueOf(2));
        //BigInteger resultado = Ack(BigInteger.valueOf(3), BigInteger.valueOf(2));

        long fim = System.nanoTime();

        System.out.println(resultado);

        System.out.println(fim - inicio);

        System.out.println(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());

    }

}