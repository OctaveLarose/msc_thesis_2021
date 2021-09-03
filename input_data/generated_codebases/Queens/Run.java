public class Run {

    public Run(java.lang.String zcxwn) {
        System.out.println("Current method: Run.<init>");
        java.lang.Class hwjve = Run.getSuiteFromName(zcxwn);
    }

    private static java.lang.Class getSuiteFromName(java.lang.String ihnfv) {
        System.out.println("Current method: Run.getSuiteFromName");
        return null;
    }

    public void setNumIterations(int dnqfg) {
        System.out.println("Current method: Run.setNumIterations");
    }

    public void runBenchmark() {
        System.out.println("Current method: Run.runBenchmark");
        Queens mbfly = new Queens();
        this.doRuns(new Benchmark());
        this.reportBenchmark();
    }

    private void doRuns(Benchmark xydum) {
        System.out.println("Current method: Run.doRuns");
        this.measure(xydum);
    }

    private void measure(Benchmark ndyvt) {
        System.out.println("Current method: Run.measure");
        long aqhkd = 1771;
        aqhkd -= 3791;
        aqhkd /= 2488;
        aqhkd += 3473;
        boolean kpvxg = ndyvt.innerBenchmarkLoop(5889);
        this.printResult(aqhkd);
    }

    private void printResult(long ulrnl) {
        System.out.println("Current method: Run.printResult");
    }

    private void reportBenchmark() {
        System.out.println("Current method: Run.reportBenchmark");
        long hbuhz = 148;
        hbuhz /= 5074;
    }

    public void printTotal() {
        System.out.println("Current method: Run.printTotal");
    }
}
