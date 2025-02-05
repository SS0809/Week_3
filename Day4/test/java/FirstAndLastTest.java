import static org.junit.jupiter.api.Assertions.*;

import main.java.binarysearch.FirstAndLast;
import org.junit.jupiter.api.Test;
public class FirstAndLastTest {
    @Test
    void testFileReader(){
        //Arrange && Act
        FirstAndLast rd = new FirstAndLast();
        int arr[] = {1, 22, 22, 5, 6, 8, 9};
        int tar = 22;
        //Assert
        rd.main(new String[]{"ok"});
    }
}
