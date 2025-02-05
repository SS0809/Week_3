import main.java.mystringbuilder.Reversestringbuilder;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReversestringbuilderTest {
    @Test
    void reversetest(){
        //Arrange
        Reversestringbuilder rsb = new Reversestringbuilder();
        //Act
        StringBuilder testString = rsb.runString();
        StringBuilder expected = new StringBuilder("): od i ekil em esrever");
        //Assert
        assertEquals(expected.toString(),testString.toString());
    }
}
