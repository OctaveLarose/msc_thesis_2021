public class Run {

    public Run(java.lang.String tzbnj) {
        System.out.println("Current method: Run.<init>");
        java.lang.Class mlydj = Run.getSuiteFromName(tzbnj);
    }

    private static java.lang.Class getSuiteFromName(java.lang.String hyonb) {
        System.out.println("Current method: Run.getSuiteFromName");
        return null;
    }

    public void setNumIterations(int lxpga) {
        System.out.println("Current method: Run.setNumIterations");
    }

    public void runBenchmark() {
        System.out.println("Current method: Run.runBenchmark");
        Sieve tfhrc = new Sieve();
        this.doRuns(new Benchmark());
        this.reportBenchmark();
    }

    private void doRuns(Benchmark dljja) {
        System.out.println("Current method: Run.doRuns");
        this.measure(dljja);
    }

    private void measure(Benchmark pbvgk) {
        System.out.println("Current method: Run.measure");
        long baays = 2552;
        baays -= 3997;
        baays /= 1337;
        baays += 2676;
        boolean xgkqc = pbvgk.innerBenchmarkLoop(3139);
        this.printResult(baays);
    }

    private void printResult(long ygktd) {
        System.out.println("Current method: Run.printResult");
    }

    private void reportBenchmark() {
        System.out.println("Current method: Run.reportBenchmark");
        long xeyqx = 2342;
        xeyqx /= 4974;
    }

    public void printTotal() {
        System.out.println("Current method: Run.printTotal");
    }
}
