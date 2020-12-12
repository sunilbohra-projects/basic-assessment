package com.basic.assessment.utils;

public class MaxSumSubArray {

    public static void main(String[] args) {
        System.out.println("Maximum sum of a subarray of size K:" +
                MaxSumSubArray.maxSumSubArray(2, new int[] { 100, 200, 300, 400}));

        System.out.println("Maximum sum of a subarray of size K:" +
                MaxSumSubArray.maxSumSubArray(4, new int[] { 1, 4, 2, 10, 23, 3, 1, 0, 20}));

        System.out.println("Maximum sum of a subarray of size K:" +
                MaxSumSubArray.maxSumSubArray(3, new int[] {2, 3}));

    }

    public static String maxSumSubArray(int k, int[] arr) {
            //Assuming we are testing only for positive numbers
            if(k <= 0) {
                return "Invalid";
            }

            int maxSum = 0;
            int baseSum = 0;
            int start = 0;
            for (int index = 0; index < arr.length; index++) {
                baseSum += arr[index];
                if (index >= k - 1) {
                    maxSum = Math.max(maxSum, baseSum);
                    baseSum = baseSum - arr[start];
                    start++;
                }
            }
            return maxSum == 0 ? "Invalid" : String.valueOf(maxSum);

        }
    }



