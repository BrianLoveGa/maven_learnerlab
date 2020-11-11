package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    Long id = 9L;
    Long num = 8L;
    String x = "testname";
    String y = "nametotest";

    @Test
    public void testImplementation(){

        // given
        Instructor instructor = new Instructor(id,x);
        // when
        boolean outcome = instructor instanceof Teacher;
        // then
        Assert.assertTrue(outcome);

    }


    @Test
    public void testInheritance(){

        // given
        Instructor instructor = new Instructor(id,x);
        // when
        boolean outcome = instructor instanceof Person;
        // then
        Assert.assertTrue(outcome);

    }


    @Test
    public void testTeach(){
        // given
        Instructor instructor = new Instructor(id,x);
        Learner student = new Student(num,y);
    }


    @Test
    public void testLecture(){

    }

}
