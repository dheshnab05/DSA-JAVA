package Sorting;

import java.util.Arrays;

public class Bubble {
    static void main() {
        int[]arr= {5,3,8,1,2};
        bubble(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void bubble(int[]arr){
        boolean swapped;
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j+-1]=temp;
                    swapped=true;
                }
            }
            //if we did not swap for a particular value of i , it means that the array is sorted hence stop the program
            if(!swapped){
                break;
            }
        }
    }
}
