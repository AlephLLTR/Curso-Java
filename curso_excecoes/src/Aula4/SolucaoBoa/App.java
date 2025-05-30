package Aula4.SolucaoBoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Aula4.SolucaoBoa.model.entities.Reservation;
import Aula4.SolucaoBoa.model.exceptions.DomainException;

public class App {
    public static void main(String[] args) {
        System.out.println("Solução Boa");
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Room Number: ");
            int roomNumber = sc.nextInt();
    
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());
    
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        
            System.out.println("\nEnter data to update the reservation:");
            System.out.print("Check in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
    
            System.out.print("Check out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());
    
            reservation.updateDates(checkIn, checkOut);
        
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e){
            System.out.println("Invalid date format.");
        } catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Unexpected error.");
        }
    }
        
}

