public class Run {

    public Run(java.lang.String jrrex) {
        System.out.println("Current method: Run.<init>");
        java.lang.Class hdiop = Run.getSuiteFromName(jrrex);
    }

    private static java.lang.Class getSuiteFromName(java.lang.String tpxyw) {
        System.out.println("Current method: Run.getSuiteFromName");
        return null;
    }

    public void setNumIterations(int owpve) {
        System.out.println("Current method: Run.setNumIterations");
    }

    public void runBenchmark() {
        System.out.println("Current method: Run.runBenchmark");
        Bounce dfbre = new Bounce();
        this.doRuns(new Benchmark());
        this.reportBenchmark();
    }

    private void doRuns(Benchmark ftabv) {
        System.out.println("Current method: Run.doRuns");
        this.measure(ftabv);
    }

    private void measure(Benchmark lejdi) {
        System.out.println("Current method: Run.measure");
        long viknv = 8886;
        viknv -= 274;
        viknv /= 894;
        viknv += 936;
        boolean yjowy = lejdi.innerBenchmarkLoop(6498);
        this.printResult(viknv);
    }

    private void printResult(long jfdkz) {
        System.out.println("Current method: Run.printResult");
    }

    private void reportBenchmark() {
        System.out.println("Current method: Run.reportBenchmark");
        long wcmnw = 5945;
        wcmnw /= 6039;
    }

    public void printTotal() {
        System.out.println("Current method: Run.printTotal");
    }
}
