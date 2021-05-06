import ds.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.empty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.peek());
        stack.clear();
        stack.push(190);
        stack.push(160);
        stack.print();
        System.out.println(stack.contains(190));


    }

}
