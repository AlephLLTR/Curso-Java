package Exercicio1.entities;

public class Employee {
    private String name;
    private Integer hours;
    private Double hourlyWage;

    public Employee(){}

    public Employee(String name, Integer hours, Double hourlyWage) {
        this.name = name;
        this.hours = hours;
        this.hourlyWage = hourlyWage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(Double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double payment(){
        return hours * hourlyWage;
    }

}
