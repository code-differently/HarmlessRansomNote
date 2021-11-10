import java.util.HashMap;
import java.util.Map;

public class RansomNote {   //do the words in msg hav an equal in magText
    //go thru all the words in mag
    // go thru all the words in msg
    //
    public Boolean harmlessRansomNote(String message , String magazineText){
        Integer counter = 0;
        Map<String, Integer> ransomWords = new HashMap<>();
        String [] wordSplit = message.split(" ");
        String [] magSplit = magazineText.split(" ");
        String currentLetter = " ";


        for (String mags: magSplit){
            currentLetter = mags;
            if(ransomWords.containsKey(mags)){
                counter = ransomWords.get(currentLetter);      

            }
        }

        //use whole words in the mag

        //return t/f

        return null;
    }
}
