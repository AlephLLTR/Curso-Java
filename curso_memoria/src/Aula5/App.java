package Aula5;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.printf("Tamanho da lista: %d\n", list.size());
        for (String string : list) {
            System.out.println(string);
        }
        System.out.println("-------------------------");
        
        list.removeIf(x -> x.charAt(0) == 'M');
        
        System.out.printf("Tamanho da lista: %d\n", list.size());
        for (String string : list) {
            System.out.println(string);
        }
    
    }
}
