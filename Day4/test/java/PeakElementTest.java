import main.java.binarysearch.PeakElement;

import static main.java.binarysearch.PeakElement.findPeakElement;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PeakElementTest {
    @Test
    void testFileReader(){
        //Arrange && Act
        PeakElement rd = new PeakElement();

        int arr[] = {1,2,3,1};
        //Assert
        assertEquals(2,findPeakElement(arr));
    }
}
