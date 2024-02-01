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

    public void pushNewNode(int info)
    {
        tail = new Node(info, tail);
    }

    public void showList()
    {
        Node position = head;
        while (position != null)
        {
            System.out.println(position.getData());
            position = position.getLink();
        }
    }

    public void popNode()
    {
        if(tail != null)
        {
            tail = tail.getLink();
        }
    }

    private class Node
    {
        //instance variables

        private int data;
        private Node link;

        //constructors

        public Node (int data, Node link)
        {
            this.data = data;
            this.link = link;
        }

        //getters & setters

        public int getData()
        {
            return data;
        }

        public Node getLink()
        {
            return link;
        }

        //toString

        public String toString()
        {
            return "data: " + data + " links to " + link;
        }
    }
}
