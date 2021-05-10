public class SolucionB {
	final static char A = 'a';

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long resultado = 0;
    	int len = s.length();
        
    	if (len >= n) {
    		for (int i = 0; i < n; i++) {
    			if (s.charAt(i) == A) {
                	resultado++;
                }
    		}
    	} else {
    		long times = n / len;

    		for (int i = 0; i < len; i++) {
    			if (s.charAt(i) == A) {
                	resultado++;
                }
    		}
    		resultado *= times;
            for (int i = 0; i < n % len; i++) {
                if (s.charAt(i) == A) {
                	resultado++;
                }
            }
    	}

        return resultado;
    }
}
