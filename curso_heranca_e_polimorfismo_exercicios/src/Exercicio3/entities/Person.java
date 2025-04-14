package Exercicio3.entities;

public class Person extends TaxFile {
    private Double healthcareCosts;
    
    public Person(String name, Double annualIncome, Double healthcareCosts) {
        super(name, annualIncome);
        this.healthcareCosts = healthcareCosts;
    }
    
    @Override
    public Double taxOverIncome() {
        if (annualIncome < 20000) {
            return (annualIncome * 0.15) - (healthcareCosts * 0.5);
        } else {
            return (annualIncome * 0.25) - (healthcareCosts * 0.5);
        }
    }
    
    public Double getHealthcareCosts() {
        return healthcareCosts;
    }
    
    public void setHealthcareCosts(Double healthcareCosts) {
        this.healthcareCosts = healthcareCosts;
    }
    

}
