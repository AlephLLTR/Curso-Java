package Aula4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good evening"};

        String filePath = "c:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            } 
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
