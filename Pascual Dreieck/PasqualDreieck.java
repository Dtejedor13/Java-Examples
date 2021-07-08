class PasqualDreieck {

    public static void PrintPasqualDreieck(int rows){
        if(rows < 1) throw new IllegalArgumentException("value canot be less then 1");
        System.out.println("Pasqual Dreieck ohne Array mit " + rows + " Ebenen");
        for(int i = 0; i <= rows; i++) {
            String rowString = "";
            // Baue die Einzelne Ebene des Pasqualischen Dreiecks
         for(int j = 0; j <= rows-i; j++){
            // fülle leere Stellen für das visuelle Dreieck
            rowString += " ";
         }
         for(int j = 0; j <= i; j++){
            // Fülle nach den leer Stellen die ergebnisse mit Leerzeichen aus 
            rowString += " "+ calcPasqualColumn(i, j);
            }
            // Gebe die fertige Ebene aus 
            System.out.println(rowString);
        }
    }

    public static void printPascalDreieckArr(int rows){
        if(rows < 1) throw new IllegalArgumentException("value canot be less then 1");
        System.out.println("Pasqual Dreieck mit Array und " + rows + " Ebenen");
        for(int i = 0; i < rows + 1; i++){
            int[] pasqualRow = calcPasqualRow(i);

            String resultString = "";
            for(int j = i; j <= rows; j++)
                resultString += " ";

            for(int k= 0; k < pasqualRow.length; k++)
                resultString += " " + pasqualRow[k];

            System.out.println(resultString);
        }
    }

    private static int[] calcPasqualRow(int row){
        if(row == 0) return new int[] { 1 };
        if(row == 1) return new int[] { 1, 1 };
        int[] previousRow = { 1, 1 };
        // Baue Pasqualisches Dreick Reihe ab der 2. Reihe
        for(int i = 2; i <= row; i++){
            int[] nextRow = new int[i + 1];
            nextRow[0] = 1;
            for(int j = 1; j < i; j++)
                nextRow[j] = previousRow[j - 1] + previousRow[j];

            nextRow[i] = 1;
            previousRow = nextRow;
        }
        return previousRow;
    }

    private static int calcPasqualColumn(int ebene, int r){
        return pasqualFactorial(ebene / ( pasqualFactorial(ebene-r) * pasqualFactorial(r)));
    }
    
    private static int pasqualFactorial(int ebene){
        int result;
        for(result = 1; ebene > 1; ebene--)
            result *= ebene;
        return result;
    }
}