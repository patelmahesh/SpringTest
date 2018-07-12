/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.MockTests;

import com.panthera.model.Person;
import java.util.Iterator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Administrator
 */
public class MockSample {

    @Test
    public void mockWhenFunction() {
        //  create mock
        Person test = mock(Person.class);
        // define return value for method getUniqueId()
        when(test.getAge()).thenReturn(43);
        assertEquals(test.getAge(), 43);
    }

    @Test
    public void testMoreThanOneReturnValue() {
        Iterator<String> i = mock(Iterator.class);
        when(i.next()).thenReturn("Mockito").thenReturn("rocks");
        String result = i.next() + " " + i.next();
        //assert
        assertEquals("Mockito rocks", result);
    }

    // this test demonstrates how to return values based on the input
    @Test
    public void testReturnValueDependentOnMethodParameter() {
        Comparable<String> c = mock(Comparable.class);
        when(c.compareTo("Mockito")).thenReturn(1);
        when(c.compareTo("Eclipse")).thenReturn(2);
        //assert
        assertEquals(1, c.compareTo("Mockito"));
    }

// this test demonstrates how to return values independent of the input value
    @Test
    public void testReturnValueInDependentOnMethodParameter() {
        Comparable<Integer> c = mock(Comparable.class);
        when(c.compareTo(anyInt())).thenReturn(-1);
        //assert
        assertEquals(-1, c.compareTo(9));
    }

// return a value based on the type of the provide parameter
    @Test
    public void testReturnValueInDependentOnMethodParameter2() {
        Comparable<Person> c = mock(Comparable.class);
        when(c.compareTo(isA(Person.class))).thenReturn(0);
        //assert
        assertEquals(0, c.compareTo(new Person(1)));
    }
}
