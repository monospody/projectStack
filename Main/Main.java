package podhajecka.Main.Stack.Main;

import podhajecka.Main.Stack.Exception.StackOverflow;
import podhajecka.Main.Stack.Stack.Stack;

public class Main {
    public static void main(String[] args) throws StackOverflow {
        Stack<Integer> s1 = new Stack<>(3);
        s1.push(3);
        s1.push(3);
        s1.push(3);
        s1.push(3);
        s1.push(3);
    }
}
