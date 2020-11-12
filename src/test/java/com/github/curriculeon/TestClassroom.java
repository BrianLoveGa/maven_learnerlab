package com.github.curriculeon;



/// Ensure the hostLecture method can handle objects of type Educator.
///       add(new Instructor(1L, "Fred")); - instance refs
//        add(new Instructor(2L, "David"));

//         add(new Student(0L,"JC AVALO")); - instance refs
//        add(new Student(1L,"Brian Loveless"));
//        add(new Student(2L,"Brandt Campbell"));

import com.github.curriculeon.models.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

public class TestClassroom {

    @Test
    public void testHostLecture(){
        // given
        Classroom classroom = Classroom.INSTANCE;
        Instructors instructor = Instructors.getInstance();
        Students students = Students.getInstance();
        Instructor teacherAsTeacher = instructor.findById(1L);
        Map<Student, Double> preStudyMap = classroom.getStudyMap();
        double numberOfHoursToTeach = 900.0;
        Double expectedNumberOfHoursLearned = numberOfHoursToTeach / students.count();

        // when
        classroom.hostLecture(teacherAsTeacher,numberOfHoursToTeach);
        Map<Student, Double> afterStudyMap = classroom.getStudyMap();
        Set<Student> keySet = afterStudyMap.keySet();

        for (Student student: keySet){
            Double preStudyTime = preStudyMap.get(student);
            Double expectedStudyTime = preStudyTime + expectedNumberOfHoursLearned;
            Double actualStudyTime = afterStudyMap.get(student);

            // then

            Assert.assertEquals(expectedStudyTime, actualStudyTime);
        }
    }

}
