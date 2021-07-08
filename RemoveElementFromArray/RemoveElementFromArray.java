import java.util.ArrayList;
import java.util.List;

class RemoveElementFromArray {
    
    public static char[] Remove(char[] arr, char elementToRemove){
        if(arr == null)
            throw new NullPointerException("Array can´t be NULL"); 
        if(arr.length <= 0)
            throw new IllegalArgumentException("Arraysize can´t be lesser the 1");

        // Erstelle eine Neue Dynamische Liste für die Ausgabe
        List<Character> result = new ArrayList<Character>();

        // Fülle alle nicht zu entfernenden Elemente in die Liste
        for (Character item : arr)
            if(item != elementToRemove)
                result.add(item);
        // Convertiere die Liste zum Array und gebe sie Zurück
        return convertMyCharakterList(result);
    }

    private static char[] convertMyCharakterList(List<Character> list){
        // Erstelle neues Char Array für die Ausgabe
        char[] arr = new char[list.size()];
        // Fülle alle Elemente in das Char Array
        for(int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
        
        return arr;
    }
}
