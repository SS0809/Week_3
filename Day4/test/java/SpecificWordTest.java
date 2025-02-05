import main.java.linearsearch.SpecificWord;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class SpecificWordTest {
    @Test
    void testFileReader(){
        //Arrange && Act
        SpecificWord rd = new SpecificWord();
        //Assert
        assertEquals(true,(rd.searchWord().equals("Ok this a longer sentence that is more longer ofcourse")));
    }
}
