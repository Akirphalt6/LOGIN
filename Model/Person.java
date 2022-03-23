package Model;

import java.util.Scanner;

public class Person {

    Scanner scan;
    private String username,password;

    public Person(){
        this.scan = new Scanner(System.in);
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }
    
    public void setUsername(){
        String username = scan.next();
        this.username = username;
    }

    public void setPassword(){
        String password = scan.next();
        this.password = password;
    }
}