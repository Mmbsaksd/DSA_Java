public class MaxSubarraySumBruteForce {
    public static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum (Brute Force): " + maxSubarraySum(arr));
    }
}

public class MaxSubarraySumPrefixSum {
    public static int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        
        // Calculate prefix sums
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        int maxSum = Integer.MIN_VALUE;
        
        // Find the max sum using prefix sums
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentSum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum (Prefix Sum): " + maxSubarraySum(arr));
    }
}
public class MaxSubarraySumKadane {
    public static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int num : arr) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum (Kadane's Algorithm): " + maxSubarraySum(arr));
    }
}

