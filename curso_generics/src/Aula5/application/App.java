package Aula5.application;

import java.util.ArrayList;
import java.util.List;

import Aula5.model.entities.Cliente;

public class App {
    public static void main(String[] args) {
    
        List<Cliente> clientes = new ArrayList<>();

        Cliente c1 = new Cliente("Maria", "maria@gmail.com");
        Cliente c2 = new Cliente("Maria", "maria@gmail.com");
        Cliente c3 = c1;

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        // Cliente anterior = null;
        // for (Cliente cliente : clientes) {
        //     System.out.println(cliente.hashCode());

        //     if (anterior != null) {
        //         System.out.println(cliente.equals(anterior));
        //     }
        //     anterior = cliente;
        // }
    
    
        System.out.println(c1 == c2);
        System.out.println(c2 == c3);
        System.out.println(c3 == c1);

    }
    
}
