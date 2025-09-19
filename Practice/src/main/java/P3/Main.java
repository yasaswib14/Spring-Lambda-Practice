package P3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService service = context.getBean(EmployeeService.class);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            System.out.print("ID: ");

            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Department: ");
            String department = scanner.nextLine();

            service.addEmployee(new Employee(id, name, salary, department));
        }


        System.out.println("Employees in IT:");
        service.getEmployeesByDepartment("IT").forEach(System.out::println);

        System.out.println("\nEmployees sorted by name:");
        service.getEmployeesSortedByName().forEach(System.out::println);

        System.out.println("\nTop Paid P3.Employee:");
        System.out.println(service.getTopPaidEmployee());

        context.close();
    }
}
