import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolucionATest {

    @Test
    public void testAOne(){

        String inputA = "UDDDUDUU";

        int result = SolucionA.countingValleys(8, inputA);

        assertEquals(1, result);
    }

    @Test
    public void testATwo(){

        String inputA = "DDUUDDUDUUUD";

        int result = SolucionA.countingValleys(12, inputA);

        assertEquals(2, result);
    }

    @Test
    public void testAThree(){

        String inputA = "DDUDDUUDUU";

        int result = SolucionA.countingValleys(10, inputA);

        assertEquals(1, result);
    }
}
