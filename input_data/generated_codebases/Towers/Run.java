public class Run {

    public Run(java.lang.String yjhks) {
        System.out.println("Current method: Run.<init>");
        java.lang.Class pasef = Run.getSuiteFromName(yjhks);
    }

    private static java.lang.Class getSuiteFromName(java.lang.String vvude) {
        System.out.println("Current method: Run.getSuiteFromName");
        return null;
    }

    public void setNumIterations(int xzzle) {
        System.out.println("Current method: Run.setNumIterations");
    }

    public void runBenchmark() {
        System.out.println("Current method: Run.runBenchmark");
        Towers bkkso = new Towers();
        this.doRuns(new Benchmark());
        this.reportBenchmark();
    }

    private void doRuns(Benchmark skatk) {
        System.out.println("Current method: Run.doRuns");
        this.measure(skatk);
    }

    private void measure(Benchmark wvsso) {
        System.out.println("Current method: Run.measure");
        long wytsz = 1305;
        wytsz -= 8622;
        wytsz /= 2490;
        wytsz += 9245;
        boolean jvglf = wvsso.innerBenchmarkLoop(382);
        this.printResult(wytsz);
    }

    private void printResult(long qbblg) {
        System.out.println("Current method: Run.printResult");
    }

    private void reportBenchmark() {
        System.out.println("Current method: Run.reportBenchmark");
        long kixzy = 9579;
        kixzy /= 9534;
    }

    public void printTotal() {
        System.out.println("Current method: Run.printTotal");
    }
}
