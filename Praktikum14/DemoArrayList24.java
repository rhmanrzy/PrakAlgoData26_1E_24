package Praktikum14;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoArrayList24 {
    public static void main(String[] args) {
        Scanner sc24 = new Scanner(System.in);

        ArrayList<Customer24> customers = new ArrayList<>();

        customers.add(new Customer24(1, "Zakia"));
        customers.add(new Customer24(5, "Budi"));

        ArrayList<Customer24> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer24(201, "Della"));
        newCustomers.add(new Customer24(202, "Victor"));
        newCustomers.add(new Customer24(203, "Sarah"));

        customers.addAll(newCustomers);

        for (Customer24 cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println(customers);
    }
}