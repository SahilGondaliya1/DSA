/*You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

  */
import java.lang.Math;
public class MaxAvgSubArray1 {

    public static void findSubArrayAvg(int[] arr , int k){
        if(arr.length == 1) {
            System.out.print(arr[0]);
            return;
        }
        int l = 0 ;
        int r = k;
        double sum = 0;
        //create a window
        for(int i = l; i< r ; i++ ){
            sum += arr[i];
        }
        double avg = sum/k;
        double max = avg;

        //moving the window
        for(int i = r ; i < arr.length ; i++){
            avg -= (double)arr[i-k]/k;
            avg += (double)arr[i]/k;
            max = Math.max(avg,max);
        }
        System.out.print(max);
    }
    public static void main(String[] args){
        int[] arr = {1};
        int k = 4;
        findSubArrayAvg(arr,k);   
    }
}