package application;

import entities.Notas;
import java.util.Locale;
import java.util.Scanner;

public class ProgramNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Notas nota = new Notas();

        System.out.print("Digite sua primeira nota: ");
        nota.nota1 = sc.nextDouble();
        System.out.print("Digite sua segudna nota: ");
        nota.nota2 = sc.nextDouble();
        System.out.print("Digite sua terceira nota: ");
        nota.nota3 = sc. nextDouble();

        System.out.println();
        System.out.printf("Nota final: %.2f", nota.notaFinal());
        System.out.println();
        if(nota.resultado() == true){
            System.out.println("Passou!");
        }else{
            System.out.println("Reprovou!");
            System.out.printf("Faltou %.2f", nota.faltou());
        }
        System.out.println();

        sc.close();
    }
}
