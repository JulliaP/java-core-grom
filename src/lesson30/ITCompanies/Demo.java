package lesson30.ITCompanies;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();

        Customer customer1 = new Customer("SEPRA", "Sweden", 1598);
        Customer customer2 = new Customer("Bambora", "Sweden", 2001);

        ArrayList<Employee> employees = new ArrayList<>();

        Department department1 = new Department(DepartmentType.IT, employees);
        Department department2 = new Department(DepartmentType.FINANCE, employees);

        ArrayList<Project> projects1 = new ArrayList<>();

        Project MAS = new Project("MAS", customer1);
        Project MIS = new Project("MIS", null);
        Project CDM = new Project("CDM", customer2);
        projects1.add(MAS);
        projects1.add(MIS);
        projects1.add(null);

        ArrayList<Project> projects2 = new ArrayList<>();
        projects2.add(MAS);

        ArrayList<Project> projects3 = new ArrayList<>();
        projects3.add(MIS);
        // projects3.add(MAS);

        ArrayList<Project> projects4 = new ArrayList<>();
        projects4.add(CDM);

        System.out.println(projects1 + "show me what is inside projects1");
        System.out.println(projects2 + "show me what is inside projects2");
        Employee employee1 = new Employee("Jon", "Snow", null, Position.DEVELOPER, department1, projects1);
        Employee employee2 = new Employee("Aria", "Stark", null, Position.TEAM_LEAD, department1, projects2);
        Employee employee3 = new Employee("Ned", "Stark", null, Position.TEAM_LEAD, department1, projects3);
        Employee employee4 = new Employee("Daenerys", "Targaryen", null, Position.DESIGNER, department2, projects4);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        controller.addEmployee(employee1);
        controller.addEmployee(employee2);
        controller.addEmployee(employee3);
        controller.addEmployee(employee4);

        System.out.println(employees + "show me what is inside employees");

        // System.out.println(controller.employeesByProject("MAS") + "These employees work in the project MAS");
        // System.out.println(controller.projectsByEmployee(employee1) + employee1.getFirstName() +
        // employee1.getLastName() + " works in next projects");

        // System.out.println(controller.employeesByDepartmentWithoutProject(DepartmentType.IT) + "Est' li kto-to bez
        // rabpty v IT?");
        // System.out.println(controller.employeesWithoutAnyProject() + "Est' li kto-to bez rabpty vo vsex otdelax?");

        // System.out.println(controller.employeesByProjectEmployee(employee2) + " vse kto rabotaet vmeste s Aria");

        // System.out.println(controller.projectsByCustomer(customer1) + "Projects for SEPRA");
        // System.out.println(controller.employeesByTeamLead(employee2) + "Arias team members working on MAS");
        // System.out.println(controller.findTeamLeadsByEmployee(employee1) + " is TeamLeads");

        System.out.println(controller.employeesByCustomerProject(customer1) + "Employees working for SEPRA");
    }
}
