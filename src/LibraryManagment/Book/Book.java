package LibraryManagment.Book;

public class Book {
    private int Bookid;
    private String BookTitle;
    private String Author;
    private String Category;
    private BookStatus status;

    public Book( int Bookid,  String BookTitle, String Author, String Category,  BookStatus status){
        this.Bookid = Bookid;
        this.BookTitle = BookTitle;
        this.Author = Author;
        this.Category = Category;
        this.status = status;

    }
    public String getBookTitle(){
        return BookTitle;
    }
    public String getAuthor(){
        return Author;
    }
    public String getCategory(){
        return Category;
    }
    public void getBookDetails(){
        System.out.println("Book Details: ");
        System.out.println("Book ID --> " + Bookid);
        System.out.println("Book Title --> " + BookTitle);
        System.out.println("Book Author --> " + Author);
        System.out.println("Book Category --> " + Category);
        System.out.println("Book Status --> " + status);

    }
    public void updateBookDetails(int Bookid, String BookTitle, String Author, String Category, BookStatus status){
        this.Bookid = Bookid;
        this.BookTitle = BookTitle;
        this.Author = Author;
        this.Category = Category;
        this.status = status;
    }


    public BookStatus getStatus(){
        return status;
    }

    public void setStatus(BookStatus new_status){
        this.status = new_status;
    }

    public void borrowBook(){
        if (status == BookStatus.AVAILABLE){
            status = BookStatus.BORROWED;
            System.out.println(BookTitle + " has been borrowed!");
        }
        else{
            System.out.println(BookTitle + " is not available !!");
        }
    }

    public void returnBook(){
        if (status == BookStatus.BORROWED){
            status = BookStatus.AVAILABLE;
            System.out.println(BookTitle + " has been return successfully !!");
        }
        else{
            System.out.println(BookTitle + " has not been returned");
        }
    }


}
