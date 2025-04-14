package Exercicio3.entities;

public abstract class TaxFile {
    protected String name;
    protected Double annualIncome;
    
    public TaxFile(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract Double taxOverIncome();



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name 
        + ": $" 
        + String.format("%.2f", taxOverIncome());
    }
    
    

}
