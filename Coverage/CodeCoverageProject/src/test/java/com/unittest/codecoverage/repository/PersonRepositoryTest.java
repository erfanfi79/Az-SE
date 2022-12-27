package com.unittest.codecoverage.repository;

import com.unittest.codecoverage.exceptions.PersonException;
import com.unittest.codecoverage.models.Gender;
import com.unittest.codecoverage.models.Person;
import com.unittest.codecoverage.repositories.PersonRepository;
import com.unittest.codecoverage.samples.MyCustomList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class PersonRepositoryTest {

    private final PersonRepository repository=new PersonRepository();

    @Test
    public void insert_throwNullPointerException() {
        Person person=new Person();
        person.setName("Name");
        person.setAge(21);
        person.setGender(Gender.M);

        assertThatThrownBy(() -> repository.insert(null))
                .isInstanceOf(NullPointerException.class);
        repository.insert(person);
    }

    @Test
    public void delete_throwNullPointerException() {
        assertThatThrownBy(() -> repository.delete(null))
                .isInstanceOf(NullPointerException.class);
        repository.delete("Name");
    }

    @Test
    public void update_throwNullPointerException() {
        Person person=new Person();
        person.setName("Name");
        person.setAge(21);
        person.setGender(Gender.M);

        assertThatThrownBy(() -> repository.update(null))
                .isInstanceOf(NullPointerException.class);
        repository.update(person);
    }

    @Test
    public void get_throwNullPointerException() {
        assertThatThrownBy(() -> repository.get(null))
                .isInstanceOf(NullPointerException.class);
        assertNull(repository.get("Name"));
    }

}

