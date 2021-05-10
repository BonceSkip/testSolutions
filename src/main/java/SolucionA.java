public class SolucionA {
	final static char U = 'U';
	final static char D = 'D';

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int valleys = 0;
        int altitude = 0;
        boolean enterV = false;
        
        for(int i = 0; i < n ; i++) { 
            char c = s.charAt(i);
            
            if (c == U) altitude++;
            else if (c == D) altitude--;
            
            if (altitude < 0 && !enterV) {
            	enterV = true;
            	valleys++;
            } else if (altitude >= 0) {
            	enterV = false;
            }
        }
        
        return valleys;
    }
}
