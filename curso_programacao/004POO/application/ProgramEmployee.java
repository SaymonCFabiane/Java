package application;
import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Employee employee = new Employee();
        double percentage;

        System.out.print("Digite seu nome: ");
        employee.name = sc.nextLine();
        System.out.print("Digite seu salario: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Digite o imposto: ");
        employee.tax = sc.nextDouble();

        employee.NetSalary();

        System.out.printf("Employee: %s, $ %.2f", employee.name, employee.NetSalary());
        System.out.println();

        System.out.print("Digite a porcentagem do aumento: ");
        percentage = sc.nextDouble();

        employee.increaseSalary(percentage);

        System.out.print(employee);
        System.out.println();

    }
}
