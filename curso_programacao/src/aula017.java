import java.util.Scanner;
public class Aula017 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int mask = 0b00100000;
        System.out.print("Degite um número: ");
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is True");
        }
        else {
            System.out.println("6th bit is Flase");
        }
        sc.close();
    }
}
