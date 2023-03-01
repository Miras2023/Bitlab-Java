package Lamda;

public class MultiplyOperation {
    Operator lako=(a, b) -> a*b;
    int getMultiplication(int a, int b){
        return lako.toOperate(a,b);
    }
}
