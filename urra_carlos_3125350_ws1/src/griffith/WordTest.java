package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordTest {

    @Test
    void testContains() {
        Word word = new Word(new char[] {'c', 'a', 'r', 'l', 'o', 's'});
        assertTrue(word.contains('c'), "Word should contain 'c'");
        assertTrue(word.contains('a'), "Word should contain 'a'");
        assertTrue(word.contains('s'), "Word should contain 's'");
    }

    @Test
    void testLength() {
        Word word1 = new Word(new char[] {'H'});
        assertEquals(1, word1.length(), "Length should be 1");

        Word word2 = new Word(new char[] {'H', 'e', 'l', 'l', 'o'});
        assertEquals(5, word2.length(), "Length should be 5");

        Word word3 = new Word(new char[] {});
        assertEquals(0, word3.length(), "Length should be 0");
	}
    

    @Test
    void testNotNull() {
        Word word = new Word(new char[] {'c', 'a', 'r', 'l', 'o', 's'});
        assertNotNull(word.getLetters(), "Letters array should not be null");
	}
}
