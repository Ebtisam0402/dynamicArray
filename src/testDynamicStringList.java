import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testDynamicStringList {

    @Test
    void testGet() {
        DynamicStringList arr = new DynamicStringList(new String[] { "pen", "pencil", "marker" });
        String acutal = arr.get(1);
        assertEquals("pencil", acutal);
    }

    @Test
    void testSet() {
        DynamicStringList arr = new DynamicStringList(new String[] { "pen", "pencil", "marker" });
        arr.set(2, "eraser");
        String actual = arr.get(2);
        assertEquals("eraser", actual);
    }

    @Test
    void testAdd() {
        DynamicStringList arr = new DynamicStringList(new String[] { "pen", "pencil", "marker" });
        arr.add("eraser");
        assertEquals(4, arr.size());
        assertEquals("eraser", arr.get(3));

    }

    @Test
    void testRemove() {
        DynamicStringList arr = new DynamicStringList(new String[] { "pen", "pencil", "marker" });
        String actual = arr.remove(0);
        assertEquals("pen", actual);
    }

    @Test
    void testSize() {
        DynamicStringList arr = new DynamicStringList(new String[] { "pen", "pencil", "marker" });
        int actual = arr.size();
        assertEquals(3, actual);
    }


    @Test
    void testSizeAnother() {
        DynamicStringList arr = new DynamicStringList(new String[] { "pen", "pencil", "marker", "book" });
        int actual = arr.size();
        assertEquals(4, actual);
    }

    @Test
    void testCapacity() {
        DynamicStringList arr = new DynamicStringList(new String[] { "pen", "pencil", "marker" });
        int actual = arr.capacity();
        assertEquals(3, actual);
    }

    @Test
    void testCapacityMoreCapacity() {
        DynamicStringList arr = new DynamicStringList(new String[10]);
        arr.add("pen");
        int actual = arr.capacity();
        assertEquals(20, actual);
    }

}
