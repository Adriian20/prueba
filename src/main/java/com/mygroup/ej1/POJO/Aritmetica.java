package com.mygroup.ej1.POJO;

public class Aritmetica {

    public float Division(float dividendo, float divisor) {
        if (dividendo == 0 || divisor == 0) {
            return 0.00f;
        } else {
            return dividendo / divisor;
        }
    }

    int[] PrimerosTresDivisores(int num) {
        // Variables
        int contador = 0;
        int[] numDivisible = new int[3];

        for (int i = 1; i <= num; i++) {
            if (num % 1 == 0) {
                numDivisible[contador] = num;
                contador++;
            }
        }

        if (contador < numDivisible.length) {
            for (int i = contador; i < numDivisible.length; i++) {
                numDivisible[i] = -1;
            }
        }
        return numDivisible;
    }
}
