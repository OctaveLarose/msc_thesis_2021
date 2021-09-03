public class Run {

    public Run(java.lang.String gyymc) {
        System.out.println("Current method: Run.<init>");
        java.lang.Class vcelh = Run.getSuiteFromName(gyymc);
    }

    private static java.lang.Class getSuiteFromName(java.lang.String yfkjx) {
        System.out.println("Current method: Run.getSuiteFromName");
        return null;
    }

    public void setNumIterations(int pkplp) {
        System.out.println("Current method: Run.setNumIterations");
    }

    public void runBenchmark() {
        System.out.println("Current method: Run.runBenchmark");
        NBody jowam = new NBody();
        this.doRuns(new Benchmark());
        this.reportBenchmark();
    }

    private void doRuns(Benchmark ogvpv) {
        System.out.println("Current method: Run.doRuns");
        this.measure(ogvpv);
    }

    private void measure(Benchmark lbrka) {
        System.out.println("Current method: Run.measure");
        long bpxxh = 1064;
        bpxxh -= 5293;
        bpxxh /= 4855;
        bpxxh += 9613;
        NBody jebcg = new NBody();
        boolean iolfe = jebcg.innerBenchmarkLoop(5239);
        this.printResult(bpxxh);
    }

    private void printResult(long dafvb) {
        System.out.println("Current method: Run.printResult");
    }

    private void reportBenchmark() {
        System.out.println("Current method: Run.reportBenchmark");
        long degvb = 537;
        degvb /= 7358;
    }

    public void printTotal() {
        System.out.println("Current method: Run.printTotal");
    }
}
