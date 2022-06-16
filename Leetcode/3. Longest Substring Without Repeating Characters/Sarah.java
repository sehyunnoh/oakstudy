public static int lengthOfLongestSubstring(String s) {
		int frontIdx=0,rearIdx=0;
		int strLength = s.length();
		int maxLength = 0;
		Map<Character, Integer> strMap = new HashMap<Character, Integer>(); //store index
        
		for (rearIdx=0; rearIdx<strLength; rearIdx++) {
            // if char is repeated, update MaxLength, remove index
			if (strMap.get(s.charAt(rearIdx)) != null)  { 
                maxLength = Math.max(rearIdx-frontIdx, maxLength);	
				int previousIdx = strMap.get(s.charAt(rearIdx));
				while (frontIdx < previousIdx+1) {
					strMap.put(s.charAt(frontIdx), null);
					frontIdx++;
				}
			}
			strMap.put(s.charAt(rearIdx), rearIdx);			
		}
		
		return Math.max(rearIdx-frontIdx, maxLength);
	}
