package classwork.homework1.employee;

import classwork.chapter7.Library.Book;
import classwork.chapter7.Library.BookStorage;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEE");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY EMPLOYEE ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEE BY COMPANY NAME");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input employee name");
                    String name = scanner.nextLine();
                    System.out.println("Please input employee surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employeeID");
                    String employeeId = scanner.nextLine();
                    System.out.println("Please input salary");
                    double salary = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input company");
                    String company = scanner.nextLine();
                    System.out.println("Please input position");
                    int position = Integer.parseInt(scanner.nextLine());
                    Employee employee = new Employee(name, surname, employeeId, salary, company, position);
                    employeeStorage.add(employee);
                    System.out.println("Employee ready!");
                    break;
                case "2":
                    System.out.println("All Employee");
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input employeeID");
                    String employeeid = scanner.nextLine();
                    employeeStorage.print();
                    break;
                case "4":
                    System.out.println("Please input company name");
                    company = scanner.nextLine();
                    employeeStorage.print();
                    break;
                default:
                    System.out.println("Invalid command! Try again");
            }
        }
    }
}