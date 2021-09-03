public class Harness {

    public static void main(java.lang.String[] twexb) {
        System.out.println("Current method: Harness.main");
        Run zzzlm = Harness.processArguments(twexb);
        zzzlm.runBenchmark();
        zzzlm.printTotal();
    }

    private static Run processArguments(java.lang.String[] zdgxx) {
        System.out.println("Current method: Harness.processArguments");
        Run ftmca = new Run(null);
        ftmca.setNumIterations(3783);
        return ftmca;
    }
}
