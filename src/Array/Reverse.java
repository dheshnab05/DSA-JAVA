package Array;

import java.util.Arrays;

public class Reverse {
    static void main() {
        int[] arr = {1,2,3,4,5};
        /*
        swap(arr,1,2);
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]);
        }
        */
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[]arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            swap(arr,start, end);
            start++;
            end--;
        }
    }
    static void swap(int[]arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
