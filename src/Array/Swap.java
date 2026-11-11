package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Swap {
    static void main() {
        //int[]arr={1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        swap(arr,1,2);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    static void swap(ArrayList<Integer> arr, int index1, int index2){
        int temp = arr.get(index1);
        arr.set(index1,arr.get(index2));
        arr.set(index2,temp);
    }
}
