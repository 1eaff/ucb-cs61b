package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
    @Test
    public void testThreeAddThreeRemove() {
        int[] testDataset = {4, 5, 6};
        AListNoResizing<Integer> alst = new AListNoResizing<>();
        BuggyAList<Integer> blst = new BuggyAList<>();
        for (int x : testDataset) {
            alst.addLast(x);
            blst.addLast(x);
        }
        for (int __ : testDataset) {
            assertEquals(alst.getLast(), blst.getLast());
        }
    }

    @Test
    public void randomizedTest() {
        AListNoResizing<Integer> L = new AListNoResizing<>();
        BuggyAList<Integer> B = new BuggyAList<>();

        int N = 5000;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 4);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                B.addLast(randVal);
            } else if (operationNumber == 1) {
                // size
                assertEquals(L.size(), B.size());
            } else if (operationNumber == 2 && L.size() != 0) {
                // getLast
                assertEquals(L.getLast(), B.getLast());
            } else if (operationNumber == 3 && L.size() != 0) {
                // removeLast
                assertEquals(L.removeLast(), B.removeLast());
            }
        }
    }
}
