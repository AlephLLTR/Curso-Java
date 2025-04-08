package Exercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, id;
        String name;
        double salary, percentage;

        System.out.print("How many employees will be registered? ");
        n = sc.nextInt();
        sc.nextLine();

        List<Employee> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Employee #%d\n", i);
            
            System.out.print("ID: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Salary: ");
            salary = sc.nextDouble();

            list.add(new Employee(id, name, salary)) ;
            System.out.println();
        }

        System.out.print("Insert the Employee ID whose salary will be increased: ");
        id = sc.nextInt();

        System.out.print("Enter the percentage: ");
        percentage = sc.nextDouble();

        for (Employee employee : list) {
            if (employee.getID() == id) {
                employee.increaseSalary(percentage);
            }
        }

        System.out.println("\nList of employees:");
        for (Employee employee : list) {
            System.out.println(employee);
        }
        sc.close();
    }
}
