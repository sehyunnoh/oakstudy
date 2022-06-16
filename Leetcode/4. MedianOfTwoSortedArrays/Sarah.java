  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int totalLength = nums1.length + nums2.length;
		int[] mergedArr = new int[totalLength];
		
		int m=nums1.length, n=nums2.length;
		int i1=0, i2=0, i3=0;
		while (i1<m && i2<n) {
			if (nums1[i1] <= nums2[i2]) {
				mergedArr[i3] = nums1[i1];
				i1++;
			}
			else {
				mergedArr[i3] = nums2[i2];
				i2++;
			}
			i3++;
		}
		while (i1<m) {
			mergedArr[i3] = nums1[i1];
			i1++;
			i3++;
		}
		while (i2<n) {
			mergedArr[i3] = nums2[i2];
			i2++;
			i3++;
		}
		if ((nums1.length + nums2.length)%2 == 1) {
			return mergedArr[totalLength/2];
		} else {
			return (double)(mergedArr[totalLength/2-1] + mergedArr[totalLength/2])/2.0;
		}
	}
