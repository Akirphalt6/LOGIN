package Controller;
import Model.Person;
import Model.MyInput;
import Model.Menu;

import java.io.BufferedWriter;
// import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class AccountController {

    MyInput myinput;
    MyInput sure;

    public AccountController(){
        this.myinput = new MyInput();
        this.sure = new MyInput();
    }

    // アカウントの新規作成
    public void getUsernamePassword(Person person){
       
        System.out.println("Let's decide your username in this site");
        person.setUsername();

        System.out.println("Let's decide your password in this site at least 8 charcters");
        person.setPassword();

        while (true){
            if(person.getPassword().length() > 7){
                break;
            }else {
                System.out.println("Please input your password again at least 8 characters");
                person.setPassword();
            }
        }
    }

    // 新規ユーザー名とパスワード確認
    public void confirm(Person person){
        while (true){
            System.out.println("Usename : " + person.getUsername());
            System.out.println("Password: " + person.getPassword());
            System.out.println("Are you sure? y/n");
            String answer = sure.getAnswer();
            if(answer.equalsIgnoreCase("y")){
                
                break;
            }else if(answer.equalsIgnoreCase("n")){
                System.out.println("setting your username and password");
                this.getUsernamePassword(person); 
            }else{
                System.out.println("Please Input y/n");
            }

        }
    }

    // 新規ユーザー名とパスワードの保存
    public void save(Person person){
        Path path = Path.of("register.txt");
        try(BufferedWriter out = Files.newBufferedWriter(path, 
                                                         StandardOpenOption.CREATE,
                                                         StandardOpenOption.APPEND)){
            out.write(person.getUsername() + ",");
            out.write(person.getPassword() + "\n");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void returnMenu(){
        new Menu().in();
    }
}