package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String, Account> info = new HashMap<>();
        info.put("930131301430", new Account("Miras", "Moldashov", "Aktau"));
        info.put("920514548164", new Account("Aidos", "Jusupov", "Aktau"));
        info.put("951485648484", new Account("Jandos", "Kairatov", "Almaty"));
        info.put("960454478569", new Account("Baha", "Janilov", "Astana"));
        info.put("695115466546", new Account("Janserik", "Bakyt", "ALmaty"));
       String iin=sc.next();
       if(info.containsKey(iin)){
           System.out.println(info.get(iin).toString()+iin);}
       else{
           System.out.println("Account not found");

    }//Account Ilyas Zhuanyshev from Almaty has IIN number: 890102301734
}
    
    
}
