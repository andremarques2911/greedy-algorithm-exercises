import java.util.ArrayList;
import java.util.List;

public class IntervalScalingProblem {

    public static int iterations = 0;

    public static List<Integer> execute(int[] s, int[] f, int n) {
        List<Integer> x = new ArrayList<>();
        int i = 0;
        for (int k = 0; k < n; k++) {
            if (s[k] > f[i] && !x.contains(s[k])) {
                x.add(s[k]);
                i = k;
            }
            iterations++;
        }
        return x;
    }

}
