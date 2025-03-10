package LibraryManagment.User;

public class Librarian extends User{
    public Librarian(int userid, String username, String email, int phonenumber){
        super(userid, Role.LIBRARIAN,username,email, phonenumber);
    }
    public void performeRoleSpecificOperation(){
        System.out.println(getUsername() + "(LIBRARIAN) CAN ADD BOOKS");
    }
}
