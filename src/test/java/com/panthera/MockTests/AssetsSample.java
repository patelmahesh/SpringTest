/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.MockTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasSize;
import org.hamcrest.collection.IsEmptyCollection;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.mockito.AdditionalMatchers.not;

/**
 *
 * @author Administrator
 */
public class AssetsSample {

    @Test
    public void testAssertList() {
        List<String> actual = Arrays.asList("a", "b", "c");
        List<String> expected = Arrays.asList("a", "b", "c");
        //All passed / true
        //1. Test equal.
        assertThat(actual, is(expected));
        //2. If List has this value?
        assertThat(actual, hasItems("b"));
        //3. Check List Size
        assertThat(actual, hasSize(3));
        assertThat(actual.size(), is(3));
        // Can be any order
        assertThat(actual, containsInAnyOrder("c", "b", "a"));
        //5. check empty list
        assertThat(actual, not(IsEmptyCollection.empty()));
        assertThat(new ArrayList<>(), IsEmptyCollection.empty());

    }

}
