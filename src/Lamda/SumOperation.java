package Lamda;

public class SumOperation {
    Operator lamda=(a, b) -> a+b;
     public int getSum(int a, int b){
         return lamda.toOperate(a,b);
     }
}
