package Aula1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
    
            System.out.println(vect[position]);            
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position!");
        } 
        catch (InputMismatchException e){
            System.out.println("Bad input!");
        }


        System.out.println("End of Line.");

        sc.close();
    }
}
