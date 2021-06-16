import java.util.ArrayList;

public class QuerSummeProgramm {
    public static void main(String[] args) {
        System.out.println("Queersumme aus 101 ist = " + QuerSumme.BerechneQueerSumme(101));

        printArrays(QuerSumme.gibQuerSumme15Aus(), "Zahlen, deren Queersumme 15 ergibt");

        printArrays(QuerSumme.gibQuerSummeV17Aus(7), "Zahlen, deren Queersumme ein Vielfaches von 7 ergibt");
    }

    private static void printArrays(ArrayList<Integer> list, String additionalStringForConsole) {
        System.out.println(additionalStringForConsole);
        for (Integer e : list) {
            System.out.println(e);
        }
    }
    
}