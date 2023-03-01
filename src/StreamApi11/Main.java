package StreamApi11;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.random.RandomGenerator;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int m = sc.nextInt();
        int n;

        for (int i = 0; i < m; i++) {
            n = sc.nextInt() % 100;
            list.add(n);
        }
        System.out.print(list+" ");
        System.out.println();
       Optional<Integer>o=list.stream().max((x,y)->x-y).filter(elem->elem<50);
if(o.isPresent()){
    System.out.println(o);
    }
else{
    System.out.println("Limit");
}
    }
}