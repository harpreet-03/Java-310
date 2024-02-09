class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int employeeId) {
        this.employee_id = employeeId;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String employeeName) {
        this.employee_name = employeeName;
    }

    public double getEmployeeSalary() {
        return employee_salary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employee_salary = employeeSalary;
    }

    public String getFormattedSalary() {
        return String.format("$%.2f", employee_salary);
    }

    public Employee(int eid, String name, double salary) {
        this.employee_id = eid;
        this.employee_name = name;
        this.employee_salary = salary;
    }
}

public class Employeee {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Harpreet Singh", 5000.78);

        System.out.println("Id: " + e1.getEmployeeId());
        System.out.println("Name: " + e1.getEmployeeName());
        System.out.println("Salary: " + e1.getFormattedSalary());

    }
}
