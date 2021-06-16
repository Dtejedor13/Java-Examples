import java.util.ArrayList;

public class Fibonacci {
    public static ArrayList<Integer> berechneFibo(int maxValue, int startValue) {
        ArrayList<Integer> results = new ArrayList<Integer>();

        results.add(startValue);
        results.add(startValue); // first time nothing happent

        do {
            int f1 = results.get(results.size() - 2); // get secondlast number
            int f2 = results.get(results.size() - 1); // get last number
            results.add(f1 + f2);
        } while (results.get(results.size() - 1) < maxValue);

        return results;
    }

    public static ArrayList<Integer> berechneFiboRecrusive(int maxValue, int startValue, ArrayList<Integer> numbers) {

        if (numbers.size() < 2) // first run
        {
            numbers.add(startValue);
            numbers.add(startValue);
        } else
            numbers.add(numbers.get(numbers.size() - 2) + numbers.get(numbers.size() - 1));
        // second last number + last number

        if (numbers.get(numbers.size() - 1) < maxValue)
            numbers = berechneFiboRecrusive(maxValue, startValue, numbers); // recrusive call

        return numbers;
    }
}
