package com.github.curriculeon;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestInstructor.class,
        TestPerson.class,
        TestStudent.class,
        TestPeople.class,
        TestStudents.class,
        TestInstructors.class, // run separate due to 'singleton exception'
})
public class TestAllSuite {
}
