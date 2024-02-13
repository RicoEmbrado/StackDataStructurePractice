import static org.junit.Assert.*;
import org.junit.*;

public class STSTest
{
    private StackDataStructure myStack;

    public void setUp()
    {
        myStack = new StackDataStructure();
    }
    @Test
    public void testStackEmptyAfterPushAndPop()
    {
        assertTrue(myStack.isEmpty());
        myStack.push(10);
        myStack.push(20);
        assertFalse(myStack.isEmpty());
        myStack.pop();
        myStack.pop();
        assertTrue(myStack.isEmpty());
    }
}
