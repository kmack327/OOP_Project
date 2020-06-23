/**
 * Katie Mack
 * COMP 152-001:Computer Science II
 * Professor Laura Gross
 * <p>
 * Assignment Week 4: OOP (University)
 * Due June 23, 2020
 */
package com.company;

// import all utility settings

import java.util.*;
import java.lang.*;

public class University
{
    // declare instance variables
    private ArrayList<Student> studentList;
    private ArrayList <Professor> faculty;

    // constructor without parameters
    University ()
    {
        // initialize studentList as new (empty) arrayList
        studentList = new ArrayList<Student>();

        // initialize faculty as new (empty) arrayList
        faculty = new ArrayList<Professor>();
    }

    // method hireProfessor takes parameter and adds to faculty list
    public ArrayList<Professor> hireProfessor (Professor newProfessor)
    {
        faculty.add(newProfessor);  // add newProfessor to faculty list

        return faculty;             // return updated faculty list
    }

    // method admitStudent takes parameter and adds to studentList
    public ArrayList<Student> admitStudent (Student newStudent)
    {
        studentList.add(newStudent);    // add newStudent to studentList

        return studentList;             // return updated studentList
    }

    // method findStudent takes parameter that finds correct studentID
    public ArrayList<Student> findStudent (int studentID)
    {
        // iterate through studentList to find studentID


        // return arrayList <Student> foundStudent


            // if student was found, foundStudent includes target Student object

            // if student not found, foundStudent is returned as empty
    }

    // method graduateStudents take no parameters
    public ArrayList<Student> graduateStudents()
    {
        // iterate through student list. during each loop:

            // if student

                // has gpa >= 2.0

                // has >= 20 credits

                    // then should remove student from studentList

                    // print "congratulations!"

                    // print Student's name

                    // if gpa > 3.7, print "Graduates with High Honors!"

                    // else if gpa >= 3.3, print "Graduates with Honors!"

            // else, return studentList

    }

    // method runUniversity takes no parameters
    public void runUniversity ()
    {
        // topLevelMenu for user options

                // Hire a professor
                    // prompt user to get Professor details (name, department)
                    // create new Professor object
                    // call the hireProfessor method

                // Admit a student
                        // prompt to get student name
                        // randomly select professor from faculty list for initialAdvisor
                        // create new student object
                        // call admitStudent method

                // Graduate a Student >> call graduateStudents

                // Look up a student
                    // prompt user for student's name
                    // call findStudent to obtain the ArrayList, either empty or student info
                    // if studentFound,
                        // print student's details
                        // giver user option to enter student menu for student
                // Exit >> ends program

        // studentMenu for student options

                // Enter credits and grade for student

                    // prompt user to enter double credits

                    // prompt user to enter student's grade

                    // call takeClass for the student

                // Assign an advisor to the student

                    // show list of all professors (iterate through to print)

                    // prompt user to enter name of advisor and assign to student

                    // prompt user to enter the department name for the advisor

                    // Get student's current advisor, call method removeAdvisee for professor.

                    // call method changeAdvisor to assign new advisor to student

                    // add student to new advisor's adviseeList

                    // Exit, end program

    }
}
