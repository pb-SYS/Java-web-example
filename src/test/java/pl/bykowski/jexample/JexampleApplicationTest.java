package pl.bykowski.jexample;

import org.junit.Test;

import static org.junit.Assert.*;

public class JexampleApplicationTest {

    @Test
    public void added() {
        JexampleApplication jexampleApplication = new JexampleApplication();
        assertEquals(10, jexampleApplication.added(5,5));
    }
}