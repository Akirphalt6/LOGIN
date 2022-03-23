package Model;
import View.AccountView;
import View.LoginView;

public class Menu{

    public void in(){
    
        MyInput myinput = new MyInput();

        System.out.println("Please select number");
        System.out.println("1.Let's create your an account");
        System.out.println("2.Let's Login to your an account");

        myinput.setNumber();
        myinput.getNumber();

        // 新規作成orログイン
        while(true){
            if(myinput.getNumber().equals("1") || myinput.getNumber().equals("2")){
                break;
            }else{
                System.out.println("Please select right number again");
                myinput.setNumber();
            }
        }
        if(myinput.getNumber().equals("1")){
            new AccountView().enter();
        }else{
            new LoginView().enter();
        }
    }    
}
