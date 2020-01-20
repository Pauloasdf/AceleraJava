package java;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        int numberOf100 = 0;
        int numberOf50 = 0;
        int numberOf20 = 0;
        int numberOf10 = 0;

        Scanner scan = new Scanner(System.in);

        int valorDigitado = scan.nextInt();

        if(valorDigitado<10){
            System.out.println("Insira um valor mínimo de R$ 10!");
        }else{
            if(valorDigitado >= 100){
                numberOf100 = (int)valorDigitado/100;
                valorDigitado = valorDigitado -(numberOf100 * 100);
            }

            if(valorDigitado >= 50){
                numberOf50 = (int)valorDigitado/50;
                valorDigitado = valorDigitado -(numberOf50 * 50);
            }

            if(valorDigitado >= 20){
                numberOf20 = (int)valorDigitado/20;
                valorDigitado = valorDigitado -(numberOf20 * 20);
            }

            if(valorDigitado >= 10) {
                numberOf10 = (int) valorDigitado / 10;
                valorDigitado = valorDigitado - (numberOf10 * 10);
            }

            System.out.println("Quantidade de notas de R$ 100 = " + numberOf100);
            System.out.println("Quantidade de notas de R$ 50 = " +  numberOf50);
            System.out.println("Quantidade de notas de R$ 20 = " +  numberOf20);
            System.out.println("Quantidade de notas de R$ 10 = " +  numberOf10);

            if(valorDigitado > 0){
                System.out.println("Sobraram " + valorDigitado + " reais em moedas.");
            }
        }

    }

}
