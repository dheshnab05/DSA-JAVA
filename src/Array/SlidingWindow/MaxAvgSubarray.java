package Array.SlidingWindow;

public class MaxAvgSubarray {
    static void main() {
        int[]arr={1,12,-5,-6,50,3};
        int k=4;
        maxAvg(arr, k);
    }
    static void maxAvg(int[]arr,int k){
        int max=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        max=sum;
        for(int i=k;i< arr.length;i++){
            sum -= arr[i-k];
            sum += arr[i];
            max = Math.max(max,sum);
        }
        System.out.print((double)max/k);
    }
}
