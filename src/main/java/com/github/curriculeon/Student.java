package com.github.curriculeon;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime+=numberOfHours;
    }

    @Override
    public Double getTotalStudy() {
        return totalStudyTime;
    }
}
