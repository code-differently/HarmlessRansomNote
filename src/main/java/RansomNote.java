import java.util.HashMap;

public class RansomNote {
    public Boolean harmlessRansomNote(String message , String magazineText){

        HashMap<String, Integer> messages = new HashMap<>();
        HashMap<String, Integer> magazineMessages = new HashMap<>();

        // split given message and text to create an array
        String[] messageArray = message.split(" ");

        String[] magazineMessageArray = magazineText.split(" ");

        for (String note : messageArray){
            // check if HashMap doesn't contain given word from the array
            if (!messages.containsKey(note)){

                // if not , add word to Hashmap
                messages.put(note, 0);
            }
            messages.put(note, messages.get(note) + 1);

        }

        for (String note : magazineMessageArray){
            if (!magazineMessages.containsKey(note)){

                magazineMessages.put(note, 0);
            }

        }


        return true;
    }
}
