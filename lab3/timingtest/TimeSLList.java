package timingtest;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeGetLast();
    }

    private static double benchmark(int n, int m) {
        SLList<Integer> slst = new SLList<>();
        for (int ix = 0; ix != n; ++ix) {
            slst.addLast(ix);
        }
        Stopwatch sw = new Stopwatch();
        for (int ix = 0; ix != m; ++ix) {
            slst.getLast();
        }
        return sw.elapsedTime();
    }

    public static void timeGetLast() {

        int[] ns = { 1000, 2000, 4000, 8000, 16000, 32000, 64000, 128000 };
        int m = 10000;

        AList<Integer> Ns = new AList<>();
        AList<Double> times = new AList<>();
        AList<Integer> ops = new AList<>();

        for(int n: ns) {
            Ns.addLast(n);
            ops.addLast(m);
            times.addLast(benchmark(n, m));
        }

        printTimingTable(Ns, times, ops);
    }

}
