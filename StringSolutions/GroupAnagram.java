package StringSolutions;

import java.util.*;

public class GroupAnagram {

    public List<List<String>> groupAnagrams(String[] strs){

        int[] charCount = new int[26];
        List<List<String>> result;
        List<String> tempList;
        Map<String,List<String>> charCountWordMap = new HashMap<>();
        for(String eachString:strs){
            Arrays.fill(charCount,0);
            for(int i=0;i<eachString.length();i++){
                charCount[eachString.charAt(i)-'a']++;
            }
            String key =Arrays.toString(charCount);
            if(!charCountWordMap.containsKey(key)){
                charCountWordMap.put(key,new ArrayList<>());
            }
            tempList = charCountWordMap.get(key);
            tempList.add(eachString);
            charCountWordMap.put(key,tempList);
        }

        result= new ArrayList<>(charCountWordMap.values());

        return  result;
    }
}
