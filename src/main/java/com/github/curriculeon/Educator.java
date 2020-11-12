package com.github.curriculeon;

public enum Educator implements Teacher {

    LEON(1L, "Leon"),
    FRED(2L, "Fred"),
    JOTHI(3L, "Jothi"),
    DAVID(4L, "David");

    private final Instructor instructor;

    public double getTimeWorked() {
        return timeWorked;
    }

    private double timeWorked;

    Educator(Long id, String name){
        this.instructor = new Instructor(id, name);
        Instructors.getInstance().add(instructor);
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        timeWorked+= numberOfHours;
        instructor.teach(learner, numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        timeWorked+= numberOfHours;
        instructor.lecture(learners, numberOfHours);
    }
}
