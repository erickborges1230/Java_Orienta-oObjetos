package org.example;

import java.util.Scanner;

public class NumeroE {
    public static void main(String[] args) {
        double ex = 0;
        double x;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de X ");

        x = scanner.nextDouble();

        for (int i = 1; i <= 30; i++)
            ex = ex + (Math.pow(x, i))/i; //x elevado a I divido por I
        System.out.println("O valor de e ( " +x+ " ) é = "+ex);
        scanner.close();
    }
}