import java.util.Locale;
import java.util.Scanner;

public class Aula006 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        String x;
        System.out.print("Digite uma palavra: ");
        x  = sc.next(); // Lê uma palavra (até o primeiro espaço)
        System.out.println("Você digitou: " + x);

        int y;
        System.out.print("Digite um número: ");
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        double z;
        System.out.print("Digite um número com decimal: ");
        z = sc.nextDouble();
        System.out.println("Você digitou: " + z); 

        sc.nextLine();

        String a;
        System.out.print("Digite um texto: ");
        a = sc.nextLine(); 
        System.out.println("Você digitou: " + a);   

        char b;
        System.out.print("Digite um caractere: ");
        b = sc.next().charAt(0);
        System.out.println("Você digitou: " + b);

        String c;
        int d;
        double e;

        c = sc.next();
        d = sc.nextInt();
        e = sc.nextDouble();
        System.out.printf("Dados digitados %s %d %.2f \n", c, d, e);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        sc.close();


    }
}
