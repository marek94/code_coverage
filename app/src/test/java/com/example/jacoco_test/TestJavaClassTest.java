package com.example.jacoco_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJavaClassTest {

    TestJavaClass sut = new TestJavaClass();

    @Test
    public void add() {
        assertEquals(sut.add(2, 3), 5);
    }
}