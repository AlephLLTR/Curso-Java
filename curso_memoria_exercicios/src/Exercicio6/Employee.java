package Exercicio6;

public class Employee {
    private int ID;
    private String name;
    private double salary;
    
    public Employee(int iD, String name, double salary) {
        setID(iD);;
        setName(name);
        setSalary(salary);
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage){
        this.salary += (this.salary*percentage)/100;
    }

    @Override
    public String toString() {
        return ID + "," + name + ", $" + salary;
    }

    

}
