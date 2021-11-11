import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public Boolean harmlessRansomNote(String message , String magazineText){
        String[] text = magazineText.split(" ");
        String[] ransom = message.split(" ");
        boolean valid = false;
        HashMap<String,Integer> words = new HashMap<>();
       for(int i = 0; i < text.length; i ++){
           //words.merge(text[i], 1, Integer::sum);
           if(!words.containsKey(text[i])){
               words.put(text[i],1);
           }else{
               Integer wrdAmt = words.get(text[i]);
               words.put(text[i], wrdAmt + 1);
           }
       }
        HashMap<String,Integer> messWords = new HashMap<>();
       for(int i = 0; i < ransom.length; i ++){

           if(!messWords.containsKey(ransom[i])){
               messWords.put(ransom[i],1);
              // valid = false;
           }else {
               Integer wrdAmt = messWords.get(ransom[i]);
               messWords.put(ransom[i], wrdAmt +1);
              // valid = true;
           }
       }

       for(Map.Entry<String, Integer> entry: messWords.entrySet()) {
           String key = entry.getKey();
           Integer count = entry.getValue();
           if(!words.containsKey(key)){
               valid = false;
               break;
           }
           Integer currentCount = words.get(key);
           if(currentCount < count){
               valid = false;
               break;
           }
           valid = true;
       }






        return valid;
    }
}
