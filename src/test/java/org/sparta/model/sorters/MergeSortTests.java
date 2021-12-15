package org.sparta.model.sorters;

import org.junit.jupiter.api.*;

public class MergeSortTests {

    MergeSort mergeSort = new MergeSort();
    int[] unsorted = new int[]{5,2,4,1,3};

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println("Executing tests: " + testInfo.getTestClass());
    }

    @BeforeEach
    void setup(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + " running now.");
    }

    @Test
    @DisplayName("Check that algorithm works")
    void checkThatAlgorithmWorks() {
        int[] expected = new int[]{1,2,3,4,5};
        Assertions.assertArrayEquals(expected, mergeSort.sort(unsorted));
    }

    @Test
    @DisplayName("Check that sort returns int array")
    void checkThatSortReturnsIntArray() {
        Assertions.assertInstanceOf(int[].class, mergeSort.sort(unsorted));
    }

    @Test
    @DisplayName("Check that getTime returns long")
    void checkThatGetTimeReturnsLong() {
        Assertions.assertInstanceOf(Long.class, mergeSort.getTime());
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
