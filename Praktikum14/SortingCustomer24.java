package Praktikum14;

import java.util.ArrayList;

public class SortingCustomer24 {
    public static void main(String[] args) {

        ArrayList<Customer24> customers = new ArrayList<>();

        customers.add(new Customer24(1, "Zakia"));
        customers.add(new Customer24(2, "Budi"));
        customers.add(new Customer24(3, "Andi"));
        customers.add(new Customer24(4, "Cica"));

        customers.sort((c1, c2) -> c1.name24.compareTo(c2.name24));

        System.out.println(customers);
    }
}