package com.Assignment;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() {
        // Create a new Person instance before each test
        person = new Person("John", "Doe", 25);
    }

    @After
    public void tearDown() {
        // Clean up resources after each test (if needed)
        person = null;
    }

    @Test
    public void testGetFullName() {
        // Check if the full name is correctly formatted
        String fullName = person.getFullName();
        assertEquals("John Doe", fullName);
    }

    @Test
    public void testIsAdult() {
        // Check if the person is considered an adult
        assertTrue(person.isAdult());
    }

    @Test
    public void testIsNotAdult() {
        // Create a new person who is not an adult
        Person youngPerson = new Person("Jane", "Doe", 16);
        assertFalse(youngPerson.isAdult());
    }

    @Test
    public void testInvalidAgeException() {
        // Test that InvalidAgeException is thrown for a negative age
        assertThrows(InvalidAgeException.class, () -> {
            new Person("John", "Doe", -1);
        });
    }
}
