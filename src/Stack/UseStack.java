package Stack;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.add("Plate1");
        stack.add("Plate2");
        stack.add("Plate3");
        stack.add("Plate4");
        stack.add("Plate5");
        stack.add("Plate6");

        if (stack.peek().equals("Plate6"))
            System.out.println(stack.pop());

        System.out.println(stack.peek());

    }
}
