import StringSolutions.GroupAnagram;

import java.util.List;

public class  Main{
    public static void main(String[] args) {
        GroupAnagram groupAnagram = new GroupAnagram();
        List<List<String>> result=groupAnagram.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        System.out.println(result);
    }
}