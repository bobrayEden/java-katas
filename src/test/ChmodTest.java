import kata.Chmod;
import org.junit.Assert;
import org.junit.Test;

public class ChmodTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

/*    @Test
    public void testDecToBin000() throws Exception {
        Assert.assertEquals("000000000", Chmod.decToBin("000"));
    }

    @Test
    public void testDecToBin001() throws Exception {
        Assert.assertEquals("001001001", Chmod.decToBin("111"));
    }

    @Test
    public void testDecToBin002() throws Exception {
        Assert.assertEquals("000000010", Chmod.decToBin("002"));
    }

    @Test
    public void testDecToBin777() throws Exception {
        Assert.assertEquals("111111111", Chmod.decToBin("777"));
    }

    @Test
    public void testDecToBin456() throws Exception {
        Assert.assertEquals("100101110", Chmod.decToBin("456"));
    }
*/
    @Test
    public void testDecToBinrwxrwxrwx() throws Exception {
        Assert.assertEquals("rwxrwxrwx", Chmod.convert("777"));
    }

    @Test
    public void testDecToBinToutTiret() throws Exception {
        Assert.assertEquals("---------", Chmod.convert("000"));
    }
}
