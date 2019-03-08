package com.osb.test;

import com.osb.stackImp.Stack;
import org.junit.Assert;
import org.junit.Test;

public class TestStack {

    @Test
    public void testStack_HeadValue_Correctly() {
        Stack stack = new Stack(10);
        stack.push(10);

        Assert.assertEquals(10, stack.pop());
    }

    @Test
    public void testStack_IsEmpty() {
        Stack stack = new Stack(10);
        stack.push(10);
        stack.push(20);

        stack.pop();
        stack.pop();

        Assert.assertEquals(Boolean.TRUE, stack.isEmpty());
    }

    @Test
    public void testStack_IsFull() {
        Stack stack = new Stack(2);
        stack.push(10);
        stack.push(20);

        Assert.assertEquals(Boolean.TRUE, stack.isFull());
    }

    @Test
    public void testStack_Peek() {
        Stack stack = new Stack(2);
        stack.push(10);
        stack.push(20);

        Assert.assertEquals(20, stack.peek());
    }
}
