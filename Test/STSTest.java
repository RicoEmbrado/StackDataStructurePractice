import static org.junit.Assert.*;
import org.junit.*;

public class STSTest
{
    @Test //1
    public void testStackEmptyAfterPushAndPop()
    {
        StackDataStructure myStack = new StackDataStructure();

        assertTrue(myStack.isEmpty());
        myStack.push(10);
        myStack.push(20);
        assertFalse(myStack.isEmpty());
        myStack.pop();
        myStack.pop();
        assertTrue(myStack.isEmpty());
    }

    @Test //2
    public void testStackEmptyInitially()
    {
        StackDataStructure myStack = new StackDataStructure();
        assertTrue(myStack.isEmpty());
    }

    @Test //3
    public void testPushAndPop()
    {
        StackDataStructure myStack = new StackDataStructure();
        myStack.push(10);
        myStack.push(20);
        assertEquals(20, myStack.pop());
        assertEquals(10, myStack.pop());
    }

    @Test //4
    public void testPopEmptyStack()
    {
        StackDataStructure myStack = new StackDataStructure();
        assertEquals(-1, myStack.pop());
    }

    @Test //5
    public void testPushAndPeek()
    {
        StackDataStructure myStack = new StackDataStructure();
        myStack.push(10);
        myStack.push(20);
        assertEquals(20, myStack.peek());
        assertEquals(20, myStack.peek());
    }

    @Test //6
    public void testPeekEmptyStack()
    {
        StackDataStructure myStack = new StackDataStructure();
        assertEquals(-1, myStack.peek());
    }

    @Test //7
    public void testMultiplePushAndPop()
    {
        StackDataStructure myStack = new StackDataStructure();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        assertEquals(30, myStack.pop());
        myStack.push(40);
        assertEquals(40, myStack.pop());
        assertEquals(20, myStack.pop());
        assertEquals(10, myStack.pop());
    }

    @Test //8
    public void testEmptyStackAfterMultiplePops()
    {
        StackDataStructure myStack = new StackDataStructure();
        myStack.push(10);
        myStack.push(20);
        myStack.pop();
        myStack.pop();
        assertTrue(myStack.isEmpty());
    }

    @Test //9
    public void testEmptyStackAfterPushAndPop()
    {
        StackDataStructure myStack = new StackDataStructure();
        myStack.push(10);
        myStack.push(20);
        myStack.pop();
        myStack.pop();
        assertTrue(myStack.isEmpty());
    }

    @Test //10
    public void testPushAndPopLargeNumberElements()
    {
        StackDataStructure myStack = new StackDataStructure();
        int num_elements = 1000000;

        for (int i = 0; i < num_elements; i++)
        {
            myStack.push(i);
        }

        for (int i = num_elements - 1; i >= 0; i--)
        {
            assertEquals(i, myStack.pop());
        }

        assertTrue(myStack.isEmpty());
    }
}
