package Aula9.application;

import Aula9.devices.ComboDevice;
import Aula9.devices.ConcretePrinter;
import Aula9.devices.ConcreteScanner;

public class App {
    public static void main(String[] args) {
        
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My letter");
        p.print("My letter");
        System.out.println("\n");

        ConcreteScanner s = new ConcreteScanner("2011");
        s.processDoc("My email");
        System.out.println("Scan result: " + s.scan());
        System.out.println("\n");
        
        ComboDevice c = new ComboDevice("7182");
        c.print("My book");
        c.processDoc("My magazine");
        System.out.println("Scan result: "+c.scan());

    }
}
