import ArrayBased.ArrayBased;
import ReferenceBased.ReferenceBased;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        /* ArrayBased Driver */
        System.out.println("----- ArrayBased Driver -----");
        final int MAX_ITEMS = 15;
        ArrayBased stack = new ArrayBased();
        Integer items[] = new Integer[MAX_ITEMS];
        for (int i = 0; i<MAX_ITEMS; i++) {
            items[i] = new Integer(i);
            if (!stack.isFull()) {
                stack.push(items[i]);
            }
        }
        while (!stack.isEmpty()) {
            System.out.println((Integer)(stack.pop()));
        }
        stack.popAll();

        /* ReferenceBased Driver */
        System.out.println("----- ReferenceBased Driver -----");
        ReferenceBased refStack = new ReferenceBased();
        for (int i = 0; i<10; i++) {
            refStack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.println(refStack.pop());
        }
        refStack.push("hello, pushed to stack");
        System.out.println(refStack.peek());
        refStack.popAll();

        /* JCF Stack Driver */
        System.out.println("----- JCF Stack Driver -----");
        Stack jcfStack = new Stack<>();
        System.out.println("Is empty?: " + jcfStack.isEmpty());
        jcfStack.push(100);
        System.out.println("Top of Stack: " + jcfStack.peek());
        System.out.println("Is empty?: " + jcfStack.isEmpty());
        jcfStack.push(101);
        jcfStack.push(102);
        jcfStack.push(103);
        System.out.println("Top of Stack: " + jcfStack.peek());
        System.out.println("Pop: " + jcfStack.pop());
        System.out.println("Top of Stack: " + jcfStack.peek());
    }
}
