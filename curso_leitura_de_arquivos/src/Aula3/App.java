package Aula3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String filePath = "c:\\temp\\in.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


 }
}
