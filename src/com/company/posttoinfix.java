package com.company;
import java.util.*;

public class posttoinfix {
    private static Map<String, Integer> precMap = new HashMap<String, Integer>() {{
        put("==",8);
        put("!=",8);
        put("&",7);
        put("|",5);
        put("&&",4);
        put("||",3);
    }};
    private static boolean isHigherPrec(String op, String sub)
    {
        return (precMap.get(op) > precMap.get(sub));
    }

    public static List<String> postfix(ArrayList<String> infix)
    {
        StringBuilder output = new StringBuilder();
        Deque<String> stack = new LinkedList<>();

        for(String token : infix)
        {
            if(precMap.containsKey(token))
            {
                while(!stack.isEmpty() && isHigherPrec(token,stack.peek()))
                {
                    output.append(stack.pop()).append(' ');
                }
                stack.push(token);
            }
            else if(token.equals("("))
            {
                stack.push(token);
            }
            else if(token.equals(")"))
            {
                while(!stack.peek().equals("("))
                {
                    output.append(stack.pop()).append(' ');
                }
                stack.pop();
            }
            else
            {
                output.append(token).append(' ');
            }

        }

        while(!stack.isEmpty())
        {
            output.append(stack.pop()).append(' ');
        }
        String str[] = output.toString().split(" ");
        return Arrays.asList(str);

    }


}



