package models;

public class Employee {
    public int id;
    public String name;
    public String city;
    public double salary;
    public int rankId;
    public Employee(int id, String name, String city, double salary, int rankId) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
        this.rankId = rankId;
    }
    
}
