package StreamAPI;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.*;

        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                ArrayList<Integer> array = new ArrayList<>();
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    array.add(sc.nextInt());
                }
                int max=array.get(0);
                array.stream().filter(elem->elem>max).forEach(elem-> System.out.print(max+" "));
            }
        }


