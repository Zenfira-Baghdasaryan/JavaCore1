package classwork.Example.employee;

import classwork.Example.employee.model.Company;
import classwork.Example.employee.model.Employee;
import classwork.Example.employee.storage.CompanyStorage;
import classwork.Example.employee.storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeManagementMain {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();
}
//    public static void main(String[] args) {
//        boolean isRun = true;
//        while (isRun) {
//            printCommands();
//            String command = scanner.nextLine();
//            switch (command) {
//                case "0":
//                    isRun = false;
//                    break;
//                case "1":
//                    addCompany();
//                    break;
//                case "2":
//                    addEmployee();
//                    break;
//                case "3":
//                    companyStorage.print();
//                    break;
//                case "4":
//                    employeeStorage.print();
//                    break;
//                case "5":
//                    searchEmployeeById();
//                    break;
//                case "6":
//                    searchEmployeeByCompany();
//                    break;
//                case "7":
//                    deleteCompany():
//                    break;
//                case "8":
//                    deleteEmployee();
//                    break;
//                case "9":
//                    changeCompany();
//                    break;
//                case "10":
//                    changeEmployee();
//                    break;
//                default:
//                    System.out.println("Invalid command.Try again!");
//            }
//        }
//
//    }
//
//    private static void addEmployee() {
//        System.out.println("Please choose company id");
//        companyStorage.print();
//        String companyId = scanner.nextLine();
//        Company companyFromStorage = companyStorage.getById(companyId);
//        if (companyFromStorage != null) {
//            System.out.println("Company with" + companyId + "already exist!");
//            return;
//        }
//        System.out.println("please input employee id");
//        String employeeId = scanner.nextLine();
//        Employee employeeFromStorage = employeeStorage.getById(employeeId);
//        if (employeeFromStorage != null) {
//            System.out.println("Employee with" + employeeId + "id already exist!");
//            return;
//        }
//        System.out.println("please input employee name");
//        String employeeName = scanner.nextLine();
//        System.out.println("please input employee surname");
//        String employeeSurName = scanner.nextLine();
//        System.out.println("please input employee phone");
//        String employeePhone = scanner.nextLine();
//        System.out.println("please input employee position");
//        String employeePosition = scanner.nextLine();
//        System.out.println("please input employee salary AMD");
//        double employeeSalary = Double.parseDouble(scanner.nextLine());
//        Employee employee = new Employee(employeeId, employeeName, employeeSurName, employeePhone, employeeSalary,employeePosition,companyFromStorage);
//
//    }
//
//    private static void addEmployee() {
//        System.out.println("please choose company id");
//        companyStorage.print();
//        String companyId = scanner.nextLine();
//        Company companyFromStorage = companyStorage.getById(companyId);
//        if (companyFromStorage == null) {
//            System.out.println("Company with" + companyId + "does not exists!");
//            return;
//        }
//        System.out.println("please input employee id");
//        String employeeId = scanner.nextLine();
//        Employee employeeFromStorage = employeeStorage.getById(employeeId);
//        if (employeeFromStorage != null) {
//            System.out.println("employee with " + employeeId + "id already exists!");
//            return;
//        }
//        System.out.println("please input employee name");
//        String employeeName = scanner.nextLine();
//        System.out.println("please input employee surname");
//        String employeeSurname = scanner.nextLine();
//        System.out.println("please input employee phone");
//        String employeePhone = scanner.nextLine();
//        System.out.println("please input employee position");
//        String employeePosition = scanner.nextLine();
//        System.out.println("please input employee salary AMD");
//        double employeeSalary = Double.parseDouble(scanner.nextLine());
//        Employee employee = new classwork.homework1.employee.model.Employee(employeeId, employeeName, employeeSurname, employeePhone, employeeSalary, employeePosition, companyFromStorage);
//        employeeStorage.add(employee);
//        System.out.println("Employee registered!");
//    }
//
//    private static void printCommands() {
//        System.out.println("Please input 0 for EXIT");
//        System.out.println("Please input 1 for ADD_COMPANY");
//        System.out.println("Please input 2 for ADD_EMPLOYEE");
//        System.out.println("Please input 3 for PRINT_ALL_COMPANIES");
//        System.out.println("Please input 4 for PRINT_ALL_EMPLOYEES");
//        System.out.println("Please input 5 for SEARCH_EMPLOYEE_BY_ID");
//        System.out.println("Please input 6 for SEARCH_EMPLOYEE_BY_COMPANY");
//        System.out.println("Please input 7 for DELETE_COMPANY");
//        System.out.println("Please input 8 for DELETE_EMPLOYEE");
//        System.out.println("Please input 8 for CHANGE_COMPANY");
//        System.out.println("Please input 8 for CHANGE_EMPLOYEE");
//
//    }
//}
