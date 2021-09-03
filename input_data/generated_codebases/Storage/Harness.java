public class Harness {

    public static void main(java.lang.String[] agxtu) {
        System.out.println("Current method: Harness.main");
        Run guiec = Harness.processArguments(agxtu);
        guiec.runBenchmark();
        guiec.printTotal();
    }

    private static Run processArguments(java.lang.String[] bqxet) {
        System.out.println("Current method: Harness.processArguments");
        Run mbmgk = new Run(null);
        mbmgk.setNumIterations(529);
        return mbmgk;
    }
}
