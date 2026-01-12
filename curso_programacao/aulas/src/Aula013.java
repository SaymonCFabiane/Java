
import java.util.Scanner;

public class Aula013 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = 1;
        int soma = 0;
        System.out.println();
        while(x != 0){
            System.out.print("Digite um numero: ");
            x = sc.nextInt();
            soma = soma + x;
        }
        
        System.out.println("\n\nFim do programa!\n\n");
        System.out.println(soma);
        


        sc.close();
    }
}
