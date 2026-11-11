package Array;

public class Max {
    static void main() {
        int arr[]={1,2,6,5,10};
        //System.out.println(max(arr));
        System.out.print(maxRange(arr,1,3));
    }
    static int max(int []arr){
        int maxVal = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    //max value in a range
    static int maxRange(int[]arr,int start, int end){
        if(end>start){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int maxVal = arr[start];
        for(int i=start;i<end;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
