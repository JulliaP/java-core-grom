package lesson30.ITCompanies;

import java.util.ArrayList;
import java.util.Collection;

public class Department {

    DepartmentType type;

    private ArrayList<Employee> employees = new ArrayList<>();

    public Department(DepartmentType type, ArrayList<Employee> employees) {
        this.type = type;
        this.employees = employees;
    }

    public DepartmentType getType() {
        return type;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setType(DepartmentType type) {
        this.type = type;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

}
