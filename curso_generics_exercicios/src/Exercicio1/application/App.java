package Exercicio1.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import Exercicio1.model.entities.EntryLog;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            Set<EntryLog> set = new HashSet<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));
                set.add(new EntryLog(username, moment));
                line = br.readLine();
            }

            System.out.println("Total users: " + set.size() );

        } catch (IOException err) {
            System.out.println("ERRO: " + err.getMessage());
        }

    }
}
