class RemoveElementMain {
    public static void main(String[] args) {        
        char[] test1 = new char[] { 'a', 'b', 'c', 'd', 'e'};       
        char[] test2 = new char[] { 'a', 'b', 'c', 'd', 'e', };
        char[] test3 = new char[] { 'a' };
        char[] test4 = null;
        char target1 = 'd';
        char target2 = 'f';
        char target3 = 'a';
        char target4 = 'a';

        System.out.println("Test 1");
        char[] result = RemoveElementFromArray.Remove(test1, target1);
        System.out.println(printArray(result));
        
        System.out.println("Test 2");
        result = RemoveElementFromArray.Remove(test2, target2);
        System.out.println(printArray(result));
        
        System.out.println("Test 3");
        result = RemoveElementFromArray.Remove(test3, target3);
        System.out.println(printArray(result));
        
        System.out.println("Test 4");
        result = RemoveElementFromArray.Remove(test4, target4);
        System.out.println(printArray(result));
    }

    private static String printArray(char[] arr){
        String result = "";
        for (char c : arr) {
            result += c + ", ";
        }
        return result;
    }
}