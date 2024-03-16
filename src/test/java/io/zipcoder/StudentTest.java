package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StudentTest {

    @Test
    public void constructorTest() {
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);

        Assert.assertEquals(firstName, student.getFirstName());
        Assert.assertEquals(lastName, student.getLastName());
        // gives me error when I Assert examScores
    }

    @Test
    public void getAndSetFirstNameTest() {
        String expectedName = "Leon";
        Student student = new Student(null, null, null);
        student.setFirstName(expectedName);

        Assert.assertEquals(expectedName, student.getFirstName());
    }

    @Test
    public void getAndSetLastNameTest() {
        String expectedName = "Hunter";
        Student student = new Student(null, null, null);
        student.setLastName(expectedName);

        Assert.assertEquals(expectedName, student.getLastName());
    }

    @Test
    public void getExamScoresTest() {
        String firstName = "Michael";
        String lastName = "Scott";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(88.0);
        examScores.add(100.0);
        examScores.add(75.0);
        examScores.add(93.0);
        Student student = new Student(firstName, lastName, examScores);

        String expectedExamScores = "    Exam 1 -> " + 88.0 + "\n    Exam 2 -> " + 100.0 + "\n    Exam 3 -> " + 75.0 + "\n    Exam 4 -> " + 93.0 + "\n";
        String actualExamScores = student.getExamScores();

        Assert.assertEquals(expectedExamScores, actualExamScores);
    }

    @Test
    public void getAverageGradeTest() {
        String firstName = "Bob";
        String lastName = "Miller";
        double score = 88.0;
        double score1 = 100.0;
        double score2 = 75.0;
        double score3 = 93.0;
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(88.0);
        examScores.add(100.0);
        examScores.add(75.0);
        examScores.add(93.0);
        Student student = new Student(firstName, lastName, examScores);

        int length = examScores.size();
        Double expectedAverageScore = (score + score1 + score2 + score3) / length;
        Double result = student.getAverageExamScore();
        System.out.println(result);
        Assert.assertEquals(expectedAverageScore, result);
    }

    @Test
    public void addExamScoreTest() {
        String firstName = "Bob";
        String lastName = "Miller";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);
        student.addExamScores( 88.0 );

        String expectedAddScore = "    Exam 1 -> " + 88.0 + "\n";

        String actualExamScore = student.getExamScores();

        Assert.assertEquals(expectedAddScore, actualExamScore);
    }

    @Test
    public void setExamScoreTest() {
        String firstName = "Bob";
        String lastName = "Miller";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);

        student.addExamScores(83.0);
        String expectedExamScore = "    Exam 1 -> " + 94.0 + "\n";
        student.setExamScores(0,94.0);

        String actualExamScore = student.getExamScores();

        Assert.assertEquals(expectedExamScore, actualExamScore);
    }

    @Test
    public void toStringTest() {
        String firstName = "Bob";
        String lastName = "Miller";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(88.0);
        examScores.add(100.0);
        examScores.add(75.0);
        examScores.add(93.0);

        Student student = new Student(firstName, lastName, examScores);
        String expecteTestResults = "Student Name: Bob Miller\n" +
                "> Average Score: 89.0\n" +
                "> Exam Scores: " +
                "\n    Exam 1 -> " + 88.0 +
                "\n    Exam 2 -> " + 100.0 +
                "\n    Exam 3 -> " + 75.0 +
                "\n    Exam 4 -> " + 93.0 +
                "\n";;
        String actualTestResults = student.toString();

        Assert.assertEquals(expecteTestResults, actualTestResults);
    }
    
    
}