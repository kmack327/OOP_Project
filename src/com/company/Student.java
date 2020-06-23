/**
 * Katie Mack
 * COMP 152-001:Computer Science II
 * Professor Laura Gross
 * <p>
 * Assignment Week 4: OOP (Student)
 * Due June 23, 2020
 */
package com.company;

// import all utility settings


import java.lang.*;

public class Student
{
        // declare variables
        private int studentID;              // declare int studentID
        private String name;                // declare String name
        private double numberOfCredits;     // declare double numberOfCredits
        private double gpa;                 // declare double gpa
        private Professor advisor;             // declare String advisor

        private static int nextID = 2000;    // declare static int nextID



        // constructor takes 2 parameters (studentName, initialAdvisor)
        Student (String studentName, Professor initialAdvisor)
        {
            name = studentName;         // initialize name instance var
            advisor = initialAdvisor;   // initialize advisor instance var
            gpa = 0.0;                  // initialize double gpa
            numberOfCredits = 0.0;      // initialize numberOfCredits
            studentID = nextID;         // initialize studentID to nextID

            nextID++;                   // increment nextID
        }

        // method takeClass w/ 2 parameters
        public void takeClass(double grade, double credits)
        {
            /** this method will be called when a student takes a class
             * earning a certain number of credits
             * and a certain grade for the class
             */

            // calculate old points prior to class
            double oldPoints= gpa*numberOfCredits;

            // totalCredits = numberOfCredits + numberOfCredits_Class
            numberOfCredits += credits;

            // get grade in dec: A=4.0, B=3.0, C=2.0, D=1.0, F=0.0

            // update gpa = totalPoints/totalCredits
            gpa = (oldPoints + credits*grade)/numberOfCredits;

        }

        // method changeAdvisor
        public void changeAdvisor(Professor newAdvisor)
        {
            // change var advisor to new advisor name
            advisor = newAdvisor;
        }

        // method getName
        public String getName()
        {
            // return the name as String
            return name;
        }

        // method getGPA
        public double getGPA()
        {
            // return gpa
            return gpa;
        }

        // method getCreditHours
        public double getCreditHours()
        {
            // return credit hours
            return numberOfCredits;

        }

        // method getAdvisor
        public Professor getAdvisor()
        {
            // return advisor
            return advisor;
        }

        // method toString
        public String toString()
        {
            // return all strings
            return "Name of Student: " + name + ", " +
                    "ID of Student: " + studentID + ", " +
                    "Name of Advisor: " + advisor + ", " +
                    "GPA of Student: " + gpa;
        }
}
