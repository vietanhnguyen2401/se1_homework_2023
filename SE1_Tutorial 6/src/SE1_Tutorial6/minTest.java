package SE1_Tutorial6;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class minTest{
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                // create test case here
                { new int[] { 0, -9, 12, 123 }, -9 }, { new int[] { 0, 9, 12, 123 }, 0 },
                { new int[] { 0, 9, 12, -123 }, -123 }, { new int[] { 0 }, 0 }
        });
    }

    protected final int[] arr;
    protected final int expected;

    public minTest(int[] arr, int expected) {
        this.arr = arr;
        this.expected = expected;
    }
    @Test
    public void minTest() {
        int actual = SE1_Tutorial6.Arrays.min(arr);
        Assert.assertEquals(actual, expected);
    }
}
