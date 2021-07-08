import java.util.Arrays;

class EqualsArray {

    public static boolean Equals(int[][] arr1, int[][] arr2){
        if(arr2 == null || arr2 == null)
            throw new NullPointerException("Keins der Arrays darf NUll sein");
        // Wenn einer der beiden Arrays keine Rows hat, sprich leer ist gebe false zurück    
        if(arr1.length == 0 || arr2.length == 0)
            return false;   
        // Wenn beide Arrays leer sind beende und gebe true zurück
        if(arr1.length == 0 && arr2.length == 0)
            return true;
        // Sortierte Arrays um sie besser vergleichen zu können
        int[][] arr1Sorted = sortMyArray(arr1);
        int[][] arr2Sorted = sortMyArray(arr2);
        // Geben Arrays zur Kontrolle aus 
        printControllArray(arr1Sorted, "Array 1 Sortiert:");
        printControllArray(arr2Sorted, "Array 2 Sortiert:");

        // Vergleiche sortierte Arrays
        for(int row = 0; row < arr1Sorted.length; row++){
            for(int column = 0; column < arr1Sorted[1].length; column++){
                try {
                    // Versuche zu vergleichen und gebe false zurück falls einer der werte null ist 
                    if(arr1Sorted[row][column] != arr2Sorted[row][column])
                        return false;
                } catch (NullPointerException e) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[][] sortMyArray(int[][] arr){
        int[][] sortedArray = new int[arr.length][arr[1].length];
        // Sortierte jede Row aus einem 2D Array einzeln
        for(int row = 0; row < arr.length; row++)
            // Erhalte eine Sortierte Reihe
            sortedArray[row] = getSortedArrayRow(arr[row]);
        
        return sortedArray;
    }

    private static int[] getSortedArrayRow(int[] arr){
        // Schnelle Array sortierung aus der Bib java.utils.Arrays
        Arrays.sort(arr);   
        return arr;
    }

    private static void printControllArray(int[][] arr, String zusatz){
        // Gebe das Array zur Kontrolle in der Konsole aus
        System.out.println(zusatz);
        for (int[] row : arr) {
            String resultRow = "";
            for (int item : row)
                resultRow +=  item + ", ";

            System.out.println(resultRow);
        }
    }
} 