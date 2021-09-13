package com.collection.class23;

public abstract class Marks {

    int grade1;
    int grade2;
    int grade3;
    int grade4;

    abstract void getPercentage();

}

class student_A extends Marks {
    student_A(int grade1, int grade2, int grade3) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    @Override
    void getPercentage() {
        double average = ((grade1 + grade2 + grade3) / 3);
        System.out.println("the Average for Student A is: " + average);
    }

}

class student_B extends Marks {
    student_B(int grade1, int grade2, int grade3, int grade4) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
    }

    @Override
    void getPercentage() {
        double average = ((grade1 + grade2 + grade3 + grade4) / 4);
        System.out.println("The Average for Student B is: " + average);
    }
}
