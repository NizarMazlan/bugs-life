package assignmenttest2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author miamz
 */
public class User {
    private String email, username, password;
    private ArrayList<User> list = new ArrayList<>();
    
    public User(String email, String username, String password){
        this.email = email;
        this.username = username;
        this.password = password;
        
    }
    
    public User(){}

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<User> getList() {
        try{
            Scanner in = new Scanner(new FileInputStream("User.txt"));
            while(in.hasNext()){
                String get = in.nextLine();
                String info[] = get.split(",");
                list.add(new User(info[0],info[1],info[2]));
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        if(list.isEmpty())
            return null;
        return list;
    }
    
}
