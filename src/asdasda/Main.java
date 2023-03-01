package asdasda;

import java.util.stream.Collectors;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        System.out.println("Sorted first array: ");
        nums.stream().sorted().forEach(x -> System.out.print(x + " "));
        ArrayList<Integer> nums2 = new ArrayList<>();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            nums2.add(sc.nextInt());
        }
        System.out.println("Sorted second array: ");
        nums2.stream().sorted().forEach(x-> System.out.print(x+" "));
        System.out.println();
        nums.addAll(nums2);
        System.out.println("Sorted third array:");
        nums.stream().sorted().forEach(x-> System.out.print(x+" "));

//products.stream()
//.sorted(Product::compareByPrice)
//.forEach(System.out::println);
    }
}
