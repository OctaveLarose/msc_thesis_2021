public class Run {

    public Run(java.lang.String asgsj) {
        System.out.println("Current method: Run.<init>");
        java.lang.Class ruhtf = Run.getSuiteFromName(asgsj);
    }

    private static java.lang.Class getSuiteFromName(java.lang.String nolhg) {
        System.out.println("Current method: Run.getSuiteFromName");
        return null;
    }

    public void setNumIterations(int uwtcw) {
        System.out.println("Current method: Run.setNumIterations");
    }

    public void runBenchmark() {
        System.out.println("Current method: Run.runBenchmark");
        Storage gunjw = new Storage();
        this.doRuns(new Benchmark());
        this.reportBenchmark();
    }

    private void doRuns(Benchmark vwzbk) {
        System.out.println("Current method: Run.doRuns");
        this.measure(vwzbk);
    }

    private void measure(Benchmark tjsup) {
        System.out.println("Current method: Run.measure");
        long riqor = 6896;
        riqor -= 3730;
        riqor /= 2715;
        riqor += 9762;
        boolean uhnni = tjsup.innerBenchmarkLoop(2021);
        this.printResult(riqor);
    }

    private void printResult(long gwbrz) {
        System.out.println("Current method: Run.printResult");
    }

    private void reportBenchmark() {
        System.out.println("Current method: Run.reportBenchmark");
        long vlejc = 5813;
        vlejc /= 4809;
    }

    public void printTotal() {
        System.out.println("Current method: Run.printTotal");
    }
}
