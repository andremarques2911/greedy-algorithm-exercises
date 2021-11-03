import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GreedyAlgorithmsTests {

    @Test
    public void changeProblem() {
        ChangeProblem changeProblem = new ChangeProblem(new int[]{ 100, 25, 10, 5, 1 });
        var res = changeProblem.execute(2.89);
        var expected = new int[]{ 2, 3, 1, 0, 4 };
        assertEquals(expected.length, res.length);
        for (int i = 0; i < expected.length; i++)
            assertEquals(expected[i], res[i]);
        printIterations(changeProblem.iterations);
    }

    @Test
    public void IntervalScalingProblem() {
        int[] s = { 4, 6, 13, 4, 2, 6, 7,  9,  1, 3,  9 };
        int[] f = { 8, 7, 14, 5, 4, 9, 10, 11, 6, 13, 12 };
        int[] expected = { 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0 };
        var res = IntervalScalingProblem.execute(s, f, 11);
        assertEquals(expected.length, res.length);
        for (int i = 0; i < expected.length; i++)
            assertEquals(expected[i], res[i]);
        printIterations(IntervalScalingProblem.iterations);
    }

    @Test
    public void NQueensProblem() {
        NQueensProblem nQueensProblem = new NQueensProblem(7);
        var res = nQueensProblem.execute();
        assertEquals(7, res.size());
        printIterations(nQueensProblem.iterations);
    }

    private void printIterations(int iterations) {
        System.out.println("Iteracoes: " + iterations);
    }
}
