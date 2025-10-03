package com.elchukito.models;

import java.util.ArrayList;
import java.lang.Math;

public class Grades {
    private float grade1;
    private float grade2;
    private float grade3;
    private float grade4;
    private float gradeAvg;

    public Grades(float grade1, float grade2, float grade3, float grade4) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
        this.gradeAvg = (float) (Math.round(((grade1 + grade2 + grade3 + grade4) / 4) * Math.pow(10, 2)) / Math.pow(10, 2));
    }

    public ArrayList<Grades> listGrades() {
        return new ArrayList<Grades>();
    }

    public float getGrade1() {
        return grade1;
    }
    public float getGrade2() {
        return grade2;
    }
    public float getGrade3() {
        return grade3;
    }
    public float getGrade4() {
        return grade4;
    }
    public float SetGrade1(float grade1) {
        return this.grade1 = grade1;
    }
    public float SetGrade2(float grade2) {
        return this.grade2 = grade2;
    }
    public float SetGrade3(float grade3) {
        return this.grade3 = grade3;
    }
    public float SetGrade4(float grade4) {
        return this.grade4 = grade4;
    }
    public float getGradeAvg() {
        return gradeAvg;
    }
    public float setGradeAvg(float gradeAvg) {
        return this.gradeAvg = gradeAvg;
    }
}
