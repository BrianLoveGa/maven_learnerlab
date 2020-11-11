package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Assert.assertTrue(new Student(0L,"greg")instanceof Person);

    }
}
