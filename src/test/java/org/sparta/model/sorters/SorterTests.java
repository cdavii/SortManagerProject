package org.sparta.model.sorters;

import org.junit.jupiter.api.*;

public class SorterTests {

    private static Sortable sorter;
    private int[] unsorted = new int[]{5,2,4,1,3};
    private int[] expected = new int[]{1,2,3,4,5};

    @BeforeAll
    static void setupAll() {
        sorter = SortFactory.getSorter(1);
        System.out.println("Testing using " + sorter.getName());
    }

    @BeforeEach
    void setup(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + " running now.");
    }

    @Test
    @DisplayName("Check that sort returns int array")
    void checkThatSortReturnsIntArray() {
        Assertions.assertInstanceOf(int[].class, sorter.sort(unsorted));
    }

    @Test
    @DisplayName("Check that getTime returns long")
    void checkThatGetTimeReturnsLong() {
        Assertions.assertInstanceOf(Long.class, sorter.getTime());
    }

    @Test
    @DisplayName("Check that getName returns string")
    void checkThatGetNameReturnsString() {
        Assertions.assertInstanceOf(String.class, sorter.getName());
    }

    @Test
    @DisplayName("Check that array is sorted")
    void checkThatArrayIsSorted() {
        Assertions.assertArrayEquals(expected, sorter.sort(unsorted));
    }

    @Test
    @DisplayName("Test empty array")
    void testEmptyArray() {
        int[] expected = new int[0];
        Assertions.assertArrayEquals(expected, sorter.sort(new int[0]));
    }

    @Test
    @DisplayName("Test array with duplicates")
    void testArrayWithDuplicates() {
        int[] sorted = new int[]{1,2,2,2,3};
        int[] unsorted = new int[]{2,1,2,3,2};
        Assertions.assertArrayEquals(sorted, sorter.sort(unsorted));
    }

    @Test
    @DisplayName("Test already sorted array")
    void testAlreadySortedArray() {
        Assertions.assertArrayEquals(expected, sorter.sort(expected));
    }

    @AfterEach
            void tearDown(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + " has finished testing.");
    }

    @AfterAll
            static void tearDownAll() {
        System.out.println("Tests for " + sorter.getName() + " completed.");
    }


}
