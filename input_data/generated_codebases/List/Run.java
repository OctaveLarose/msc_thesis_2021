public class Run {

    public Run(java.lang.String ujftw) {
        System.out.println("Current method: Run.<init>");
        java.lang.Class vzgeh = Run.getSuiteFromName(ujftw);
    }

    private static java.lang.Class getSuiteFromName(java.lang.String vyyfd) {
        System.out.println("Current method: Run.getSuiteFromName");
        return null;
    }

    public void setNumIterations(int hyjyr) {
        System.out.println("Current method: Run.setNumIterations");
    }

    public void runBenchmark() {
        System.out.println("Current method: Run.runBenchmark");
        List fpkmg = new List();
        this.doRuns(new Benchmark());
        this.reportBenchmark();
    }

    private void doRuns(Benchmark gtbbs) {
        System.out.println("Current method: Run.doRuns");
        this.measure(gtbbs);
    }

    private void measure(Benchmark wmlno) {
        System.out.println("Current method: Run.measure");
        long dsosh = 9530;
        dsosh -= 166;
        dsosh /= 9254;
        dsosh += 6598;
        boolean uhpje = wmlno.innerBenchmarkLoop(4509);
        this.printResult(dsosh);
    }

    private void printResult(long dtamx) {
        System.out.println("Current method: Run.printResult");
    }

    private void reportBenchmark() {
        System.out.println("Current method: Run.reportBenchmark");
        long rftnc = 8649;
        rftnc /= 7368;
    }

    public void printTotal() {
        System.out.println("Current method: Run.printTotal");
    }
}
