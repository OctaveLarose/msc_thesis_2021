public class Harness {

    public static void main(java.lang.String[] xonfo) {
        System.out.println("Current method: Harness.main");
        Run sfxxw = Harness.processArguments(xonfo);
        sfxxw.runBenchmark();
        sfxxw.printTotal();
    }

    private static Run processArguments(java.lang.String[] jxaih) {
        System.out.println("Current method: Harness.processArguments");
        Run ktvcv = new Run(null);
        ktvcv.setNumIterations(457);
        return ktvcv;
    }
}
