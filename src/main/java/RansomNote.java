import java.util.HashMap;

public class RansomNote {
    public Boolean harmlessRansomNote(String message, String magazineText) {
      String message = null;
////corner case 1.
//        if (note == null) {
//            System.out.println("No");
//            return;
//        }
////corner case 2.
//        if (note.length > magazine.length) {
//            System.out.println("No");
//            return;
//        }
//store the Magazine string array element in the HashMap and keep count.
        HashMap<String, Integer> mag = new HashMap<String, Integer>();
        for (int i = magazineText.length - 1; i >= 0; i--) {
            if (mag.containsKey(magazineText[i])) {
                mag.put(magazineText[i], mag.get(magazineText[i]) + 1);
            } else {
                mag.put(magazineText[i], 1);
            }
        }
//Traverse through the Hash Map and compare the Message string array elements to
// the MagazineTExt string array elements.
// Subtract 1 from the value a matching string.
// If you find anyvalue in the HashMap less than 0, you should print No.
        for (int i = message.length - 1; i >= 0; i--) {
            if (mag.containsKey(message[i])) {
                mag.put(message[i], mag.get(message[i]) - 1);
                if (mag.get(message[i]) < 0) {
                    System.out.println("No");
                    return message;
                }
            } else {
                System.out.println("No");
                return;
            }
        }
//Anything else should give a Yes.
        System.out.println("Yes");

    }
}
