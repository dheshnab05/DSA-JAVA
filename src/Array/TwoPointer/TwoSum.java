package Array.TwoPointer;

public class TwoSum {
    static void main() {
        int[]arr={2,7,11,15};
        int target=9;
        twoSum(arr, target);
    }
    static void twoSum(int[]arr, int target){
        int left=0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                System.out.println(left+" "+right);
                return;
            }
            else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("not found");
    }
}
