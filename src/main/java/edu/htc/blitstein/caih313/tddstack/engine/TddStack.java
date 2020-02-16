package edu.htc.blitstein.caih313.tddstack.engine;

import edu.htc.blitstein.caih313.tddstack.IStackable;

public class TddStack {
    public static long DEFAULT_DEPTH = 100;
    public static int stackDepth;
    public long stackDepthLong;
    IStackable stackable;
    public long tddStack = 3;

    public TddStack() {}
    public TddStack(long stackDepth) {}

    public static boolean isEmpty() {
        if(stackDepth <= 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isFull() {
        if(stackDepth > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void push(IStackable stackable) {}
    public IStackable pop() {
        return null;
    }
}

