public static String convert(String s, int numRows) {
	        int length = s.length();
	        int numCols = 0;
	        int strLength = 0;
	        
	        if (length <= 1 || numRows <= 1 || numRows == length) return s;
	        while (strLength < length) {
	            strLength += numRows;
	            numCols++ ;
	            if (strLength < length) {
	            	if ((length-strLength) < (numRows-2)) {
	            		numCols += length-strLength;
	            		strLength += length-strLength;
	            		
	            	} else {
	            		strLength += numRows-2;
	            		numCols += numRows-2;
	            	}
	            }
	        }

	        char[][] zigzag = new char[numRows][numCols];
	        for (int a=0; a<zigzag.length; a++) {
	            for (int b=0; b<zigzag[0].length; b++) {
	               zigzag[a][b] = '0';   
	            }
	        }
	        int k=0,j=0,i=0;
	        while (i<length) {            
	            while (i<length && j<numRows) {
	                zigzag[j][k] = s.charAt(i++);
	                j++;
	            }
	            j--;
	            
	            while (i<length && j>1) {
	                j--;
	                k++;
	                zigzag[j][k] = s.charAt(i++);
	            }
	            j=0;
	            k++;
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        for (int a=0; a<zigzag.length; a++) {
	            for (int b=0; b<zigzag[0].length; b++) {
	                if (zigzag[a][b] != '0') 
	                  
                        sb.append(zigzag[a][b]);
	            }
	        }
	        return sb.toString();
	    }
