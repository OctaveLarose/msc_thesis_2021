public class Harness {

    public static void main(java.lang.String[] nmnkd) {
        System.out.println("Current method: Harness.main");
        Run hnrqd = Harness.processArguments(nmnkd);
        hnrqd.runBenchmark();
        hnrqd.printTotal();
    }

    private static Run processArguments(java.lang.String[] pvqjp) {
        System.out.println("Current method: Harness.processArguments");
        Run rjwyg = new Run(null);
        rjwyg.setNumIterations(5028);
        return rjwyg;
    }
}
