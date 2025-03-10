package LibraryManagment.User;

import LibraryManagment.Book.Book;
import LibraryManagment.Book.BookStatus;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    private List<Book> borrwoed_books;
    public Student(int userid, String Username, String email, int phonenumber){
        super(userid, Role.STUDENT,Username,email, phonenumber);
        this.borrwoed_books = new ArrayList<>();
    }
    public void performeRoleSpecificOperation(){
        System.out.println(getUsername() + "(STUDENT) CAN BORROW BOOKS");
    }
    public void borrowBook(Book b){
        if (b.getStatus() == BookStatus.AVAILABLE){
            b.borrowBook();
            borrwoed_books.add(b);
            System.out.println(b.getBookTitle() + " has been borrowed by User " + getUsername());
        }
    }

    public void returnBook(Book b){
        if (borrwoed_books.contains(b)){
            b.returnBook();
            borrwoed_books.remove(b);
            System.out.println(b.getBookTitle() + " has been returned");
        }
        else{
            System.out.println(getUsername() + " has not borrowed " + b.getBookTitle());

        }
    }
}
