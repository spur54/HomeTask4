/**
 * Created by Dima on 30.05.2016.
 */
public interface Stack {
    // adds an element to stack, throws exception if stack is full ("Stack is full" message)
    void push(Object o) throws StackException;
    // returns top element from stack, throws exception if stack is empty ("Stack is empty" message)
    Object pop() throws StackException;
    // clears the hole stack
    void clear();
    // prints all elements of stack to standart output
    void print();
}
