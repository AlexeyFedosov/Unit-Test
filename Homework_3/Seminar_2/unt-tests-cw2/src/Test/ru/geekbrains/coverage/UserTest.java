package ru.geekbrains.coverage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void userCreate() {
        User user = new User("name", "qwerty");
        assertTrue(user.auth("name", "qwerty"));
    }

    @Test
    void userCreateFail() {
        User user = new User("name", "qwerty");
        assertFalse(user.auth("name", "123"));

    }
}
