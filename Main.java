import StringSolutions.Anagram;
import StringSolutions.GroupAnagram;

import java.util.List;

public class  Main{
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        boolean result=anagram.isAnagram("ear","art");
        System.out.println(result);
    }
}