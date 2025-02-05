import main.java.mystringbuilder.RemoveDuplicates;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class RemoveDuplicatesTest {
    @Test
    void removeduplicate(){
        //Arrange && Act
        RemoveDuplicates rd = new RemoveDuplicates( new StringBuilder("sauraabh"));
        //Assert
        assertEquals("saurbh",rd.sb.toString());
    }
}
