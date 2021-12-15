package org.sparta.model.sorters;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.sparta.model.sorters.binary_tree.BinaryTree;

public class BinaryTreeTests {

    private int[] unsorted = new int[]{5,2,4,1,3};
    private BinaryTree binaryTree;
    private BinaryTree mockTree;

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println("Executing: " + testInfo.getClass());
    }

    @BeforeEach
    void setup(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + " running now.");
        binaryTree = new BinaryTree();
        mockTree = Mockito.mock(BinaryTree.class);
    }

    @Nested
    @DisplayName("Tests concerning the Sortable interface methods")
    class InterfaceMethodTests {
        @Test
        @DisplayName("Check that sort method works")
        void checkThatAlgorithmWorks() {
            int[] expected = new int[]{1,2,3,4,5};
            Assertions.assertArrayEquals(expected, binaryTree.sort(unsorted));
        }

        @Test
        @DisplayName("Check that sort returns int array")
        void checkThatSortReturnsIntArray() {
            Assertions.assertInstanceOf(int[].class, binaryTree.sort(unsorted));

        }

        @Test
        @DisplayName("Check that getTime returns long")
        void checkThatGetTimeReturnsLong() {
            Assertions.assertInstanceOf(Long.class, binaryTree.getTime());
        }

    }

    @Nested
    @DisplayName("Internal tests for binary tree functions")
    @Disabled
    class TreeTests {
        @Test
        @DisplayName("Check in-order traversal used for sort method")
        void checkInOrderTraversalUsedForSortMethod() {
            mockTree.sort(unsorted);
        }
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