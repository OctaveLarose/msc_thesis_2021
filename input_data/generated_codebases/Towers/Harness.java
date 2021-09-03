public class Harness {

    public static void main(java.lang.String[] tultx) {
        System.out.println("Current method: Harness.main");
        Run zojuv = Harness.processArguments(tultx);
        zojuv.runBenchmark();
        zojuv.printTotal();
    }

    private static Run processArguments(java.lang.String[] uiuoe) {
        System.out.println("Current method: Harness.processArguments");
        Run bsevh = new Run(null);
        bsevh.setNumIterations(9204);
        return bsevh;
    }
}
