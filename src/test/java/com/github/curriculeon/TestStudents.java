package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestStudents {


    @Test
    public void testInstanceStudents() {
        String[] names = "JC AVALO,Brian Loveless,Brandt Campbell,Trevor Taylor,Neely Mann,Michal Terranova".split(",");
        List<String> nameList = Arrays.asList(names);

         for(Person person : Students.getInstance()){
             String personName = person.getName();
             // then
             Assert.assertTrue(nameList.contains(personName));
    }
    }
}
