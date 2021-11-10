import java.util.HashMap;

public class RansomNote {
    public Boolean harmlessRansomNote(String message , String magazineText){
//A situation where the message is empty
            if(message==null){
                return false;
            }
//A situation where the length of the message is greater than the length of the magazineText
            if(message.length() > magazineText.length()){
                return false;
            }
//store the Magazine string element in the HashMap and keep count.
            HashMap<String, Integer> hm = new HashMap<String, Integer>();
            for(int i=magazineText.length()-1;i>=0;i--){
                if(hm.containsKey(magazineText(i))){
                    hm.put(magazineText(i), hm.get(magazineText(i)+1);
                }else{
                    hm.put(magazineText(i),1);
                }
            }
//Traverse through the Hash Map and compare the Message string elements to the MagazineText string elements.
// Subtract 1 from the value a matching string. If you find any value in the HashMap less than 0, you return false.
            for(int i=message.length()-1;i>=0;i--){
                if(hm.containsKey(message(i))){
                    hm.put(message(i), hm.get(message(i) - 1);
                    if(hm.get(message(i)) < 0){
                        return false;
                    }
                }else{
                    return false;
                }
            }
//Anything else should give a Yes.
            return true;
        }
    }
