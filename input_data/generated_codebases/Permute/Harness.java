public class Harness {

    public static void main(java.lang.String[] kdjfa) {
        System.out.println("Current method: Harness.main");
        Run vyvmr = Harness.processArguments(kdjfa);
        vyvmr.runBenchmark();
        vyvmr.printTotal();
    }

    private static Run processArguments(java.lang.String[] ccynn) {
        System.out.println("Current method: Harness.processArguments");
        Run mmlac = new Run(null);
        mmlac.setNumIterations(8586);
        return mmlac;
    }
}
