import main.java.linearsearch.FirstNegativeNumber;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class FindOccuranceTest {
    @Test
    void testFileReader(){
        //Arrange && Act
        FirstNegativeNumber rd = new FirstNegativeNumber();
        //Assert
        assertEquals(true,(rd.findNegative()!=-1));
    }
}
