package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
      // given
        Long expectedId = Long.MAX_VALUE;
        String expectedName = "John";
      // when
        Person testPersonJohn = new Person(expectedId, expectedName);
      // then
        Assert.assertEquals(expectedName, testPersonJohn.getName());
        Assert.assertEquals(expectedId, testPersonJohn.getId());
    }

    @Test
    public void testSetName(){
        String expectedName = "nameNAME";
        Person person = new Person(0L, null);
        Assert.assertNotEquals(expectedName, person.getName());

        // when
        person.setName(expectedName);

        // then
        Assert.assertEquals(expectedName, person.getName());
    }

}
