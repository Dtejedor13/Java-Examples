import java.util.ArrayList;

public class QuerSumme {
    // Settings
    // final = not assigneble
    static final int NumberRangeMin = 0;
    static final int NumberRangeMax = 1000;
    static final int ViefachesStartValue = 2;

    public static int BerechneQueerSumme(int parm) {
        int sum = 0;
        while (parm != 0) {
            sum += parm % 10;

            parm = parm / 10;
        }
        return sum;
    }

    public static ArrayList<Integer> gibQuerSumme15Aus() {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = NumberRangeMin; i < NumberRangeMax; i++) {
            int check = BerechneQueerSumme(i);
            if (check == 15)
                result.add(i);
        }
        return result;
    }

    public static ArrayList<Integer> gibQuerSummeV17Aus(int condition) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = NumberRangeMin; i < NumberRangeMax; i++) {
            int check = BerechneQueerSumme(i);
            if (checkVielfachesVon(check, condition))
                result.add(i);
        }
        return result;
    }

    private static boolean checkVielfachesVon(int parm, int condition) {
        int i = ViefachesStartValue;
        while (!(parm < (condition * i))) {
            if (parm == (condition * i))
                return true;
            else
                i++;
        }
        return false;
    }
}
