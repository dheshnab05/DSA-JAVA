package Sorting;

import java.util.Arrays;

public class CyclicSort {
    static void main() {
        int[]arr={3,5,2,1,4};
        cyclic(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void cyclic(int[]arr){
        int i=0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                //swap if the element which is required to be in its correct position is not in its correct positon
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

    }
    static void swap(int[]arr,int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
