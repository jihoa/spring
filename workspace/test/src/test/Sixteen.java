/**
 * 
 */
package test;

/**
 * @author jiho-kim
 *
 *         신규개발
 */
public class Sixteen {

	/**
	 * @param args
	 */
    public String getDayName(int a, int b) {
        String answer = "";
        
        switch(a) {
            case 5:
                if(b % 7 == 1) answer = "SUN";
                if(b % 7 == 2) answer = "MON";
                
                
        }
        
        
        return answer;
    }
    
    
    public static void main(String[] args){
        Sixteen sol = new Sixteen();
        
        int a =5, b=2;
        
        System.out.println(sol.getDayName(a,b));
        
    }

}
