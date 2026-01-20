package entities;


public class Employee {
    
    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        double reducedSalary = grossSalary - tax;
        return reducedSalary;
    }

    public void increaseSalary(double percentage){
        grossSalary = NetSalary() + ((grossSalary / 100) * percentage);
    }

    public String toString() {
        return "Update data: " + name + ", $ " + grossSalary;
    }

}
