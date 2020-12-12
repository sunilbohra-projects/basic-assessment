
import com.basic.assessment.utils.MaxSumSubArray;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxSumSubArrayTest {

    @Test
    public void testEmptyArray() {
        assertEquals("Invalid", MaxSumSubArray.maxSumSubArray(2, new int[] {}));
    }

    @Test
    public void testMaxSum() {
        assertEquals("39", MaxSumSubArray.maxSumSubArray(4, new int[] {1,4,2,10,23,3,1,0,20}));
    }


    @Test
    public void testNegativeK() {
        assertEquals("Invalid", MaxSumSubArray.maxSumSubArray(-4, new int[] {1,4,2,10,23,3,1,0,20}));
    }


}

