package classwork.Example.employee.storage;

import classwork.Example.employee.model.Employee;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (employees.length == size) {
            extend();
        }
        employees[size++] = employee;
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);

        }
    }

    public Employee getById(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;


    }
}
