package linkedlist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList<String> linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList<>();
    }

    @Test
    void testAddToEmptyList() {
        linkedList.add("s1");
        assertEquals("[s1]", linkedList.toString());
    }

    @Test
    void testAddMultipleElements() {
        linkedList.add("s1");
        linkedList.add("s2");
        linkedList.add("s3");
        assertEquals("[s1 -> s2 -> s3]", linkedList.toString());
    }

    @Test
    void testToStringEmptyList() {
        assertEquals("[]", linkedList.toString());
    }

    @Test
    void testToStringSingleElement() {
        linkedList.add("s1");
        assertEquals("[s1]", linkedList.toString());
    }
}

