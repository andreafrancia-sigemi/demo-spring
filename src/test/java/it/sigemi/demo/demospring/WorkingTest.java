package it.sigemi.demo.demospring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkingTest {
    @Test
    void ok() {
        var result = 1 + 1;
        assertEquals(2, result);
    }
}
