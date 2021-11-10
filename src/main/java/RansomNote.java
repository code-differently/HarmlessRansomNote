import java.util.HashMap;

public class RansomNote {
    public Boolean harmlessRansomNote(String message , String magazineText){
        String[] text = magazineText.split(" ");
        String[] ransom = message.split(" ");
        boolean valid = false;
        HashMap<String,Integer> words = new HashMap<>();
       for(int i = 0; i < magazineText.length(); i ++){
           //words.merge(text[i], 1, Integer::sum);
           if(!words.containsKey(text[i])){
               words.put(text[i],1);
           }else{
               Integer wrdAmt = words.get(text[i]);
               words.put(text[i], wrdAmt + 1);
           }
       }
        HashMap<String,Integer> Ranwords = new HashMap<>();
       for(int i = 0; i < message.length(); i ++){

           if(!Ranwords.containsKey(ransom[i])){
               Ranwords.put(ransom[i],1);
              // valid = false;
           }else {
               Integer wrdAmt = Ranwords.get(ransom[i]);
               Ranwords.put(ransom[i], wrdAmt +1);
              // valid = true;
           }
       }

       for(int i = 0; i < message.length(); i ++ ){
           if(!words.containsKey(ransom[i])){
               valid = false;
           }else {
               valid = true;
           }
       }




        return valid;
    }
}
