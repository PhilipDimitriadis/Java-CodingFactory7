package gr.aueb.cf.ch19.deq_stack;

public class DeqMain {

    public static void main(String[] args) {
        MyStack<Integer> inStack = new MyStack<>();

        inStack.push(1);
        inStack.push(2);
        inStack.push(3);
        inStack.push(4);

        int topVal = inStack.pop();
        System.out.println(topVal);

        inStack.forEach(System.out::println);
    }
}
