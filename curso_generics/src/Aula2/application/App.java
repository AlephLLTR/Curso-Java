package Aula2.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Aula2.model.entities.Product;
import Aula2.model.services.CalculationService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        String path = "src\\Aula2\\data\\in.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Max: " + x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
