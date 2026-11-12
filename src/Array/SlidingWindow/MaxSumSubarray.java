package Array.SlidingWindow;

public class MaxSumSubarray {
    static void main() {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        maxSum(arr,k);
    }
    static void maxSum(int[]arr, int k){
        int max =0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        max = sum;
        for(int i=k;i<arr.length;i++){
            sum = sum - arr[i-k];
            sum= sum+arr[i];
            max = Math.max(max,sum);
        }
        System.out.print(max);
    }
}
