package com.github.curriculeon.interfaces;

import com.github.curriculeon.interfaces.Learner;

public interface Teacher {
void teach(Learner learner, double numberOfHours);
void lecture(Learner[] learners, double numberOfHours);
}
