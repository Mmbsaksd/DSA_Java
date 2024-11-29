public static int stock_selling(int num[]) {
  int bp= Integer.MAX_VALUE;
  int p = Integer.MIN_VALUE;
  for(int i=0;i<num.length;i++) {
    if(num[i]<bp) {
      bp=num[i];
    }
    p = Math.max(p, num[i]-bp);
  }return p;
}
