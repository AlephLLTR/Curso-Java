package Aula9.application;

import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();
        
        cookies.put("username", "Maria");
        cookies.put("email", "maria@email.com");
        cookies.put("phone", "99999-9999");
        
        cookies.remove("email");
        
        cookies.put("phone", "99999-1119");
        System.out.println("ALL COOKIES:");
        for (String key : cookies.keySet()) {
            System.out.println(key + " : " + cookies.get(key));
        }
    }
}
