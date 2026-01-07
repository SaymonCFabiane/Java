
import java.util.Scanner;

public class Aula010 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Digite o dia da semana: ");
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            
            default:
                dia = "Valor invalido";
        }

    if(dia.equals("Valor invalido")){
        System.out.println("ERRO DIA INVALIDO!!!!!");
    }else{
        System.out.println("Hoje é " + dia);
    }


        sc.close();
    }
}
