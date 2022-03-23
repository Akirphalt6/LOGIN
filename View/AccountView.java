package View;
import Model.Person;
import Controller.AccountController;

public class AccountView{

    public void enter(){
        
        Person person = new Person();
        AccountController accountController = new AccountController();

        //selected 1 
        accountController.getUsernamePassword(person);
        accountController.confirm(person);  

        accountController.save(person);
        accountController.returnMenu();

        

    }
    
}