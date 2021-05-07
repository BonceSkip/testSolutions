import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolucionBTest {

    @Test
    public void testBOne(){

        String inputA = "aba";
        long startTime = System.currentTimeMillis();
        long result = SolucionB.repeatedString(inputA, 10);
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Time: " + endTime);
        assertEquals(7, result);
    }

    @Test
    public void testBTwo(){

        String inputA = "a";
        long startTime = System.currentTimeMillis();
        long result = SolucionB.repeatedString(inputA, new Long("1000000000000"));
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Time: " + endTime);
        assertEquals(new Long("1000000000000").longValue(), result);
    }

    @Test
    public void testBThree(){

        String inputA = "aadcdaccacabdaabadadaabacdcbcacabbbadbdadacbdadaccbbadbdcadbdcacacbcacddbcbbbaaccbaddcabaacbcaabbaaa";
        long startTime = System.currentTimeMillis();
        long result = SolucionB.repeatedString(inputA, new Long("942885108885"));
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Time: " + endTime);
        assertEquals(new Long("51574523448").longValue(), result);
    }
}
