package LibraryManagment;

import LibraryManagment.Book.*;
import LibraryManagment.User.*;

import static LibraryManagment.Book.BookStatus.AVAILABLE;
import static LibraryManagment.User.Role.STUDENT;


public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(01,"Hello World","Nirnajan","Fiction",AVAILABLE);
        Book b2 = new Book(02,"Hello python","Murali","Education",AVAILABLE);
        Book b3 = new Book(03,"Hello java","jeevan","science",AVAILABLE);
        Book b4 = new Book(04,"Hello mg","koushik","Fiction",AVAILABLE);

        Student s1 = new Student(10,"kkdfld","kfjojudofi@gmial.com",884893);
        s1.borrowBook(b1);
        b1.borrowBook();
        Student s2 = new Student(11,"kjdkjfdk","kfjlsfj@gmail.com", 78378723);
        s2.borrowBook(b1);
        s2.borrowBook(b2);
        s2.borrowBook(b3);
        s1.returnBook(b1);
        s2.returnBook(b4);


    }
}