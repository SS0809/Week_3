import main.java.binarysearch.Searchin2D;
import static org.junit.jupiter.api.Assertions.*;
        import org.junit.jupiter.api.Test;
public class SearchIn2DTest {
    @Test
    void testFileReader(){
        //Arrange && Act
        Searchin2D rd = new Searchin2D();

        int arr[][] = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };

        int key = 9;
        //Assert
        assertEquals(true, rd.binary(arr,key));
    }
}
