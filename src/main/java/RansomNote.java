import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public Boolean harmlessRansomNote(String message, String magazineText) {
        HashMap map = new HashMap<>();
        for (int i = 0; i < message.length(); i++) {
            if (map.containsKey(message.charAt(i))) {
                map.put(message.charAt(i), map.get(message.charAt(i)));
            } else
                map.put(message.charAt(i), 1);
        }
        for (int i = 0; i < magazineText.length(); i++) {
            char ch = magazineText.charAt(i);
            if (map.containsKey(ch))
                map.put(ch, map.get(ch));
                return false;
            }
            return true;
        }
}
