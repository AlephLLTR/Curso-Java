package Application;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        String input_path = "src\\Files\\In\\sales_report_jan2025.csv";
        String output_path = "src\\Files\\Out\\summary.csv";

        File sourceFile = new File(input_path);

        try (BufferedReader br = new BufferedReader(new FileReader(input_path))){
            String itemCSV = br.readLine();

            while (itemCSV != null) {
                String[] fields = itemCSV.split(",");
                
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCSV = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(output_path))) {
                
                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println("Arquivo processado com sucesso.");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
