package com.github.curriculeon;


//Create a testImplementation method that asserts that an Educator is an instanceof a Teacher.
//Create a testInheritance method that asserts that a Educator is an instanceof a Person.
//Create a testTeach method that ensures when an Educator invokes the teach method,
//        a respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
//Create a testLecture method that ensures when an Educator invokes the lecture method,
//        a respective array of students' totalStudyTime instance variables is incremented by
//        numberOfHours/students.length.

// test get time worked works ...

import com.github.curriculeon.interfaces.Teacher;
import com.github.curriculeon.models.*;
import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testImplementation(){
        // given

        Educator educator =  Educator.FRED;

        // when


        boolean results = educator instanceof Teacher;
        Long id = educator.instructor.getId();

        // then

        Assert.assertEquals(id, Educator.FRED.instructor.getId());
        Assert.assertTrue(results);
    }

    @Test
    public void testInheritance(){
        // given

        Educator educator = Educator.DAVID;

        // when

       //   boolean wellIsIt = educator instanceof People;   ... /// it is not



        // then



    }
    @Test
    public void testEducatorCanTeach(){
        // given


        // when


        // then
    }

    @Test
    public void testEducatorCanLecture(){
        // given


        // when


        // then
    }

    @Test
    public void testEducatorGetTimeWorked(){
        // given


        // when


        // then
    }


}
