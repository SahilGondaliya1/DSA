import java.util.Scanner;
import java.util.HashMap;
class LongestSubStr{
    public static String longestSubStrMethod(String str){
        HashMap<Character, Integer> hash = new HashMap<>();
        int l = 0;
        int r = 0;
        int n = str.length();
        int len  = 0;
        int start =l;
        while(r < n){
            char curr = str.charAt(r);
            if(hash.containsKey(curr) && hash.get(curr) >= l){
                l = hash.get(curr) + 1;
            }
            hash.put(curr , r);
            
            r++;

            if(len <= r - l + 1){
                len = r - l + 1;
                start = l;
            }
           
        }

        return str.substring(start , start + len-1);   

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "";       
        str = sc.nextLine();           
        
        System.out.println(str);    
        String substr = longestSubStrMethod(str);
        System.out.print(substr);                         
        sc.close();
    }
}