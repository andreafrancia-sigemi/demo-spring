package it.sigemi.demo.demospring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FailingTest {
    @Test
    void not_ok() {
        var result = 1 + 1;
        assertEquals(1, result);
    }
}
