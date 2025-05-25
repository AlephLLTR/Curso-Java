package Aula10.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        List<Employee> list = new ArrayList<>();
        String file = "src\\Aula10\\data\\file.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String employeeCSV = br.readLine();

            while (employeeCSV != null) {
                String[] fields = employeeCSV.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCSV = br.readLine();
            }
            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp);
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
