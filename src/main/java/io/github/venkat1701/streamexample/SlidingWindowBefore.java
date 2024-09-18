package io.github.venkat1701.streamexample;

public class SlidingWindowBefore {
    public static int maxSumSubArray(int[] arr, int k) {
        int n = arr.length;
        if(n<k) {
            System.out.println("Invalid input");
            return -1;
        }

        int windowSum = 0;
        for(int i = 0; i<k; i++) {
            windowSum+=arr[i];
        }

        int maxSum = windowSum;
        for(int i = k; i<n; i++) {
            windowSum = windowSum - arr[i-k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(maxSumSubArray(arr, k));
    }
}
