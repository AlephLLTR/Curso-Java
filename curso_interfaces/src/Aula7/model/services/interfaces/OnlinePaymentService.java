package Aula7.model.services.interfaces;

public interface OnlinePaymentService {

    Double paymentFee(Double amount);
    Double interest(Double amount, Integer months);
    
}
