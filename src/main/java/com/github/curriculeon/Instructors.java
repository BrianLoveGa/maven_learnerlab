package com.github.curriculeon;

public class Instructors extends People{

    private static  Instructors INSTANCE = new Instructors();

    private Instructors(){
        add(new Instructor(0L,"Leon"));
        add(new Instructor(1L,"Fred"));
        add(new Instructor(2L,"Jothi"));
        add(new Instructor(3L,"David"));

    }


    public static Instructors getInstance(){
        
        if(INSTANCE == null){
            INSTANCE = new Instructors();
        }
        return INSTANCE;
    }
}
