import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public Boolean harmlessRansomNote(String message , String magazineText){
      String[] magazineArray = magazineText.split(" ");
      String[] messageArray = message.split(" ");

        Map<String, Integer> magazineParts = new HashMap<String, Integer>();
        Map<String, Integer> messageParts = new HashMap<String, Integer>();

        for(String word: magazineArray){
            if (!magazineParts.containsKey(word)) magazineParts.put(word, 0);
            magazineParts.put(word, magazineParts.get(word) + 1);
        }

        for(String word: messageArray){
            if (!messageParts.containsKey(word)) messageParts.put(word, 0);
            messageParts.put(word, messageParts.get(word) + 1);
        }

        for(String key: messageParts.keySet()){
            if (!magazineParts.containsKey(key)) return false;
            int needed = messageParts.get(key);
            if (magazineParts.get(key) < needed) return false;
        }

        return true;
    }
}
