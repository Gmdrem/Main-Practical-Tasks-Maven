package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    void exception() {
        Assertions.assertThrows(AssertionError.class, () -> {
            System.out.println((String) null);
            Assertions.assertTrue(false);
        });
    }
}
