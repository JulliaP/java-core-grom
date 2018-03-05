package lesson30.ITCompanies;

import java.util.ArrayList;
import java.util.HashSet;

public class EmployeesDAO {

    private static ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployees(Employee e) {
        employees.add(e);
    }

    public ArrayList<Employee> findEmployee(String projectName) {

        ArrayList<Employee> employees1 = new ArrayList<>();
        System.out.println(employees + "Visa mig employees i findEmployees");

        for (Employee employee : employees) {

            ArrayList<Project> employeeProjects = employee.getProjects();

            if (employeeProjects != null) {

                for (Project project : employeeProjects) {

                    if (project != null) {

                        if (project.getName().equals(projectName)) {
                            employees1.add(employee);
                            System.out.println("Added to employees1");
                        }
                    }
                }
            }
        }

        return employees1;
    }

    public ArrayList<Project> findProjectsByEmpoyee(Employee employee) {

        ArrayList<Project> employeeProjects = employee.getProjects();
        if (employeeProjects == null) {
            return null;

        }

        return employeeProjects;

    }

    public ArrayList<Employee> findEmployeesByDepartamentWithoutProject(DepartmentType departmentType) {

        ArrayList<Employee> employees2 = new ArrayList<>();

        for (Employee emp : employees) {

            Department department = emp.getDepartament();
            ArrayList<Project> projects = emp.getProjects();

            if (department.getType().equals(departmentType) && projects == null) {

                employees2.add(emp);
                System.out.println("Added to employees2");

            }
        }

        return employees2;
    }

    public ArrayList<Employee> findEmployeesWithoutAnyProject() {

        ArrayList<Employee> employeesWithoutProject = new ArrayList<>();

        for (Employee emp : employees) {

            ArrayList<Project> projects = emp.getProjects();

            if (projects == null) {

                employeesWithoutProject.add(emp);
                System.out.println("Added to employees2");

            }

        }

        return employeesWithoutProject;
    }

    public ArrayList<Employee> findEmployeesByProjectEmployee(Employee employee) {

        ArrayList<Employee> EmployeesByProjectEmployee = new ArrayList<>();

        ArrayList<Project> employeeProjects = employee.getProjects();

        for (Project project : employeeProjects) {

            for (Employee emp : employees) {

                if (emp.getFirstName() != employee.getFirstName() || emp.getLastName() != employee.getLastName()) {

                    ArrayList<Project> empProjects = emp.getProjects();
                    if (empProjects != null) {
                        for (Project pr : empProjects) {

                            if (pr != null) {

                                if (pr.getName().equals(project.getName())) {
                                    EmployeesByProjectEmployee.add(emp);
                                    System.out.println("Added to EmployeesByProjectEmployee");

                                }
                            }
                        }
                    }
                }
            }
        }
        return EmployeesByProjectEmployee;
    }

    public ArrayList<Employee> findEmployeesByTeamLead(Employee lead) {

        ArrayList<Employee> EmployeesByTeamLead = new ArrayList<>();

        ArrayList<Project> TeamLeadsProjects = lead.getProjects();

        for (Project project : TeamLeadsProjects) {

            for (Employee emp : employees) {

                ArrayList<Project> empProjects = emp.getProjects();

                if (empProjects != null && !emp.getFirstName().equals(lead.getFirstName())) {
                    for (Project pr : empProjects) {

                        if (pr != null) {

                            if (project.getName().equals(pr.getName())) {
                                EmployeesByTeamLead.add(emp);
                                System.out.println("Added to EmployeesByTeamLead");
                            }
                        }
                    }
                }
            }

        }
        return EmployeesByTeamLead;
    }

    public ArrayList<Employee> findTeamLeadsByEmployee(Employee employee) {

        ArrayList<Employee> TeamLeads = new ArrayList<>();

        ArrayList<Project> EmployeesProjects = employee.getProjects();

        for (Project project : EmployeesProjects) {
            if (project != null) {
                for (Employee emp : employees) {

                    boolean isTeamLeader = checkIfEmployeeIsTeamLead(emp);
                    ArrayList<Project> empProjects = emp.getProjects();

                    if (!emp.getFirstName().equals(employee)) {
                        if (isTeamLeader) {

                            if (empProjects != null) {

                                for (Project pr : empProjects) {

                                    if (pr != null) {

                                        if (project.getName().equals(pr.getName())) {
                                            TeamLeads.add(emp);
                                            System.out.println("Added to TeamLeads");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return TeamLeads;
    }

    public HashSet<Project> findProjectsByCustomer(Customer customer) {

        HashSet<Project> CustomerProjects = new HashSet<>();

        for (Employee emp : employees) {

            ArrayList<Project> EmployeesProjects = emp.getProjects();
            for (Project pr : EmployeesProjects) {
                if (pr != null) {
                    if (pr.getCustomer() == customer) {
                        CustomerProjects.add(pr);
                    }
                }
            }
        }
        return CustomerProjects;
    }

    public HashSet<Employee> findEmployeesByCustomerProject(Customer customer) {

        HashSet<Employee> EmployeesByCustomerProjects = new HashSet<>();

        for (Employee emp : employees) {

            ArrayList<Project> EmployeesProjects = emp.getProjects();
            for (Project pr : EmployeesProjects) {
                if (pr != null) {
                    if (pr.getCustomer() == customer) {
                        EmployeesByCustomerProjects.add(emp);
                    }
                }
            }
        }
        return EmployeesByCustomerProjects;
    }

    private boolean checkIfEmployeeIsTeamLead(Employee employee) {
        if (employee.getPosition().equals(Position.TEAM_LEAD)) {
            System.out.println("Yes, he/she is Team Lead");
            return true;
        }
        return false;
    }

}
