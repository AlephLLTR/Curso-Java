package ex_2;

public class Employee {

    private String Name;
    private double GrossSalary, Tax;

    private String getName(){
        return Name;
    }
    private void setName(String Name){
        this.Name = Name;
    }

    private double getSalary(){
        return this.GrossSalary;
    }
    private void setSalary(double GrossSalary){
        this.GrossSalary = GrossSalary;
    }

    private double getTax(){
        return this.Tax;
    }
    private void setTax(double Tax){
        this.Tax = Tax;
    }

    public void registerEmployee(String Name, double GrossSalary, double Tax){
        this.setName(Name);
        this.setSalary(GrossSalary);
        this.setTax(Tax);
    }

    public double NetSalary(){
        return getSalary() - getTax();
    }

    public void ChangeSalary(double percentage){
        setSalary(getSalary()+(getSalary()/percentage));
    }

    public String toString(){
        return "Employee: " + getName() + ", $" + NetSalary();
    }
}
