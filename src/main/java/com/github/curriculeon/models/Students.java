package com.github.curriculeon.models;

public final class Students extends People<Student>{
    // eager implementation
    private static final Students INSTANCE = new Students();

    private Students(){
        add(new Student(0L,"JC AVALO"));
        add(new Student(1L,"Brian Loveless"));
        add(new Student(2L,"Brandt Campbell"));
        add(new Student(3L,"Trevor Taylor"));
        add(new Student(4L,"Neely Mann"));
        add(new Student(5L,"Michal Terranova"));

    }


    public static Students getInstance(){
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        Student[] arrayToBePopulated = new Student[0];
        Student[] populatedArray = personList.toArray(arrayToBePopulated);
        return populatedArray;
    }
}
