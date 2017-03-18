package com.cisc181.core;

import com.cisc181.eNums.eMajor;
import java.text.ParseException;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {
        static ArrayList<Course> courses;
        static ArrayList<Semester> semesters;
        static ArrayList<Section> sections;
        static ArrayList<Student> students;
        static ArrayList<Enrollment> enrollments;
        
	@BeforeClass
	public static void setup() {
            courses = new ArrayList<>();
            Course maths = new Course("Mathematics",100);
            Course physics = new Course("Physics",100);
            Course chemistry = new Course("Chemistry",100);
            
            semesters = new ArrayList<>();
            Semester fall = new Semester(new GregorianCalendar(2016, 9, 1).getTime(), 
                                         new GregorianCalendar(2017, 1, 25).getTime());
            Semester spring = new Semester(new GregorianCalendar(2017, 2, 15).getTime(), 
                                         new GregorianCalendar(2017, 6, 30).getTime());
            
            sections = new ArrayList<>();
            
            courses.add(maths);
            courses.add(physics);
            courses.add(chemistry);
            semesters.add(fall);
            semesters.add(spring);
            
            Section mathFall = new Section(maths.getCourseID(), fall.getSemesterID(), 111);
            Section mathSpring = new Section(maths.getCourseID(), spring.getSemesterID(), 112);
            Section physicsFall = new Section(physics.getCourseID(), fall.getSemesterID(), 211);
            Section physicsSpring = new Section(physics.getCourseID(), spring.getSemesterID(), 212);
            Section chemistryFall = new Section(chemistry.getCourseID(), fall.getSemesterID(), 311);
            Section chemistrySpring = new Section(chemistry.getCourseID(), spring.getSemesterID(), 312);
            
            sections.add(mathFall);
            sections.add(mathSpring);
            sections.add(physicsFall);
            sections.add(physicsSpring);
            sections.add(chemistryFall);
            sections.add(chemistrySpring);
            
            students = new ArrayList<>();
            enrollments = new ArrayList<>();
            
            Student s;
            Enrollment e;
            try {
                s = new Student("Ashley", "", "Adams", new GregorianCalendar(1995, 1, 23).getTime(),
                                        eMajor.COMPSI, "New York", "(111)-111-1111", "ashley@gmail.com");
                students.add(s);
                e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
                e.setGrade(90);
                enrollments.add(e);
                
                e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
                e.setGrade(80);
                enrollments.add(e);
                
                e = new Enrollment(physicsFall.getSectionID(), s.getStudentID());
                e.setGrade(70);
                enrollments.add(e);
                
                e = new Enrollment(physicsSpring.getSectionID(), s.getStudentID());
                e.setGrade(90);
                enrollments.add(e);
                
                
                s = new Student("Bob", "", "Bryant", new GregorianCalendar(1995, 2, 23).getTime(),
                                        eMajor.COMPSI, "New York", "(222)-222-2222", "bob@gmail.com");
                students.add(s);
                e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
                e.setGrade(100);
                enrollments.add(e);
                
                e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
                e.setGrade(100);
                enrollments.add(e);
                
                e = new Enrollment(physicsFall.getSectionID(), s.getStudentID());
                e.setGrade(95);
                enrollments.add(e);
                
                e = new Enrollment(physicsSpring.getSectionID(), s.getStudentID());
                e.setGrade(85);
                enrollments.add(e);
                
                s = new Student("Chris", "", "Coleman", new GregorianCalendar(1995, 3, 23).getTime(),
                                        eMajor.CHEM, "New York", "(333)-333-3333", "chris@gmail.com");
                students.add(s);
                e = new Enrollment(chemistryFall.getSectionID(), s.getStudentID());
                e.setGrade(100);
                enrollments.add(e);
                
                e = new Enrollment(chemistrySpring.getSectionID(), s.getStudentID());
                e.setGrade(90);
                enrollments.add(e);
                
                e = new Enrollment(physicsFall.getSectionID(), s.getStudentID());
                e.setGrade(75);
                enrollments.add(e);
                
                e = new Enrollment(physicsSpring.getSectionID(), s.getStudentID());
                e.setGrade(85);
                enrollments.add(e);
                
                
                s = new Student("Dave", "", "Dobson", new GregorianCalendar(1995, 4, 23).getTime(),
                                        eMajor.CHEM, "New York", "(444)-444-4444", "dave@gmail.com");
                students.add(s);
                e = new Enrollment(chemistryFall.getSectionID(), s.getStudentID());
                e.setGrade(95);
                enrollments.add(e);
                
                e = new Enrollment(chemistrySpring.getSectionID(), s.getStudentID());
                e.setGrade(95);
                enrollments.add(e);
                
                e = new Enrollment(physicsFall.getSectionID(), s.getStudentID());
                e.setGrade(70);
                enrollments.add(e);
                
                e = new Enrollment(physicsSpring.getSectionID(), s.getStudentID());
                e.setGrade(80);
                enrollments.add(e);
                
                s = new Student("Ethan", "", "Evans", new GregorianCalendar(1995, 5, 23).getTime(),
                                        eMajor.BUSINESS, "New York", "(555)-555-5555", "ethan@gmail.com");
                students.add(s);
                e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
                e.setGrade(60);
                enrollments.add(e);
                
                e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
                e.setGrade(80);
                enrollments.add(e);
                
                e = new Enrollment(physicsFall.getSectionID(), s.getStudentID());
                e.setGrade(75);
                enrollments.add(e);
                
                e = new Enrollment(physicsSpring.getSectionID(), s.getStudentID());
                e.setGrade(85);
                enrollments.add(e);
                
                s = new Student("Frank", "", "Freeman", new GregorianCalendar(1995, 6, 23).getTime(),
                                        eMajor.BUSINESS, "New York", "(666)-666-6666", "frank@gmail.com");
                students.add(s);
                e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
                e.setGrade(50);
                enrollments.add(e);
                
                e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
                e.setGrade(90);
                enrollments.add(e);
                
                e = new Enrollment(physicsFall.getSectionID(), s.getStudentID());
                e.setGrade(70);
                enrollments.add(e);
                
                e = new Enrollment(physicsSpring.getSectionID(), s.getStudentID());
                e.setGrade(70);
                enrollments.add(e);
                
                s = new Student("Gregory", "", "Garrison", new GregorianCalendar(1995, 7, 23).getTime(),
                                        eMajor.NURSING, "New York", "(777)-777-7777", "gregory@gmail.com");
                students.add(s);
                e = new Enrollment(chemistryFall.getSectionID(), s.getStudentID());
                e.setGrade(95);
                enrollments.add(e);
                
                e = new Enrollment(chemistrySpring.getSectionID(), s.getStudentID());
                e.setGrade(95);
                enrollments.add(e);
                
                e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
                e.setGrade(90);
                enrollments.add(e);
                
                e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
                e.setGrade(100);
                enrollments.add(e);
                
                s = new Student("Hugh", "", "Hilton", new GregorianCalendar(1995, 8, 23).getTime(),
                                        eMajor.NURSING, "New York", "(888)-888-8888", "hugh@gmail.com");
                students.add(s);
                e = new Enrollment(chemistryFall.getSectionID(), s.getStudentID());
                e.setGrade(70);
                enrollments.add(e);
                
                e = new Enrollment(chemistrySpring.getSectionID(), s.getStudentID());
                e.setGrade(100);
                enrollments.add(e);
                
                e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
                e.setGrade(90);
                enrollments.add(e);
                
                e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
                e.setGrade(80);
                enrollments.add(e);
                
                
                s = new Student("Irene", "", "Idlewood", new GregorianCalendar(1995, 8, 23).getTime(),
                                        eMajor.PHYSICS, "New York", "(999)-999-9999", "irene@gmail.com");
                students.add(s);
                e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
                e.setGrade(80);
                enrollments.add(e);
                
                e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
                e.setGrade(80);
                enrollments.add(e);
                
                e = new Enrollment(physicsFall.getSectionID(), s.getStudentID());
                e.setGrade(100);
                enrollments.add(e);
                
                e = new Enrollment(physicsSpring.getSectionID(), s.getStudentID());
                e.setGrade(90);
                enrollments.add(e);
                
                s = new Student("Jane", "", "Jackson", new GregorianCalendar(1995, 1, 23).getTime(),
                                        eMajor.PHYSICS, "New York", "(000)-000-0000", "jane@gmail.com");
                students.add(s);
                e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
                e.setGrade(60);
                enrollments.add(e);
                
                e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
                e.setGrade(70);
                enrollments.add(e);
                
                e = new Enrollment(physicsFall.getSectionID(), s.getStudentID());
                e.setGrade(95);
                enrollments.add(e);
                
                e = new Enrollment(physicsSpring.getSectionID(), s.getStudentID());
                e.setGrade(95);
                enrollments.add(e);
            }
            catch (PersonException pe) {
                System.err.println(pe.getMessage());
            }
        }

	@Test
	public void testGPACourse() {
		for (Course c : courses) {
                    UUID uuid = c.getCourseID();
                    double average = 0;
                    int count = 0;
                    for (Section s : sections) {
                        if (s.getCourseID() == uuid) {
                            UUID suuid = s.getSectionID();
                            for (Enrollment e : enrollments) {
                                if (e.getSectionID() == suuid) {
                                    average += e.getGrade();
                                    count++;
                                }
                            }
                        }
                    }
                    average /= count;
                    switch (c.getCourseName()) {
                        case "Maths":
                            assertEquals(81.25, average, 0.001);
                            break;
                        case "Physics":
                            assertEquals(83.125, average, 0.001);
                            break;
                        case "Chemistry":
                            assertEquals(92.5, average, 0.001);
                            break;
                    }
                }
	}
        
        @Test
	public void testGPAStudent() {
                for (Student s : students) {
                    double average = 0;
                    int count = 0;
                    UUID uuid = s.getStudentID();
                    for (Enrollment e : enrollments) {
                        if (e.getStudentID() == uuid) {
                            average += e.getGrade();
                            count++;
                        }
                    }
                    
                    average /= count;
                    
                    switch (s.getFirstName()) {
                        case "Ashley":
                            assertEquals(82.5, average, 0.001);
                            break;
                        case "Bob":
                            assertEquals(95, average, 0.001);
                            break;
                        case "Chris":
                            assertEquals(87.5, average, 0.001);
                            break;
                        case "Dave":
                            assertEquals(85, average, 0.001);
                            break;
                        case "Ethan":
                            assertEquals(75, average, 0.001);
                            break;
                        case "Frank":
                            assertEquals(70, average, 0.001);
                            break;
                            
                        case "Gregory":
                            assertEquals(95, average, 0.001);
                            break;
                            
                        case "Hugh":
                            assertEquals(85, average, 0.001);
                            break;
                            
                        case "Irene":
                            assertEquals(87.5, average, 0.001);
                            break;
                        case "Jane":
                            assertEquals(80, average, 0.001);
                            break;
                    }
                }
	}
        
        @Test
	public void testStudentMajor() {
            try {
                Student s = new Student("Irene", "", "Idlewood", new GregorianCalendar(1995, 8, 23).getTime(),
                                        eMajor.PHYSICS, "New York", "(999)-999-9999", "irene@gmail.com");
                s.setMajor(eMajor.NURSING);
                assertEquals(eMajor.NURSING, s.getMajor());
            }
            
            catch (PersonException pe) {
                System.err.println(pe.getMessage());
            }
        }
}