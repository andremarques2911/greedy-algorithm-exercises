import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GreedyAlgorithmsTests {

    @Test
    public void changeProblem() {
        ChangeProblem changeProblem = new ChangeProblem(new int[]{ 100, 25, 10, 5, 1 });
        var res = changeProblem.execute(2.89);
        var expected = new int[]{ 2, 3, 1, 0, 4 };
        Assertions.assertEquals(expected.length, res.length);
        for (int i = 0; i < expected.length; i++)
            Assertions.assertEquals(expected[i], res[i]);
        printIterations(changeProblem.iterations);
    }

    @Test
    public void IntervalScalingProblem() {
        int[] s = { 4, 6, 13, 4, 2, 6, 7,  9,  1, 3,  9 };
        int[] f = { 8, 7, 14, 5, 4, 9, 10, 11, 6, 13, 12 };
        var res = IntervalScalingProblem.execute(s, f, 11);
        printIterations(IntervalScalingProblem.iterations);
    }

    @Test
    public void NQueensProblem() {
        NQueensProblem nQueensProblem = new NQueensProblem(7);
        var res = nQueensProblem.execute();
        printIterations(nQueensProblem.iterations);
    }

    private void printIterations(int iterations) {
        System.out.println("Iteracoes: " + iterations);
    }
}
