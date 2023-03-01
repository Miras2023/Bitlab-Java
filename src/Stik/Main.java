package Stik;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream intStream=IntStream.range(20,101);
        intStream.filter(y->y%2==0).forEach(y-> System.out.println(y/2));
    }
}
