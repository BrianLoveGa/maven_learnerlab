package com.github.curriculeon;

import com.github.curriculeon.interfaces.Learner;
import com.github.curriculeon.interfaces.Teacher;
import com.github.curriculeon.models.Instructor;
import com.github.curriculeon.models.Person;
import com.github.curriculeon.models.Student;
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
        double numberOfHoursToTeach = 10;
        double preStudyTime = student.getTotalStudyTime();
        double expected = preStudyTime + numberOfHoursToTeach;

        // when
        instructor.teach(student, numberOfHoursToTeach);
        double actual = student.getTotalStudyTime();

        // then
        // test they are equal within .01 margin of error (rounding maybe prob)
        Assert.assertEquals(expected,actual,0.01);
    }


    @Test
    public void testLecture(){

        // given

        Instructor instructor = new Instructor(id,y);
        Learner studentA = new Student(num,x);
        Learner studentB = new Student(id,"B");
        Learner[] kids = {studentA,studentB};
        double numberOfHoursToTeach = 80;
        double preStudyTimeA = studentA.getTotalStudyTime();
        double preStudyTimeB = studentB.getTotalStudyTime();

        double expectedA = (preStudyTimeA + numberOfHoursToTeach) / kids.length;
        double expectedB = (preStudyTimeB + numberOfHoursToTeach) / kids.length;


        // when
        instructor.lecture(kids,numberOfHoursToTeach);
        double actual1 = studentA.getTotalStudyTime();
        double actual2 = studentB.getTotalStudyTime();

        // then
        Assert.assertEquals(expectedA, actual1,0.01);
        Assert.assertEquals(expectedB, actual2,0.01);
    }

}
