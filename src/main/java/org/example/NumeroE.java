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
            ex = ex + (Math.pow(x, i)) / fatorialModificado(i); //x elevado a I divido por I
        System.out.println("O valor de e ( " + x + " ) é = " + ex);
        scanner.close();
    }

    //calculando o fatorial de um número
    public static int fatorial(int i)
    {
        int resultado = 1;
        for (int j = 1; j <= i; i++) {
            resultado *= j;
        }
        return resultado;
    }
    public static double fatorialModificado(int i)
    {
        return (switch (i){
            case 0,1 -> 1;
            default -> {
                double fatorial = 1 * fatorialModificado(i-1);
                yield fatorial;
            }
        });
    }
}