package Praktikum14;

import java.util.Stack;

public class StackDemo24 {
    public static void main(String[] args) {
        Book24 book1 = new Book24("1234", "Dasae Pemrograman");
        Book24 book2 = new Book24("7145", "Hafalah Surat Delisa");
        Book24 book3 = new Book24("3562", "Muhammad Al-Fatih");

        Stack<Book24> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book24 temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book24 temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book24 book : books) {
            System.out.println(book.toString());
        }

        System.out.println(books);
    }
}
