package com.github.curriculeon;

 public  class Instructors extends People<Instructor> {
    private static Instructors INSTANCE;

    private Instructors() {
        add(new Instructor(0L, "Leon"));
        add(new Instructor(1L, "Fred"));
        add(new Instructor(2L, "David"));
        add(new Instructor(6L, "Jothi"));
    }

    public static Instructors getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Instructors();
        }
        return INSTANCE;
    }

     @Override
     public Instructor[] toArray() {
         Instructor[] arrayToBePopulated = new Instructor[0];
         Instructor[] populatedArray = personList.toArray(arrayToBePopulated);
         return populatedArray;
     }
}
