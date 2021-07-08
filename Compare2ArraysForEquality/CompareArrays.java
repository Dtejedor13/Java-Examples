class CompareArrays {
    public static void main(String[] args) {
     
        int[][] arr1 = new int[][] { {3, 2, 1}, {2, 3, 1} };
        int[][] arr2 = new int[][] { {3, 2, 1}, {2, 3, 1} };
        boolean equal = EqualsArray.Equals(arr1, arr2);

        System.out.println("Die 2 gegebenen Arrays sind " + (equal ? "" : "nicht") + " gleich");
    }
}