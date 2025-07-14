package org.example;

import java.util.Scanner;

public class VendaCartuchos {

    public static void main(String[] args) {

        final int VALOR_CARTUCHO = 50; //Constante em java

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de cartuchos ");
        int numeroCartuchos = scanner.nextInt();
        double valorVenda = 0;
        if(numeroCartuchos <= 500)
            valorVenda = numeroCartuchos *  VALOR_CARTUCHO * 0.95; //desconto de 5%
        else if (numeroCartuchos <= 100)
            valorVenda = numeroCartuchos * VALOR_CARTUCHO * 0.93; //desconto de 7%
        else if (numeroCartuchos <= 1500)
            valorVenda = numeroCartuchos * VALOR_CARTUCHO * 0.91; //desconto de 9%
        else
            valorVenda = numeroCartuchos * VALOR_CARTUCHO * 0.9; //desconto de 9%
        System.out.println("O valor da venda é "+valorVenda);
        scanner.close();
    }
}
