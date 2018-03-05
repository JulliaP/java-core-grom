package lesson30.ITCompanies;

import java.util.ArrayList;
import java.util.Date;

public class Employee {

    private String firstName;
    private String lastName;
    private Date dateHired;
    private Position position;
    private Department department;
    private ArrayList<Project> projects = new ArrayList<>();

    public Employee(String firstName, String lastName, Date dateHired, Position position, Department department, ArrayList<Project> projects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateHired = dateHired;
        this.position = position;
        this.department = department;
        this.projects = projects;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public Position getPosition() {
        return position;
    }

    public Department getDepartament() {
        return department;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setDepartament(Department departament) {
        this.department = departament;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", dateHired=" + dateHired + ", position=" + position + ", department=" + department
                + ", projects=" + projects + "]";
    }

}
