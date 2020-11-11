package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    Long id = 9L;
    String x = "testname";


    @Test
    public void testImplementation(){
        Assert.assertTrue(new Student(id,x)instanceof Learner);

    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(new Student(id,x)instanceof Person);
    }





}
