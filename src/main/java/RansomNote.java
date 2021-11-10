import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public Boolean harmlessRansomNote(String message , String magazineText){
        Boolean match = false;
        Map<String, Integer> words = new HashMap<>();
        String[] arr = magazineText.split(" ");
        for (int i = 0; i < arr.length; i++){
            String currentWord = arr[i];
            if (words.containsKey(currentWord)){
                Integer currentCount = words.get(currentWord);
                currentCount++;
                words.put(currentWord, currentCount);
            } else
                words.put(currentWord, 1);
        }
        String[] messageArray = message.split(" ");
//        for (String wordsInMessage : messageArray){
//            if (wordsInMessage.)
//            match = true;
//
//        }
        Map<String, Integer> resultMap = new HashMap<>();

        for (String i : arr){
            Integer j = words.get(i);
            words.put(i, (j == null) ? 1 : j + 1);
        }
        for (Map.Entry<String, Integer> cor : words.entrySet()) {
            System.out.println("Element" + cor.getKey() + " " + "occurs" + ": " + cor.getValue() + "times");
            Boolean result = cor.getValue() > 1;
        }

        return match;
    }
}
