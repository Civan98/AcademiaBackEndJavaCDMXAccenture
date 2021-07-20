package com.platzi.javatests.Reto1;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.internal.util.StringUtil;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Reto1Test extends TestCase {
    @Test
    public void string_is_not_void() {
        assertFalse(Reto1.isEmpty("Hola") );
    }

    @Test
    public void string_is_void_comillas() {
        assertTrue(Reto1.isEmpty("") );
    }
    @Test
    public void string_is_void_with_null() {
        assertTrue(Reto1.isEmpty(null) );
    }
    @Test
    public void string_is_void_with_space() {
        assertTrue(Reto1.isEmpty("  ") );
    }

}