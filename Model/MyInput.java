package Model;

import java.util.Scanner;

public class MyInput {


    private String number;
    Scanner scan;

    public MyInput(){
        this.scan = new Scanner(System.in);
    }

    
    public String getNumber(){
        return number;
    }

    public void setNumber(){
        String number = this.scan.next();
        this.number = number;
    }

    public String getAnswer(){
        return scan.next();
    }
    
}
