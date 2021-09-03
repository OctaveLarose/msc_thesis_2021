public class Harness {

    public static void main(java.lang.String[] puxav) {
        System.out.println("Current method: Harness.main");
        Run saaau = Harness.processArguments(puxav);
        saaau.runBenchmark();
        saaau.printTotal();
    }

    private static Run processArguments(java.lang.String[] deodi) {
        System.out.println("Current method: Harness.processArguments");
        Run ezhkp = new Run(null);
        ezhkp.setNumIterations(1304);
        return ezhkp;
    }
}
