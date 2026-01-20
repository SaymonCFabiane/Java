package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double c = calc.circunferencia(raio);

        double v = calc.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("VAlor de PI: %.2f%n", calc.PI);

        sc.close();
    }
}
