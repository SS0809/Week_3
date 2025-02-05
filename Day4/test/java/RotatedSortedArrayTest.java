import main.java.binarysearch.RotatedSortedArray;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class RotatedSortedArrayTest {
    @Test
    void testFileReader(){
        //Arrange && Act
        int arr[] = {4,5,6,7,0,1,2};
        RotatedSortedArray rsa = new RotatedSortedArray();
        //Assert
        assertEquals(4,(rsa.binarySearch(arr)));
    }
}
