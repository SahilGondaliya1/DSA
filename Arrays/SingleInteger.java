import java.util.HashMap;

public class SingleInteger {
    public int singleInteger(int[] arr){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0 ;i < arr.length ; i++){
            if(!hash.containsKey(arr[i])){
                hash.put(arr[i],i);
            }
            else{
               hash.remove(arr[i]);
            }
        }
        for(int i : hash.keySet()){
            return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,3,2,1,0,0};
        SingleInteger a = new SingleInteger();
        int c = a.singleInteger(arr);
        System.out.print(c);
    }
}
