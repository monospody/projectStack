package podhajecka.Main.Stack.Main;

import podhajecka.Main.Stack.Exception.Overflow;
import podhajecka.Main.Stack.Exception.Underflow;
import podhajecka.Main.Stack.Queue.Queue;
import podhajecka.Main.Stack.Stack.Stack;

public class Main {
    public static void main(String[] args) throws Overflow, Underflow {
/*        Stack<Integer> s1 = new Stack<>(3);
        s1.push(3);
        s1.push(3);
        s1.push(3);
        s1.push(3);
        s1.push(3);
*/
        Queue<Integer> q1 = new Queue<>(5);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);

    }
}
