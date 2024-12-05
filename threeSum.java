	public static List<List<Integer>> threeSum(int num[], int t){
		Arrays.sort(num);
		Set<List<Integer>> res = new HashSet<>();
		int n = num.length;
		for(int i=0;i<n;i++) {
			int l = i+1;
			int r = n-1;
			while(l<r) {
				int sum = num[i]+num[l]+num[r];
				if(sum==t) {
					List<Integer> temp = new ArrayList<>();
					temp.add(num[i]);
					temp.add(num[l]);
					temp.add(num[r]);
					l++;
					r--;
					res.add(temp);
				}else if(sum>t) {
					r--;
				}else {
					l++;
				}
			}
		}return new ArrayList<List<Integer>>(res);
	}
