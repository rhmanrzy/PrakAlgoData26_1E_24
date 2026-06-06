package Praktikum14;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoArrayList24 {
    public static void main(String[] args) {
        Scanner sc24 = new Scanner(System.in);

        ArrayList<Customer24> customers = new ArrayList<>(2);

        Customer24 customer1 = new Customer24(1, "Zakia");
        Customer24 customer2 = new Customer24(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer24(4, "Cica"));

        customers.add(2, new Customer24(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        Customer24 customer = customers.get(1);
        System.out.println(customer.name24);
        customer.name24 = "Budi Utomo";

        for (Customer24 cust : customers) {
            System.out.println(cust);
        }
    }
}