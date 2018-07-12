/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.MockTests;

import com.panthera.util.MyClass;
import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

/**
 *
 * @author Administrator
 */
public class VerifySample {

    @Test
    public void testVerify() {
        // create and configure mock
        MyClass test = Mockito.mock(MyClass.class);
        when(test.getUniqueId()).thenReturn(43);

        // call method testing on the mock with parameter 12
        test.testing(12);

        test.getUniqueId();
        test.getUniqueId();

        // now check if method testing was called with the parameter 12
        verify(test).testing(ArgumentMatchers.eq(12));

        // was the method called twice?
        verify(test, times(2)).getUniqueId();

        // other alternatives for verifiying the number of method calls for a method
        verify(test, never()).someMethod("never called");
        verify(test, atLeastOnce()).someMethod("called at least once");
        verify(test, atLeast(2)).someMethod("called at least twice");
        verify(test, times(5)).someMethod("called five times");
        verify(test, atMost(3)).someMethod("called at most 3 times");
        // This let's you check that no other methods where called on this object.
        // You call it after you have verified the expected method calls.
        verifyNoMoreInteractions(test);
    }

}
