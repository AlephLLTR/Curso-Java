package ex_2;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee newEmployee = new Employee();

        String name;
        double salary, tax, increase;

        System.out.print("Nome: ");
        name = sc.nextLine();
        System.out.print("Gross salary: ");
        salary = sc.nextDouble();
        System.out.print("Tax: ");
        tax = sc.nextDouble();
        
        newEmployee.registerEmployee(name, salary, tax);
        System.out.println(newEmployee);
        System.out.print("Aumento de salário em quantos %?");
        increase = sc.nextDouble();
        newEmployee.ChangeSalary(increase);
        System.out.println(newEmployee);        
        
        sc.close();
    }
}
