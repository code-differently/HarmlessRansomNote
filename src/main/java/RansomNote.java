import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public Boolean harmlessRansomNote(String message , String magazineText){
        String[] magazineWords = magazineText.split(" ");
        String[] messageWords = message.split(" ");
        Map<String, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < magazineWords.length; i++) {
            if(magazineMap.containsKey(magazineWords[i])){
                magazineMap.put(magazineWords[i], magazineMap.get(magazineWords[i])+1);
            }else{
                magazineMap.put(magazineWords[i],1);
            }
        }

        for (int i = 0; i < messageWords.length; i++) {
            if (magazineMap.containsKey(messageWords[i])) {
                magazineMap.put(messageWords[i], magazineMap.get(messageWords[i])-1);
                if (magazineMap.get(messageWords[i]) < 0) {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return true;
//        System.out.println(Arrays.toString(messageWords));
//        System.out.println(Arrays.toString(magazineWords));
//        for (int i = 0; i < messageWords.length; i++) {
//            message.c
//        }



    }
}
