package com.company;
import java.util.ArrayList;

public class QueryCommands {
    public static void processQuery(ArrayList<String> terminalNodes, String type){
        ArrayList<ArrayList<Object>> stack = new ArrayList<ArrayList<Object>>();
        int terminal_node_length = terminalNodes.size();
        String command = terminalNodes.get(2);
        int index = 3;
        while (index < terminal_node_length){
            if (!DBMS.precMap.containsKey(terminalNodes.get(index))){
                // take terminalNodes[index] (operand) terminalNodes[index + 2] (operator) terminalNodes[index + 1] (operand)
                stack.add(performOperationOnTerminalNodes(terminalNodes.get(index), terminalNodes.get(index + 2), terminalNodes.get(index + 1)));
                index += 3;
            } else {
                // pop off last two items in stack and perform this operator on them, push the result to a new table
                // stack[top] (operand) terminalNodes[index] (operator) stack[top - 1] (operand)
                ArrayList<Object> operand1 = stack.remove(stack.size() - 1);
                String operator = terminalNodes.get(index);
                ArrayList<Object> operand2 = stack.remove(stack.size() - 1);
                stack.add(performOperationFromStack(operand1, operator, operand2));
                index += 1;
            }
        }

        if (command.equals("select")){
            //return stack[0]

        }else if (command.equals("project")){
            // loop through stack of 0 and get the attributes specified
        }
    }

    public static ArrayList<Object> performOperationOnTerminalNodes(String operand1, String operator, String operand2){
        return new ArrayList<Object>();
    }

    public static ArrayList<Object> performOperationFromStack(ArrayList<Object> operand1, String operator, ArrayList<Object> operand2){
        ArrayList<Object> retval =  new ArrayList<Object>();
        switch(operator){
            case "||":
                break;
            case "&&":
                break;
            case "-":
                break;
        }
        return retval;
    }
}
