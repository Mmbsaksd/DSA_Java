	public static int brs(int num[],int t) {
		int l=0, r = num.length-1;
		while(l<=r) {
			int m = (l+r)/2;
			if(num[m]==t) {
				return m;
			}else if(num[l]<=num[m]) {
				if(num[l]<=t && t<num[m]) {
					r = m-1;
				}else {
					l = m+1;
				}
			}else {
				if(num[m]<t && t<=num[r]) {
					l = m+1;
				}else {
					r = m-1;
				}
			}
		}return -1;
	}
