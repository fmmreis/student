package edu.pdx.cs410J.student;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void StudentNameEqualsXico() {
		Student s = new Student("Xico");
		assertEquals(s.getName(), "Xico");
	}
}
