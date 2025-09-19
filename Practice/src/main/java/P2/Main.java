package P2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config_2.xml");
        ProductService service = (ProductService) context.getBean("productService");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            service.addProduct(new Product(id, name, price));
        }


            System.out.println("Sorted by Name:");
        for (Product p : service.getProductsSortedByName()) {
            System.out.println(p);
        }

        System.out.println("\nSorted by Price:");
        Set<Product> sortedByPrice = service.getProductsSortedByPrice();
        sortedByPrice.addAll(service.getProductsSortedByName());
        for (Product p : sortedByPrice) {
            System.out.println(p);
        }
    }
}
