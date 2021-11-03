public class IntervalScalingProblem {

    public static int iterations = 0;

    public static int[] execute(int[] s, int[] f, int n) {
        sort(s, f);
        int[] x = new int[n];
        int i = 0;
        for (int k = 1; k < n; k++) {
            if (s[k] >= f[i]) {
                x[i + 1] = 1;
                i = k;
            }
            iterations++;
        }
        return x;
    }

    private static void sort(int[] s, int[] f) {
        boolean changed;
        do {
            changed = false;
            for (var i=0; i < s.length - 1; i++) {
                if (f[i] > f[i+1]) {
                    f[i] = f[i] ^ f[i+1];
                    f[i+1] = f[i+1] ^ f[i];
                    f[i] = f[i] ^ f[i+1];

                    s[i] = s[i] ^ s[i+1];
                    s[i+1] = s[i+1] ^ s[i];
                    s[i] = s[i] ^ s[i+1];

                    changed = true;
                }
            }
        } while (changed);
    }

}
