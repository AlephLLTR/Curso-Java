package Aula9.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Global.Product;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Insira o caminho do arquivo:");
        // String fPath = sc.nextLine();
        String fPath = "src\\Aula9\\data\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fPath))) {

            List<Product> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Double avg = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0D, (x, y) -> x + y) / list.size();

            Double sum = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0D, (x, y) -> x + y);

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            System.out.println("Preço Total do Carrinho: " + String.format("%.2f", sum));
            System.out.println("Preço Médio do Carrinho: " + String.format("%.2f", avg) + "\n");

            List<String> belowAvg = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            System.out.println("Produtos com preço abaixo da média:");
            belowAvg.forEach(System.out::println);

        } catch (IOException err) {
            System.out.println("Erro: " + err.getMessage());
        } finally {
            sc.close();
        }

    }
}
