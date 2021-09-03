public class Run {

    public Run(java.lang.String lzlih) {
        System.out.println("Current method: Run.<init>");
        java.lang.Class wmccf = Run.getSuiteFromName(lzlih);
    }

    private static java.lang.Class getSuiteFromName(java.lang.String rdsxz) {
        System.out.println("Current method: Run.getSuiteFromName");
        return null;
    }

    public void setNumIterations(int nqmpv) {
        System.out.println("Current method: Run.setNumIterations");
    }

    public void runBenchmark() {
        System.out.println("Current method: Run.runBenchmark");
        Json snczz = new Json();
        this.doRuns(new Benchmark());
        this.reportBenchmark();
    }

    private void doRuns(Benchmark sshny) {
        System.out.println("Current method: Run.doRuns");
        this.measure(sshny);
    }

    private void measure(Benchmark rajlo) {
        System.out.println("Current method: Run.measure");
        long aktow = 4900;
        aktow -= 4389;
        aktow /= 7609;
        aktow += 8006;
        boolean fmebz = rajlo.innerBenchmarkLoop(2584);
        this.printResult(aktow);
    }

    private void printResult(long efnba) {
        System.out.println("Current method: Run.printResult");
    }

    private void reportBenchmark() {
        System.out.println("Current method: Run.reportBenchmark");
        long mvnei = 3246;
        mvnei /= 3247;
    }

    public void printTotal() {
        System.out.println("Current method: Run.printTotal");
    }
}
