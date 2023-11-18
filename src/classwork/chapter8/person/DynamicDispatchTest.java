package classwork.chapter8.person;

public class DynamicDispatchTest {
    public static void main(String[] args) {
        Employee employee = new Employee("zenfira","djekdv","jfwkjnrf","03ri4535839","effe",4636,"rheth");
//        sendEmail(employee);
        System.out.println(employee.hashCode());
        Student student = new Student("Zenfira","Baghdasaryan","zenfira@mail.com","093190810");
        System.out.println(student);

    }

    public static void sendEmail(Person person) {
//        System.out.println(person.getName());
//        System.out.println(person.getSurname());
//        System.out.println("Sending email to" + person.getEmail());
        person.printHello();
    }


}

