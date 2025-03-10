package LibraryManagment.Book;

public class BookItem {
    private String BarCode;
    private BookStatus Status;
    public BookItem(String BarCode){
        this.BarCode = BarCode;
        this.Status = BookStatus.AVAILABLE;
    }
    public String getBarCode(){
        return BarCode;
    }
    public BookStatus getStatus(){
        return Status;
    }
    public void updateStatus( BookStatus new_status){
        this.Status = new_status;
    }
}
