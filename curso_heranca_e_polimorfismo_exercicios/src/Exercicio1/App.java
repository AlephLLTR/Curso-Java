package Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Exercicio1.entities.Employee;
import Exercicio1.entities.OutsourcedEmployee;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);  
    
        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1) + " data:");
            
            System.out.print("Is this employee outsourced? (Y/n): ");
            char outsourced = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Wage per hour: ");
            double wage = sc.nextDouble();

            if (outsourced == 'y' || outsourced == 'Y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                list.add(new OutsourcedEmployee(name, hours, wage, additionalCharge));
            } else {
                list.add(new Employee(name, hours, wage));
            }
        }

        System.out.println();
        System.out.println("PAYROLL: ");
        for (Employee employee : list) {
            System.out.println(employee.getName() + " - $" + employee.payment());
        }


    }
}
