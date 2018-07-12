/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.util;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class MathsTest {

    Maths maths = new Maths();

    @Test
    public void sum_with3numbers() {
        System.out.println("Test1");
        assertEquals(6, maths.sum(new int[]{1, 2, 3}));
    }

    @Test
    public void sum_with1number() {
        System.out.println("Test2");
        assertEquals(3, maths.sum(new int[]{3}));
    }

    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

}
