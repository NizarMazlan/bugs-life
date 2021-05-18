package assignmenttest1;

public class User {
    private String name, email, password;
    private static int userCount = 0;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        userCount++;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public boolean checkPassword(String password){
        return password.equals(this.password);
    }

    public String getName() {
        return name;
    }
    
    
    public String getEmail(){
        return this.email;
    }
}
