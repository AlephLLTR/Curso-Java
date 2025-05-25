package Aula7.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Aula7.model.entities.Contract;
import Aula7.model.entities.Installment;
import Aula7.model.services.ContractService;
import Aula7.model.services.PaypalService;



public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      

        System.out.println("Entre os dados do contrato:");
        System.out.print("Número: ");
        Integer number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
       
        System.out.print("Valor do contrato: ");
        Double amount = sc.nextDouble();
        Contract contract = new Contract(number, date, amount);
        
        System.out.print("Entre com o número de parcelas: ");
        Integer parcels = sc.nextInt();
        
        ContractService cs = new ContractService(new PaypalService());
        cs.processContract(contract, parcels);
        


        System.out.println("Parcelas:" );
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }
        sc.close();
    }
}
