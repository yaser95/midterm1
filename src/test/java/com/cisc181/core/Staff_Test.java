package com.cisc181.core;

import com.cisc181.eNums.eTitle;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void testAverage() {
                ArrayList<Staff> staffs = new ArrayList<>();
                try {
                    staffs.add(new Staff("John", "", "Johnson",
                            new GregorianCalendar(1970, 1, 1).getTime(), 
                            "London", "(777)-777-7777", "johnson@gmail.com", "", 0, 1000.0, 
                            new GregorianCalendar(2000, 7, 1).getTime(), eTitle.MR));
                    staffs.add(new Staff("Will", "", "Williams",
                            new GregorianCalendar(1968, 3, 10).getTime(), 
                            "Washington", "(777)-111-7777", "williams@gmail.com", "", 0, 1100.0, 
                            new GregorianCalendar(1995, 7, 9).getTime(), eTitle.MR));
                    staffs.add(new Staff("Steve", "", "Stevenson",
                            new GregorianCalendar(1973, 9, 1).getTime(), 
                            "Melbourne", "(333)-111-7777", "stevenson@gmail.com", "", 0, 900.0, 
                            new GregorianCalendar(1995, 7, 9).getTime(), eTitle.MR));
                    staffs.add(new Staff("Robert", "", "Robertson",
                            new GregorianCalendar(1955, 5, 5).getTime(), 
                            "Capetown", "(333)-111-0033", "robertson@gmail.com", "", 0, 1300.0, 
                            new GregorianCalendar(1988, 1, 9).getTime(), eTitle.MR));
                    staffs.add(new Staff("David", "", "Davidson",
                            new GregorianCalendar(1980, 6, 5).getTime(), 
                            "Vancouver", "(333)-161-0033", "davidson@gmail.com", "", 0, 700.0, 
                            new GregorianCalendar(2010, 10, 9).getTime(), eTitle.MR));
                }
                catch (PersonException pe) {
                    System.err.println(pe.getMessage());
                }
		double average = 0;
                for (Staff staff: staffs) {
                    average += staff.getSalary();
                }
                average /= staffs.size();
                
                assertEquals(1000.0, average, 0.0001);
	}	

        
        @Test(expected = PersonException.class)
	public void testExceptionPhone() throws PersonException{
                Staff staff = new Staff("David", "", "Davidson",
                            new GregorianCalendar(1980, 6, 5).getTime(), 
                            "Vancouver", "(3339)-161-0033", "davidson@gmail.com", "", 0, 700.0, 
                            new GregorianCalendar(2010, 10, 9).getTime(), eTitle.MR);
                
	}
        
        @Test(expected = PersonException.class)
	public void testExceptionDate() throws PersonException{
                Staff staff = new Staff("David", "", "Davidson",
                            new GregorianCalendar(1916, 6, 5).getTime(), 
                            "Vancouver", "(333)-161-0033", "davidson@gmail.com", "", 0, 700.0, 
                            new GregorianCalendar(2010, 10, 9).getTime(), eTitle.MR);
                
	}

}
