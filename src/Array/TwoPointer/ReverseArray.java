package Array.TwoPointer;

public class ReverseArray {
    static void main() {
        int[]arr ={1,2,3,4,5,6,7};
        reverse(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    static int[] reverse(int[]arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }
}
