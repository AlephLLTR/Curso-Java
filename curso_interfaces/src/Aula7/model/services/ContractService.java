package Aula7.model.services;

import java.time.LocalDate;
import Aula7.model.entities.Contract;
import Aula7.model.entities.Installment;
import Aula7.model.services.interfaces.OnlinePaymentService;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;
      
    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        double basicQuota = contract.getTotalValue()/months;

        for (int i = 1; i < months+1; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + fee + interest;
            
            contract.getInstallments().add(new Installment(dueDate, quota));
            
        }
    }
}
