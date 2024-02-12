public class StackDataStructure
{
    //instance variables

    private Node head;
    private Node tail;

    //constructors

    public StackDataStructure()
    {
        head = null;
        tail = null;
    }

    //method add to list

    public void push(int addData)
    {
        Node newNode = new Node(addData, null);
        if (isEmpty())
        {
            tail = newNode;
        }
        else
        {
            newNode.setLink(tail);
            tail = newNode;
        }
    }

    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; //returning -1 meaning failure
        }
        int data = tail.getData();
        tail = tail.getLink();
        return data;
    }
}
