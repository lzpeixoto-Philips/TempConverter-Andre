package org.example;
import java.awt.*;
import java.util.Scanner;
public class Conversor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira para qual deseja converter:");
        System.out.println("1 - Celsius");
        System.out.println("2 - Fahrenheit");
        int opcao = teclado.nextInt();

        if (opcao == 1){
            System.out.println("Insira o graus em Fahrenheit: ");
            double Fahrenheit = teclado.nextDouble();
            double Celsius = (Fahrenheit - 32) * 5.0 / 9;
            System.out.println("O graus em Celsius: " + Celsius );
        }
        if (opcao == 2){
            System.out.println("Insira o graus em Celsius: ");
            double Celsius = teclado.nextDouble();
            double Fahrenheit =(Celsius * 1.8) + 32;
            System.out.println("O graus em Fahrenheit: " + Fahrenheit );
        }else if (opcao != 1 && opcao != 2){
            System.out.println("Opção inválida!");
        }
        teclado.close();
    }
}
