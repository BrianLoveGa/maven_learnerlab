package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {


    @Test
        public void testAdd(){

        // given
        Long magicNumber = 9L;
        People people = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };

        Person expected = new Person(magicNumber, null);
        people.add(expected);
        Assert.assertTrue(people.contains(expected));

        // when
        Person actual = people.findById(magicNumber);

        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemove(){
        People people = Students.getInstance();
        Person personToDelete1 = new Person(9L, "steve");
        people.add(personToDelete1);
        Assert.assertTrue(people.contains(personToDelete1));

        // when
        people.remove(personToDelete1);
        // then
        Assert.assertFalse(people.contains(personToDelete1));
    }


    @Test
    public void testFindById(){
        // given
        People people = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        Person expected = new Person(9L, "X");

        // when

        // true
    }

}
