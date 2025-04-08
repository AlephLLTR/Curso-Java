package ex_3;

public class CurrencyConverter {

    private double cotacaoAtual, quantia;
    private final int rate = 6;

    private void setCotacao(double cotacaoAtual){
        this.cotacaoAtual = cotacaoAtual;
    }

    private double getCotacao(){
        return cotacaoAtual;
    }

    private void setQuantia(double quantia){
        this.quantia = quantia;
    }

    private double getQuantia(){
        return quantia;
    }

    private double getTaxa(){
        return getQuantia() * ((getCotacao() * rate)/100);
    }

    private double getConversion(){
        return getQuantia() * getCotacao();
    }

    public double calcular(double quantia, double cotacao){
        this.setCotacao(cotacao);
        this.setQuantia(quantia);
        return getConversion() + getTaxa();
    }




}
