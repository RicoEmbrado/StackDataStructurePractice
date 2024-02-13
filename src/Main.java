public class Main
{
    public static void main(String[] args)
    {
        StackDataStructure myStack = new StackDataStructure();
        myStack.push(25);
        myStack.push(38);
        myStack.push(-45);

        //display the stack
        myStack.display();
        System.out.println("Popped item: " + myStack.pop());
        System.out.println("Popped item: " + myStack.pop());
        myStack.display();
    }
}