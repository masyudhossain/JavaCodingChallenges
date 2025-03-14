package linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
    private ReverseLinkedList<String> linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new ReverseLinkedList<>();
    }

    @Test
    void testAdd() {
        linkedList.add("s1");
        linkedList.add("s2");
        linkedList.add("s3");

        assertEquals("[s1 -> s2 -> s3]", linkedList.toString());
    }

    @Test
    void testReverseSingleNode() {
        linkedList.add("s1");
        linkedList.reverse();
        assertEquals("[s1]", linkedList.toString());
    }

    @Test
    void testReverseMultipleNodes() {
        linkedList.add("s1");
        linkedList.add("s2");
        linkedList.add("s3");
        linkedList.add("s4");

        linkedList.reverse();
        assertEquals("[s4 -> s3 -> s2 -> s1]", linkedList.toString());
    }

    @Test
    void testReverseEmptyList() {
        linkedList.reverse();
        assertEquals("[]", linkedList.toString());
    }

    @Test
    void testReverseWithTwoNodes() {
        linkedList.add("s1");
        linkedList.add("s2");

        linkedList.reverse();
        assertEquals("[s2 -> s1]", linkedList.toString());
    }
}
