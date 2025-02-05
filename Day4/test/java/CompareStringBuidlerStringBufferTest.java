import main.java.mystringbuffer.CompareStringBuidlerStringBuffer;
import org.junit.jupiter.api.Test;

public class CompareStringBuidlerStringBufferTest {
    @Test
    void compare(){
        //Arrange && Act
        CompareStringBuidlerStringBuffer rd = new CompareStringBuidlerStringBuffer();
        //Assert
        rd.main(new String[]{"ok"});
    }
}
