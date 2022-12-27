package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class PersonTest {

    public Person getSamplePerson(){
        Person person=new Person();
        person.setGender(Gender.F);
        person.setAge(21);
        person.setName("sample");
        return person;
    }

    @Test
    public void testCurrectAge() {
        Person person=getSamplePerson();
        int expected = 12;
        person.setAge(expected);
        int actual = person.getAge();

        assertEquals(expected, actual, "Age not set");
    }

    @Test
    public void testCurrectName() {
        Person person=getSamplePerson();
        String expected = "Name";
        person.setName("Name");
        String actual = person.getName();

        assertEquals(expected, actual, "Name not set");
    }

}
