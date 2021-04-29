import java.util.Map;
import java.util.HashMap;
public class DuplicateChar{
    public static void main(String[] args) {
        String str = "challenge";
        HashMap<Character, Integer>  ans= new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!ans.containsKey(str.charAt(i)))
                ans.put(str.charAt(i), 1);
            else
                ans.put(str.charAt(i),ans.get(str.charAt(i)) + 1);
        }

        for (Map.Entry mapElement : ans.entrySet()) {
            char key = (char)mapElement.getKey();
            int value = ((int)mapElement.getValue());
 
            if (value > 1)
                System.out.println(key + ", count = " + value);
        }
    }
}