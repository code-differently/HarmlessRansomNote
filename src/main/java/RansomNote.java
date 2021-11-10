import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public Boolean harmlessRansomNote(String message, String magazineText){
        //make maps to compare matching keys
        //if keys match, does magazine values > message values
        String[] messArray = message.split("[\\s]");
        Map<String, Integer> messMap = new HashMap<>();

        for(int i = 0; i < messArray.length; i++){
            if(!messMap.containsKey(messArray[i])){
                messMap.put(messArray[i], 1);
            } else{
                int count = messMap.get(messArray[i]);
                count++;
                messMap.put(messArray[i], count);
            }
        }

        System.out.println(messMap);

        String[] magTextArr = magazineText.split("[\\s]");
        Map<String, Integer> magTextMap = new HashMap<>();

        for(int i = 0; i< magTextArr.length; i++){
            if(!magTextMap.containsKey(magTextArr[i])){
                magTextMap.put(magTextArr[i],1);
            } else {
                int count = magTextMap.get(magTextArr[i]);
                count++;
                magTextMap.put(magTextArr[i], count);
            }
        }

        System.out.println(magTextMap);
        //compare key sets
        if(messMap.keySet() == magTextMap.keySet()){
            return true;
        }

        return false;
    }
}
