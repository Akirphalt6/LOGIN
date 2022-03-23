package Controller;
import Model.Person;
import Model.MyInput;



import java.util.ArrayList;


public class LoginController {
    
    MyInput myinput;
    MyInput sure;
    Person person = new Person();

    public LoginController(){
        this.myinput = new MyInput();
        this.sure = new MyInput();
    }

    // ログインに必要なユーザー名とパスワード
    public void InputUsernamePassword(){

        System.out.println("Please input your username");
        person.setUsername();

        System.out.println("Please input your password in this site at least 8 charcters");
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

    // public boolean isMatch(){

    //     ArrayList<String> list = new MyFileReader().getPerson();
        
    // }

    // 二行表示
    public boolean isMatch(){

        ArrayList<String> list = new MyFileReader().getPerson();

        for(int i = 0; i < list.size(); i = i + 2){
            boolean userNameResult = person.getUsername().equals(list.get(i));
            boolean userPasswordResult = person.getPassword().equals(list.get(i + 1));

            if(userNameResult && userPasswordResult){
               return true;
            }
        }
        return false;
    }


    public void login(){

        this.InputUsernamePassword();

        while(!this.isMatch()){
            System.out.println("fail!");
            this.InputUsernamePassword();
        }
        System.out.println("success!");
    }

}