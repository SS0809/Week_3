import main.java.inputstreamreader.ByteStreamCharacterStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ByteStreamCharacterStreamTest {
    @Test
    void testFileReader(){
        //Arrange && Act
        ByteStreamCharacterStream rd = new ByteStreamCharacterStream();
        //Assert
        assertEquals(true,rd.runner());
    }
}
