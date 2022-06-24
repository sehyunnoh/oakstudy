class Solution {
    public int myAtoi(String s) {
        String newStr = "";
        int signFlag = 1;
        //1. whitespace
        s = s.trim();
        
        if (s.length() == 0) return 0; //"   "
        //2.sign
        int i=0;
        if (s.charAt(0) == '-') {
            signFlag = -1;
            i++;
        } else if (s.charAt(0) == '+') { 
            i++;
        }
        //3.digit
		    while (i<s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
            	newStr += c;
            } else {
            	break;
            }
            i++;
        }
        
        //4. remove 0//5. range check
        if (newStr.length() == 0) return 0;
        else {
        	Double num = signFlag * Double.parseDouble(newStr);
        	
        	if (num >= (double)Integer.MAX_VALUE) {                
        		return Integer.MAX_VALUE;
        	} else if (num <= (double)Integer.MIN_VALUE) {
        	  return Integer.MIN_VALUE;
        	} else {
        	  return signFlag * Integer.parseInt(newStr);
        	}
        }
    }
}
