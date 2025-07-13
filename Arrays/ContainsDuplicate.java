import java.util.HashMap;

public class ContainsDuplicate {
    static void brute(int[] arr){
        boolean a = false;
        for(int i = 0 ; i < arr.length-1 ; i++){            
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j] == arr[i]){
                   a = true;
                }               
            }
        }
        System.out.print(a);
    }
    public boolean containsDuplicate(int[] arr){
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0 ;i < arr.length ; i++){
            if(hash.containsKey(arr[i])){
                return true;
            }
            else{
                hash.put(arr[i],i);
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,43,4343,2};
        ContainsDuplicate a  = new ContainsDuplicate();
        boolean hasDuplicate = a.containsDuplicate(arr);
        System.out.print(hasDuplicate);
        //brute(arr);

    }
}
