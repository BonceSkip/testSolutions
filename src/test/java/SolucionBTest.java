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
        // dado que el input string tiene un largo de 100 y contiene 35 coincidencias de 'a',
        // se calcula 9428851088 * 35 = 330,009,788,080‬;
        // para llegar al número de caracteres se cuentan los 85 primeros, siendo: 
        // 'aadcdaccacabdaabadadaabacdcbcacabbbadbdadacbdadaccbbadbdcadbdcacacbcacddbcbbbaaccbadd'
        // y teniendo 27 coincidencias de 'a'
        // entonces el resultado final es 330,009,788,080 + 27 = 330,009,788,107
        assertEquals(new Long("330009788107").longValue(), result);
    }
}
