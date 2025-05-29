package Exercicio1.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Global.Employee;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Insira o caminho do arquivo:");
        // String fPath = sc.nextLine();
        String fPath = "src\\Exercicio1\\data\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fPath))) {

            List<Employee> employees = new ArrayList<>();
            String line = br.readLine();

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            while (line != null) {
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Defina o piso salarial para a operação: R$");
            Double floor = sc.nextDouble();

            List<String> emails = employees.stream()
                    .filter(e -> e.getSalary() > floor)
                    .map(e -> e.getEmail())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            System.out.println("\nFuncionários com salário acima do piso definido:");
            emails.forEach(System.out::println);

            Double sum = employees.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0D, (x, y) -> x + y);

            System.out.println("\nSoma dos salários dos funcionários cujo nome começa com 'M': " + String.format("%.2f", sum));

        } catch (IOException err) {
            System.out.println("Erro: " + err.getMessage());
        }
        sc.close();

    }
}
