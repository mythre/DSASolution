package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


    /*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.
    */
    public class ValidParenthesis {
        public boolean isValid(String s){
            Stack<Character> closingBracket = new Stack<>();
            Map<Character,Character> mappingBrackets= new HashMap<>();
            mappingBrackets.put(')','(');
            mappingBrackets.put(']','[');
            mappingBrackets.put('}','{');
            for(int i=0; i<s.length();i++){
                if(mappingBrackets.containsKey(s.charAt(i)))
                {
                    if(closingBracket.pop()!=mappingBrackets.get(s.charAt(i)))
                    {
                        return false;
                    }
                }
                else
                {
                    closingBracket.push(s.charAt(i));
                }
            }
            return closingBracket.isEmpty();

        }
    }


