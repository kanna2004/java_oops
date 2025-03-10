package LibraryManagment.User;

public abstract class User {
    private int Userid;
    private Role role;
    private String Username;
    private String email;
    private int phonenumber;

    public User(int Userid, Role role, String Username, String email, int phonenumber){
        this.Userid = Userid;
        this.role = role;
        this.Username = Username;
        this.email = email;
        this.phonenumber = phonenumber;
    }
    public int getUId(){
        return Userid;
    }
    public Role getRole(){
        return role;
    }
    public String getUsername(){
        return Username;
    }
    public String getEmail(){
        return email;
    }
    public int getPhonenumber(){
        return phonenumber;
    }
    public void setRole(Role newRole){
        this.role = newRole;
    }
    public void getUserDetails(){
        System.out.println("User Id: " + Userid);
        System.out.println("User Role: " + role);
        System.out.println("User Name: " + Username);
        System.out.println("User email: " + email);
        System.out.println("User phonenumber: " + phonenumber);

    }
    public abstract void performeRoleSpecificOperation();

}
