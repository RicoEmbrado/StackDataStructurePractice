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

    public boolean isEmpty()
    {
        return tail == null;
    }

    public void display()
    {
        Node current = tail;
        while (current != null)
        {
            System.out.println(current.getData());
            current = current.getLink();
        }
    }

    private class Node
    {
        private int data;
        private Node link;

        public Node(int data, Node link)
        {
            this.data = data;
            this.link = link;
        }

        public int getData()
        {
            return data;
        }

        public Node getLink()
        {
            return link;
        }

        public void setLink(Node link)
        {
            this.link = link;
        }
    }
}
