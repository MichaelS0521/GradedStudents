package io.zipcoder;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addExamScores(double examScore) {
        examScores.add(examScore);
    }

    public void setExamScores(int index, double addedExamScore) {
        examScores.set(index, addedExamScore);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        String str = "";;
        int counter = 0;
        System.out.print("Exam Scores :\n");
        for (int i = 0; i < examScores.size(); i++){
            counter++;
            str += "    Exam " + counter + " -> " + examScores.get(i) + "\n";
        }
        return str;
    }

    public Double getAverageExamScore() {
        double totalScores = 0;
        for (int i = 0; i < examScores.size(); i++) {
            totalScores += examScores.get(i);
        }
        double averageScore = totalScores / examScores.size();
        return averageScore;
    }

    @Override
    public String toString() {
        return "Student Name: " + getFirstName() + " " + getLastName() + "\n" +
                "> Average Score: " + getAverageExamScore() + "\n> Exam Scores: \n" +
                getExamScores();
    }
}
