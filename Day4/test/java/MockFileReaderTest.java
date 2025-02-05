import main.java.myfilereader.MockFileReader;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class MockFileReaderTest {
    @Test
    void testFileReader(){
        //Arrange && Act
        MockFileReader rd = new MockFileReader();
        //Assert
        assertEquals(true,rd.readFileLines());
    }
}
