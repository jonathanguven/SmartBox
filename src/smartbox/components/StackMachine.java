package smartbox.components;

import smartbox.*;

public class StackMachine extends Component implements CommandProcessor {

public IStack myStack;

public StackMachine() {
        super();
}

@Override
public String execute(String cmmd) throws Exception {
        String[] tokens = cmmd.split("\\s+");
        Double result = 0.0;
        String answer = "";
        if (tokens[0].equalsIgnoreCase("add")) {
        if (myStack.isEmpty()) {
                throw new Exception("Unable to add: stack is empty.");
        }
        result = myStack.top();
        myStack.pop();
        result += myStack.top();
        myStack.pop();
        myStack.push(result);
        answer = "done";
        } else if (tokens[0].equalsIgnoreCase("mul")) {
                if (myStack.isEmpty()) {
                        throw new Exception("Unable to multiply: stack is empty.");
                }
        result = myStack.top();
        myStack.pop();
        result *= myStack.top();
        myStack.pop();
        myStack.push(result);
        answer = "done";
        }  else if (tokens[0].equalsIgnoreCase("div")) {
                if (myStack.isEmpty()) {
                        throw new Exception("Unable to divide: stack is empty.");
                }
        result = myStack.top();
        myStack.pop();
        result /= myStack.top();
        myStack.pop();
        myStack.push(result);
        answer = "done";
        } else if (tokens[0].equalsIgnoreCase("sub")) {
                if (myStack.isEmpty()) {
                        throw new Exception("Unable to subtract: stack is empty.");
                }
        result = myStack.top();
        myStack.pop();
        result -= myStack.top();
        myStack.pop();
        myStack.push(result);
        answer = "done";
        } else if (tokens[0].equalsIgnoreCase("pop")) {
                if (myStack.isEmpty()) {
                        throw new Exception("Unable to pop: stack is empty.");
                }
        myStack.pop();
        answer = "done";
        } else if (tokens[0].equalsIgnoreCase("top")) {
                if (myStack.isEmpty()) {
                        throw new Exception("Unable to get top: stack is empty.");
                }
        answer = "" + myStack.top();
        } else if (tokens[0].equalsIgnoreCase("push")) {
        myStack.push(Double.valueOf(tokens[1]));
        answer = "done";
        } else if (tokens[0].equalsIgnoreCase("clear")) {
        myStack.clear();
        answer = "done";
        } else if (tokens[0].equalsIgnoreCase("isEmpty")) {
        answer = "" + myStack.isEmpty();
        }
        else {
        throw new Exception("Unrecognized command: " + tokens[0]);
        }
        return answer;
        }
        }