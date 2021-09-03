public class Run {

    public Run(java.lang.String ldhva) {
        System.out.println("Current method: Run.<init>");
        java.lang.Class zdtkc = Run.getSuiteFromName(ldhva);
    }

    private static java.lang.Class getSuiteFromName(java.lang.String ddhnm) {
        System.out.println("Current method: Run.getSuiteFromName");
        return null;
    }

    public void setNumIterations(int yeoda) {
        System.out.println("Current method: Run.setNumIterations");
    }

    public void runBenchmark() {
        System.out.println("Current method: Run.runBenchmark");
        Permute ylqqy = new Permute();
        this.doRuns(new Benchmark());
        this.reportBenchmark();
    }

    private void doRuns(Benchmark elmih) {
        System.out.println("Current method: Run.doRuns");
        this.measure(elmih);
    }

    private void measure(Benchmark zzafv) {
        System.out.println("Current method: Run.measure");
        long fqrpa = 831;
        fqrpa -= 3356;
        fqrpa /= 7044;
        fqrpa += 8804;
        boolean qbxvc = zzafv.innerBenchmarkLoop(7065);
        this.printResult(fqrpa);
    }

    private void printResult(long evehk) {
        System.out.println("Current method: Run.printResult");
    }

    private void reportBenchmark() {
        System.out.println("Current method: Run.reportBenchmark");
        long sklnq = 528;
        sklnq /= 328;
    }

    public void printTotal() {
        System.out.println("Current method: Run.printTotal");
    }
}
