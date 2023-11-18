package classwork.chapter8.person;

import java.util.Objects;

public class Employee extends Person {
    private String employeeId;
    private double salary;
    private String position;

    public Employee(Employee employee) {
        this.salary = employee.getSalary();
        this.employeeId = employee.getEmployeeId();
        this.position = employee.getPosition();
        setName(employee.getName());
        setSurname(employee.getSurname());

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Employee(this);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Employee() {
    }

    public Employee(String name, String surname, String email, String phone) {
        super(name, surname, email, phone);
    }

    public Employee(String employeeId, double salary, String position) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.position = position;
    }

    public Employee(String name, String surname, String email, String phone, String employeeId, double salary, String position) {
        super(name, surname, email, phone);
        this.employeeId = employeeId;
        this.salary = salary;
        this.position = position;
    }

    @Override
    public void printHello() {
        System.out.println("Hi guys!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(salary, employee.salary) != 0) return false;
        if (!Objects.equals(employeeId, employee.employeeId)) return false;
        return Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = employeeId != null ? employeeId.hashCode() : 0;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }
}
