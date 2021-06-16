public class Buchstaben {
    public static char[] ordneBuchstaben2(char letter1, char letter2, char letter3) {
        char[] result = new char[3];

        // #region Bubblesort like Sort
        if (letter1 > letter2 && letter1 > letter3) {
            result[2] = letter1;

            if (letter2 > letter3) {
                result[1] = letter2;
                result[0] = letter3;
            } else if (letter3 > letter2) {
                result[1] = letter3;
                result[0] = letter2;
            }
        }

        else if (letter2 > letter1 && letter2 > letter3) {
            result[2] = letter2;

            if (letter3 > letter1) {
                result[1] = letter3;
                result[0] = letter1;
            } else if (letter1 > letter3) {
                result[1] = letter1;
                result[0] = letter3;
            }
        }

        else if (letter3 > letter1 && letter3 > letter2) {
            result[2] = letter3;

            if (letter2 > letter1) {
                result[1] = letter2;
                result[0] = letter1;

            } else if (letter1 > letter2) {
                result[1] = letter1;
                result[0] = letter2;

            }
        }
        // #endregion

        return result;
    }
}
