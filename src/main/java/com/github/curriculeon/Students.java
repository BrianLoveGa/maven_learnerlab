package com.github.curriculeon;

public final class Students extends People{
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
}
