import java.util.HashMap;

public class RansomNote {
    public Boolean harmlessRansomNote(String message , String magazineText){
      HashMap<String,Integer> noteWords = new HashMap();
      for (String word:message.split(" ")) {
          if (noteWords.containsKey(word)){
              int count = noteWords.get(word);
          }


      }
        return null;
    }
}
