package Exercicio3.entities;

public class Company extends TaxFile{

    private Integer numberOfEmployees;

    public Company(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double taxOverIncome() {
        if (numberOfEmployees <= 10) {
            return annualIncome * 0.16;
        } else{
            return annualIncome * 0.14;
        }
    }
    
    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    

    
}


