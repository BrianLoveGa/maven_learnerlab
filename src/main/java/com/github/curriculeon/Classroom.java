package com.github.curriculeon;

public enum Classroom {
    INSTANCE;
    private Students students;
    private  Instructors instructors;


    public void hostLecture(Teacher teacher, double numberOfHours){
        Person[] persons = students.toArray();
        Learner[] learners = new Learner[persons.length];
        for (int i=0;i<persons.length;i++){
            Person currentPerson = persons[i];
            Learner personAsLearner = (Learner)currentPerson;
            learners[i] = personAsLearner;
        }

        teacher.lecture(learners, numberOfHours);
    }




}
