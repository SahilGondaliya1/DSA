import java.util.HashMap;

///problem statement : 
/// 1. integer array is given
/// 2. integer target is also given
/// 3. is there more than 2 numbers that fulfill the condition?  No right now 
/// 
/// 
/// time constraint ? just make it optimal.
/// 
/// 
/// brute force approach : I'll iterate throught this array to find pair which make the summation  of taraget.
/// this runs on N2 comlplexity.
/// 
/// to optimize this I can this think of hashmap(element , target-element);
///

public class TwoSum{
    public int[] better(int[] arr, int target){
        int[] pair =  new int[2];
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0 ; i < arr.length;  i++){                    
                    if(hash.containsKey(target-arr[i])){
                        pair[0] = arr[hash.get(target-arr[i])];
                        pair[1] = arr[i];
                        return pair;
                    }
                    hash.put(arr[i],i);             
            }
        return null;
     }
    
    public int[] bruteForce(int[] arr, int target){
        int[] pair = new int[2];
        for(int j = 0 ; j < arr.length ; j++){
            pair[0]= arr[j];
            int b = target - pair[0];
            for(int i = j ; i < arr.length ; i++){
                if(arr[i] == b){
                    pair[1] = b;
                    return pair;
                }
            }
        }
        return null;
    }
    public static void main(String[] args){ 
        int[] array  =  {1, 2,2,33,6, 9,1};
        int target  = 10;
        TwoSum s = new TwoSum();
        int[] pair1 = s.bruteForce(array, target);
        int[] pair2 = s.better(array, target);
        for(int i : pair2){
            System.out.print(i +" ");
        }
    }
}