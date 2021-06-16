import java.util.ArrayList;
public class FibonacciProgramm {
    public static void main(String[] args) {
        ArrayList<Integer> fibonacciNumbers = Fibonacci.berechneFiboRecrusive(13, 1, new ArrayList<Integer>());
        for (Integer i : fibonacciNumbers) {
            System.out.println(i);
        }
    }
    
}