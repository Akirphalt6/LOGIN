package Controller;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.nio.file.Path;
import java.nio.file.Files;

public class MyFileReader {

    ArrayList<String> list = new ArrayList<String>();
    LoginController login = new LoginController();

     // ログインに必要なファイルを読み込む
     public ArrayList<String> getPerson(){
        Path path = Path.of("register.txt");
        try(BufferedReader in = Files.newBufferedReader(path)){
            String str = in.readLine();
            
            int USERNAME = 0;
            int PASSWORD = 1;
            while (str != null){
                String[] array = str.split(",");
                this.collectData(array[USERNAME]);
                this.collectData(array[PASSWORD]);                                  
                str = in.readLine();   
            }
            in.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return this.list;
        // finally{
        //     if(isMatch(person)){
        //         System.out.println("success");

        //     }else{
        //         System.out.println("fail");
        //         System.out.println("Your input data does not match!!!");
        //         System.out.println("---------------------------------");
        //     }
        // }
    }
     // ログイン照合
     public void collectData(String data){
        this.list.add(data);
    }
    
}
