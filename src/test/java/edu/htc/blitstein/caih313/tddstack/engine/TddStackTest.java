package edu.htc.blitstein.caih313.tddstack.engine;

import edu.htc.blitstein.caih313.tddstack.IStackable;
import edu.htc.blitstein.caih313.tddstack.resource.campus.Faculty;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class TddStackTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TddStack(long stackDepth) {
        stackDepth = TddStack.DEFAULT_DEPTH;
        assertEquals(100, TddStack.DEFAULT_DEPTH);
    }

    @Test
    public void isEmptyTest() {
        TddStack tddStack = new TddStack();
        assertTrue(tddStack.isEmpty());

    }

    @Test
    public void isFullTest() {
        TddStack tddStack = new TddStack();
        assertFalse(tddStack.isFull());
    }

    @Test
    public void popTest() {
        TddStack tddStack = new TddStack();
        assertNull(tddStack);
    }

    @Test
    public void isEmptyWhenStackableIsPushedOnTddStackTest() {
        TddStack tddStack = new TddStack();
        IStackable stackableOne = null;
        tddStack.push(stackableOne);
        tddStack.stackDepth = 1;
        assertFalse(tddStack.isEmpty());
    }

    @Test
    public void isFullWhenAddThreeStackablesTest() {
        TddStack tddStack = new TddStack();
        tddStack.stackDepth = 3;
        IStackable stackableOne = null;
        IStackable stackableTwo = null;
        IStackable stackableThree = null;
        tddStack.push(stackableOne);
        tddStack.push(stackableTwo);
        tddStack.push(stackableThree);
        assertTrue(tddStack.isFull());
    }


    @Test
    public void testPopIsPush() {
        TddStack tddStack = new TddStack();
        //Faculty implements IStackable
        IStackable iStackableOrig = new Faculty();
        tddStack.push(iStackableOrig);
        IStackable iStackablePopped = tddStack.pop();
        assertEquals(iStackableOrig, iStackablePopped);
    }
}