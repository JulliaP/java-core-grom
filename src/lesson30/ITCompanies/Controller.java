package lesson30.ITCompanies;

import java.util.ArrayList;
import java.util.HashSet;

public class Controller {

    private EmployeesDAO employeeDAO = new EmployeesDAO();
    private ProjectDAO projectDAO = new ProjectDAO();

    public void addEmployee(Employee e) {
        employeeDAO.addEmployees(e);
    }

    public void addProject(Project p) {
        projectDAO.addProject(p);
    }

    public ArrayList<String> employeesByProject(String projectName) {

        ArrayList<Employee> employees = employeeDAO.findEmployee(projectName);
        ArrayList<String> employeesName = new ArrayList<>();

        if (employees == null) {

            System.out.println("No employees found working on project " + projectName);
            return null;

        }

        return employeesName;
    }

    public ArrayList<String> projectsByEmployee(Employee employee) throws Exception {

        ArrayList<Project> projects = employeeDAO.findProjectsByEmpoyee(employee);
        ArrayList<String> projectsName = new ArrayList<>();

        if (projects == null) {
            throw new Exception("Employee " + employee.getFirstName() + employee.getLastName() + " doesn't have any project");
        }
        for (Project pr : projects) {
            if (pr != null) {
                projectsName.add(pr.getName());
            }
        }
        return projectsName;
    }

    public ArrayList<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType) {

        ArrayList<Employee> employees = employeeDAO.findEmployeesByDepartamentWithoutProject(departmentType);

        if (employees == null) {

            System.out.println("No idle people in the department  " + departmentType);
            return null;
        }
        return employees;
    }

    public ArrayList<Employee> employeesWithoutAnyProject() {

        ArrayList<Employee> employees = employeeDAO.findEmployeesWithoutAnyProject();

        if (employees == null) {
            System.out.println("No idle people in the Firm");
            return null;
        }
        return employees;
    }

    public ArrayList<String> employeesByProjectEmployee(Employee employee) {

        ArrayList<Employee> employees = employeeDAO.findEmployeesByProjectEmployee(employee);
        ArrayList<String> employeesName = new ArrayList<>();

        if (employees == null) {
            System.out.println("No other employees working on the same projects");
            return null;

        }

        return employeesName;

    }

    public HashSet<Project> projectsByCustomer(Customer customer) {

        HashSet<Project> projects = employeeDAO.findProjectsByCustomer(customer);

        if (projects == null) {

            System.out.println("No projects for the given customer");
            return null;
        }
        return projects;
    }

    public HashSet<Employee> employeesByCustomerProject(Customer customer) {

        HashSet<Employee> employees = employeeDAO.findEmployeesByCustomerProject(customer);

        if (employees == null) {

            System.out.println("No employees for the given customer");
            return null;
        }
        return employees;
    }

    public ArrayList<String> employeesByTeamLead(Employee lead) {

        ArrayList<Employee> employees = employeeDAO.findEmployeesByTeamLead(lead);
        ArrayList<String> employeesName = new ArrayList<>();

        if (employees == null) {
            System.out.println("No other employees working on the same projects");
            return null;

        }

        return employeesName;

    }

    public ArrayList<String> findTeamLeadsByEmployee(Employee employee) throws Exception {

        ArrayList<Employee> TeamLeads = employeeDAO.findTeamLeadsByEmployee(employee);
        ArrayList<String> TeamLeadsNames = new ArrayList<>();

        if (TeamLeads == null) {
            throw new Exception("No team leads found");
        }

        return TeamLeadsNames;

    }
}