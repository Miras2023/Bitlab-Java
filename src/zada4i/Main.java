package zada4i;

import java.util.HashMap;
import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> football = new HashMap<>();
   String str;
   int goal;
        while(true){
            if(football.size()==5){break;}
       str=sc.next();
   goal=sc.nextInt();
  football.put(str,goal);
   }

        for (String goal1:football.keySet()){
           System.out.println(goal1+" scored "+football.get(goal1)+" goals in EPL");
        }




        }
    }




            




//        HashSet<Integer>intersect=new HashSet<>();
//        intersect.retainAll(hashok);
//        System.out.println(intersect);


    


//