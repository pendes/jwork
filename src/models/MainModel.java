package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {
    
    Rank[] ranks = {
        new Rank(1, "takarító"),
        new Rank(2, "portás"),
        new Rank(2, "építész"),
        new Rank(2, "gondnok"),
    };
    public Vector<Rank> rankList = new Vector<>(Arrays.asList(ranks));
 
    Employee[] employees = {
        new Employee(1, "Para Béla", "Szolnok", 358, 1),
        new Employee(1, "Eme Lajos", "Szeged", 398, 1),
        new Employee(1, "Lant Ferenc", "Szeged", 342, 2),
        new Employee(1, "Rola Irén", "Szolnok", 337, 2),
    };
    public Vector<Employee> employeeList = new Vector<>(Arrays.asList(employees));
}
