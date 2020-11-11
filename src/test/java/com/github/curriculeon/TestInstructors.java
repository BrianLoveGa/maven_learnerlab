package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestInstructors {
    @Test
    public void testInstanceInstructors() {
        String[] names = "Fred,Jothi,Leon,David".split(",");
        List<String> nameList = Arrays.asList(names);

        for(Person person : Instructors.getInstance()){
            String personName = person.getName();
            // then
            Assert.assertTrue(nameList.contains(personName));
        }
    }
}
