package _01_StringTrimmer;

public class StringTrimmer {

    /*
     * This method removes the specified number of characters from the right
     * side of the specified string and returns the trimmed string. 
     */
    static public String trimString(String str, int removesLeft) {
    	
        // 1. If there are no removes left
            if (removesLeft==0) {
            	System.out.println(removesLeft);
            	System.out.println(str);
				return str;
				
			}
            // 2. Return the string
            else {
            	StringBuilder builder = new StringBuilder(str);
            	str=builder.deleteCharAt(str.length()-1).toString();
            	
            	
            	 removesLeft= removesLeft-1;
            	 return trimString(str, removesLeft);
            	 
            }
           
            	
            		 
            	 
        // 3. Else you need to remove the last letter from the string,
        //    reduce removesLeft by 1, and then call trimString() 
			
            	
        
    }
}
