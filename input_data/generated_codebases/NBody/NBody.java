public class NBody {

    public NBody() {
        System.out.println("Current method: NBody.<init>");
        Benchmark pvmsp = new Benchmark();
    }

    public boolean innerBenchmarkLoop(int ujmla) {
        System.out.println("Current method: NBody.innerBenchmarkLoop");
        nbody.NBodySystem kklvg = new nbody.NBodySystem();
        kklvg.advance(0.4523456f);
        double owgqg = kklvg.energy();
        boolean cwved = this.verifyResult(owgqg, ujmla);
        return cwved;
    }

    private boolean verifyResult(double ftcgd, int ukhbw) {
        System.out.println("Current method: NBody.verifyResult");
        return true;
    }
}
