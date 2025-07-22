/*
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

  */

public class MaxVowelSubstring {
    static boolean isVowel(char a){
        return a== 'a' || a == 'e'|| a== 'i' || a == 'o' || a == 'u';
    }
    public static int maxVowels(String s, int k){
        int max = 0 ;
        int vowel = 0;
        for(int i = 0 ; i < k ; i++){
            if(isVowel(s.charAt(i))){
                vowel++;
            }
        }
        for(int i = k ; i < s.length(); i++){
            if(isVowel(s.charAt(i-k))) vowel--;
            if(isVowel(s.charAt(i))) vowel++;
            if(vowel > max) max = vowel;
        }
        return max;
    }
    public static void main(String[] args)
    {
        String s = "abciidef";
        int k = 3;
        System.out.print(maxVowels(s,k));
    }
}