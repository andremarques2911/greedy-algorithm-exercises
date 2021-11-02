public class ChangeProblem {

    public int iterations = 0;
    private final int[] values;

    public ChangeProblem(int[] values) {
        this.values = values;
    }


    public int[] execute(double value) {
        int[] amount = new int[values.length];
        value *= 100;
        for (double i = value; i > 0; i--) {
            for (int j = 0; j < values.length; j++) {
                if (value >= values[j]) {
                    value -= values[j];
                    amount[j]++;
                    break;
                }
                iterations++;
            }
        }
        return amount;
    }

}
