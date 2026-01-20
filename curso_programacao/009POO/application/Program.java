package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a catação do dólar: ");
        double catacao = sc.nextDouble();
        System.out.print("Informe quantos dólares deseja comprar: ");
        double dolar = sc.nextDouble();

        System.out.printf("Voce consegue comprar: %.2f%n", CurrencyConverter.reais(catacao, dolar), "Reais");

     

        
        sc.close();
    }
}
