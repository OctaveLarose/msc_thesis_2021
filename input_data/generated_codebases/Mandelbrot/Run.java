public class Run {

    public Run(java.lang.String itblh) {
        System.out.println("Current method: Run.<init>");
        java.lang.Class hhfrz = Run.getSuiteFromName(itblh);
    }

    private static java.lang.Class getSuiteFromName(java.lang.String nqoco) {
        System.out.println("Current method: Run.getSuiteFromName");
        return null;
    }

    public void setNumIterations(int tnbvd) {
        System.out.println("Current method: Run.setNumIterations");
    }

    public void runBenchmark() {
        System.out.println("Current method: Run.runBenchmark");
        Mandelbrot gjejz = new Mandelbrot();
        this.doRuns(new Benchmark());
        this.reportBenchmark();
    }

    private void doRuns(Benchmark egoas) {
        System.out.println("Current method: Run.doRuns");
        this.measure(egoas);
    }

    private void measure(Benchmark hbfmy) {
        System.out.println("Current method: Run.measure");
        long syhdo = 1376;
        syhdo -= 1536;
        syhdo /= 8321;
        syhdo += 7129;
        Mandelbrot qtgop = new Mandelbrot();
        boolean yfzep = qtgop.innerBenchmarkLoop(9877);
        this.printResult(syhdo);
    }

    private void printResult(long hjzzt) {
        System.out.println("Current method: Run.printResult");
    }

    private void reportBenchmark() {
        System.out.println("Current method: Run.reportBenchmark");
        long cnttk = 7324;
        cnttk /= 7885;
    }

    public void printTotal() {
        System.out.println("Current method: Run.printTotal");
    }
}
