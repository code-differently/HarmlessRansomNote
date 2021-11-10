import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RansomNoteTest {
    private RansomNote solution;
    private String magazineText;
    @BeforeEach
    public void setup(){
        solution = new RansomNote();
        magazineText =  "puerto rico is a great place you must hike far from town to find a secret "+
                "waterfall that i am an admirer of but note that it is not as hard as it seems "+
                "this is my advice for you";
    }

    @Test
    public void harmlessRansomNoteTestFail(){
        String noteText = "this is a secret note for you from a secret admirer";
        Boolean actual = solution.harmlessRansomNote(noteText, magazineText);
        Assertions.assertFalse(actual);
    }

    @Test
    public void harmlessRansomNoteTestPass(){
        String noteText = "this is a note for you from a secret admirer";
        Boolean actual = solution.harmlessRansomNote(noteText, magazineText);
        Assertions.assertTrue(actual);
    }
}


