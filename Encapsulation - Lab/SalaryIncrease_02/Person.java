package EncapsulationLab.SalaryIncrease_02;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus){
        double bonusToAdd = this.salary * bonus/100;
        if (this.age<30){
            this.salary = this.salary + bonusToAdd/2;
        } else {
            this.salary = this.salary + bonusToAdd;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva.",this.firstName, this.lastName, this.salary);
    }
}