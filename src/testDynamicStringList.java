import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testDynamicStringList {

    @Test
    void testGet() {
        DynamicStringList arr = new DynamicStringList(new String[] {"pen", "pencil", "marker"});
        String acutal = arr.get(1);
        assertEquals("pencil", acutal);
    }

      @Test
    void testSet() {
        DynamicStringList arr = new DynamicStringList(new String[] {"pen", "pencil", "marker"});
        arr.set(2, "eraser");
        String actual = arr.get(2);
        assertEquals("eraser", actual);
    }
    
}
