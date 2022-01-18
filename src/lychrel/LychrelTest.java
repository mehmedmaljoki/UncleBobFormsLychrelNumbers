package lychrel;

import org.junit.Test;

import static org.junit.Assert.*;

public class LychrelTest {

    private final int LIMIT = 1000;

    @Test
    public void facts() throws Exception {
        isNotLychrel(1, 0);
        isNotLychrel(2, 0);
        isNotLychrel();
    }

    private void isNotLychrel(int n, int iteration) {
        assertEquals(iteration, Lychrel.convergesAtIteration(n, LIMIT));
    }
}