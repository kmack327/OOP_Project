/*
 * Katie Mack
 * COMP 152-001:Computer Science II
 * Professor Laura Gross
 * <p>
 * Assignment Week 4: OOP (Professor)
 * Due June 23, 2020
 */
package com.company;

// import all utility settings

import java.util.*;
import java.lang.*;


public class Professor
{
        // declare variables
        ArrayList<Student> adviseeList;

        private String name;
        private String department;


        // constructor should take 2 parameters
        Professor (String profName, String dept)
        {
            // initialize profName (param)
            name = profName;

            // initialize department (param)
            department = dept;

            // initialize adviseeList (explicit): default null
            adviseeList = null;
        }

        // method addAdvisee should take 1 parameter
        public ArrayList<Student> addAdvisee (Student newAdvisee)
        {
                // should add parameter to var adviseeList
                adviseeList.add(newAdvisee);

                return adviseeList;
        }

        // method removeAdvisee should take 1 parameter
        public ArrayList<Student> removeAdvisee (Student formerAdvisee)
        {
                if(adviseeList.contains(formerAdvisee))
                {
                    // remove formerAdvisee
                    adviseeList.remove(formerAdvisee);

                    // return new list
                    return adviseeList = new ArrayList<>();
                }

                else
                    {
                        return adviseeList;
                    }

        }

        // method getName()
        public String getName()
        {
            // return the name
            return name;
        }



    // method toString returns String
    public String toString()
    {
        String profName = name;


        // returns profName, department
        return profName + ", " + department;
    }

}
