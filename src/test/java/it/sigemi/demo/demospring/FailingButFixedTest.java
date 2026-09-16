package it.sigemi.demo.demospring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FailingButFixedTest {
    @Test
    void not_not_ok() {
        var result = 1 + 1;
        assertEquals(2, result);
    }
}
