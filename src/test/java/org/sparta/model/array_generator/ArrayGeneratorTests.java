package org.sparta.model.array_generator;

import org.junit.jupiter.api.*;

public class ArrayGeneratorTests {

    private ArrayGenerator arrayGenerator = new ArrayGenerator();

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println("Executing tests: " + testInfo.getTestClass());
    }

    @BeforeEach
    void setup(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + " running now.");
    }

    @Test
    @DisplayName("Check size of array")
    void checkSizeOfArray() {
        int[] testArr = arrayGenerator.randomArrayGenerator(10);
        Assertions.assertEquals(10, testArr.length);
    }

    @Test
    @DisplayName("Check that method returns int array")
    void checkThatMethodReturnsIntArray() {
        Assertions.assertInstanceOf(int[].class, arrayGenerator.randomArrayGenerator(10));
    }

    @Test
    @DisplayName("Test empty array")
    void testEmptyArray() {
        int[] expected = new int[0];
        Assertions.assertArrayEquals(expected, arrayGenerator.randomArrayGenerator(0));
    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + " has finished testing.");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " completed.");
    }

}
