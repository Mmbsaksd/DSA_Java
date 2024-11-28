public static int waterTrapping(int num[]) {
    int waterLevel = 0;
    int n = num.length;
    int leftMax[] = new int[n];
    int rightMax[] = new int[n];
    
    // Calculate left max
    leftMax[0] = num[0];
    for (int i = 1; i < n; i++) {
        leftMax[i] = Math.max(leftMax[i - 1], num[i]);
    }
    
    // Calculate right max
    rightMax[n - 1] = num[n - 1];
    for (int i = n - 2; i >= 0; i--) {
        rightMax[i] = Math.max(rightMax[i + 1], num[i]);
    }
    
    // Calculate water level
    for (int i = 0; i < n; i++) {
        waterLevel += Math.min(rightMax[i], leftMax[i]) - num[i];
    }
    
    return waterLevel;
}
