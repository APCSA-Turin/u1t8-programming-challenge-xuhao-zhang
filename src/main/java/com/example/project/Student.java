package com.example.project;

public class Student {
    // INSTANCE VARIABLES (private)
    String firstName;
    // first name (String)
    String lastName;
    // last name (String)
    int gradYear;
    // graduation year (int)
    double averageTestScore;
    // sum of test scores (double).. should initialize at 0.0
    int testScoreCount = 0;
    // test score count (int) ..should initialize at 0
    double highestTestScore = 0.0;
    // highest test score (double).. should initialize at 0.0
    double accumulatedTestScores = 0.0;//Do I need to do this?
 
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
    }
 
    // returns firstName
    public String getFirstName() {
        return firstName;
    }
 
    // returns lastName
    public String getLastName() {
        //implement code here!
        return lastName;
    }
 
    public double getHighestTestScore() {
        //implement code here!
        return highestTestScore; //random double number
    }

    public int getTestScoreCount(){
        //implement code here!
        return testScoreCount;
    }

    public int getGradYear(){
        //implement code here!
        return gradYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        testScoreCount = testScoreCount + 1;
        accumulatedTestScores = accumulatedTestScores + newTestScore;
        if (newTestScore > highestTestScore) {
            highestTestScore = newTestScore;
        }
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        averageTestScore = 80;
        if (averageTestScore >= 65) {
            return true;
        } else {
            return false;
        }
        //implem
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        averageTestScore = (double) accumulatedTestScores / testScoreCount;
        return averageTestScore; //random double number //I dont understand "random double number" instead of "average testscore"
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " );
        System.out.println("Graduation Year: ");
        System.out.println("Number of tests: ");
        System.out.println("Average Test Score: ");
        System.out.println("Highest Test Score: ");
        System.out.println("Is passing: ");
    }
 }
 