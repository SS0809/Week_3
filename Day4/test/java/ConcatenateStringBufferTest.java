import main.java.mystringbuffer.ConcatenateStringBuffer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcatenateStringBufferTest {
    @Test
    void concattest(){
        //Arrange
        StringBuffer sb[] = {new StringBuffer("sa"),new StringBuffer("ura"),new StringBuffer("bh")};
        //Act
        ConcatenateStringBuffer csb = new ConcatenateStringBuffer(sb);
        //Assert
        assertEquals("saurabh",csb.concatenateString().toString());
    }
}
