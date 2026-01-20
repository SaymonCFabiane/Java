package application;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle prop;
        prop = new Rectangle();

        System.out.print("Digite a largura do retangulo: ");
        prop.width = sc.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        prop.height = sc.nextDouble();

        double area = prop.area();
        double perimetro = prop.perimeter();
        double diagonal = prop.diagonal();

        System.out.printf("A area do retangulo é: %.2f", area);
        System.out.println();
        System.out.printf("O perimetro do retangulo é: %.2f", perimetro);
        System.out.println();
        System.out.printf("A diagonal do retangulo é: %.2f", diagonal);       
        System.out.println();

        sc.close();

    }
}
