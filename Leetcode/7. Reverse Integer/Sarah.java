class Solution {
    public int reverse(int x) {
        
        int newNum, digit=0;
        newNum = x % 10; 
          
        while (x/10 != 0) {
            x = x/10;  
            if (newNum > Integer.MAX_VALUE/10 || (newNum == Integer.MAX_VALUE/10) && x%10>7) return 0;
            if (newNum < Integer.MIN_VALUE/10 || (newNum == Integer.MIN_VALUE/10) && x%10<-8) return 0;
            newNum = newNum*10 + x%10;  
            
        }
        return newNum;
    }
}
