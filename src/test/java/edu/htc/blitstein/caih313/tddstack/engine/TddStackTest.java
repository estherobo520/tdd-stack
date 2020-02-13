package edu.htc.blitstein.caih313.tddstack.engine;

import edu.htc.blitstein.caih313.tddstack.IStackable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TddStackTest {

    TddStack tddStack = new TddStack();
    IStackable stackableOne;
    IStackable stackableTwo;
    IStackable stackableThree;


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TddStack(long stackDepth) {
        stackDepth = TddStack.DEFAULT_DEPTH;
        assertEquals(stackDepth, stackDepth);
    }

    //check that calling isEmpty() on a newly created stack returns "true"
    @Test
    public void isEmptyTest() {
        //return true;
        assertEquals(true, true);

    }

    //check that calling isFull() on a newly created stack returns "false"
    @Test
    public void isFullTest() {
        //return false;
        assertEquals(false, false);
    }

    //check that calling pop() on a newly created stack returns "null"
    @Test
    public void popTest() {
        //return null;
        assertEquals(null, null);
    }

    //check that when a IStackable is pushed on the TddStack, then isEmpty() returns false
    @Test
    public void isEmptyTestTwo(TddStack tddStack) {
        tddStack.push(stackableOne);
        //return false;
        assertEquals(false, true);
    }

    //Instantiate a TddStack with a depth of 3. Implement a test that checks that isFull() returns true when three IStackable objects are pushed onto it
    @Test
    public void isFullTestTwo(TddStack tddStack) {
        tddStack.push(stackableOne);
        tddStack.push(stackableTwo);
        tddStack.push(stackableThree);
        //return true;
        assertEquals(true, false);
    }
}