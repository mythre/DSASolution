package StringSolutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return  false;
        }

       int[] charCount = new int[26];
        Arrays.fill(charCount,0);
        for(int i=0;i<s.length();i++){
            charCount[s.charAt(i)-'a']++;
            charCount[t.charAt(i)-'a']--;
        }

        for (int i=0;i<26;i++){
            if(charCount[i]!=0){
                return false;
            }
        }
        return true;

    }
}
