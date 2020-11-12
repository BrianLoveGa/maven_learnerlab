package com.github.curriculeon;

import com.github.curriculeon.models.Instructors;
import com.github.curriculeon.models.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestInstructors {
    @Test
    public void testInstanceInstructors() {
        String[] names = "Leon,Fred,David,Jothi".split(",");
        List<String> nameList = Arrays.asList(names);

        for(Person person : Instructors.getInstance()){
            String personName = person.getName();
            // then
            Assert.assertTrue(nameList.contains(personName));
        }
    }
}
