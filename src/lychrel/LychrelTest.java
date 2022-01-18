package lychrel;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LychrelTest {

    private final int LIMIT = 1000;

    @Ignore
    @Test
    public void facts() throws Exception {
        convergesAtIteration(1, 0);
        convergesAtIteration(2, 0);
        convergesAtIteration(10, 1);
        convergesAtIteration(11, 0);
    }

    private void convergesAtIteration(int n, int iteration) {
        assertEquals(iteration, Lychrel.convergesAtIteration(n, LIMIT));
    }
}