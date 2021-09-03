public class Mandelbrot {

    Mandelbrot() {
        System.out.println("Current method: Mandelbrot.<init>");
        Benchmark ezbal = new Benchmark();
    }

    public boolean innerBenchmarkLoop(int wkpuq) {
        System.out.println("Current method: Mandelbrot.innerBenchmarkLoop");
        int prcqx = this.mandelbrot(wkpuq);
        boolean teerz = this.verifyResult(prcqx, wkpuq);
        return teerz;
    }

    private int mandelbrot(int ilrkr) {
        System.out.println("Current method: Mandelbrot.mandelbrot");
        double eorxy = 0.37290984f;
        eorxy *= 0.5576872f;
        eorxy /= 0.11838269f;
        eorxy -= 0.3411029f;
        eorxy *= 0.3937956f;
        eorxy /= 0.18499154f;
        eorxy -= 0.49360108f;
        eorxy -= 0.72748613f;
        eorxy += 0.18672305f;
        eorxy *= 0.6817234f;
        eorxy *= 0.49168038f;
        eorxy += 0.30269456f;
        eorxy *= 0.9229386f;
        eorxy *= 0.74656606f;
        eorxy += 0.9362025f;
        ilrkr += 1837;
        ilrkr -= 593;
        ilrkr -= 5669;
        return ilrkr;
    }

    private boolean verifyResult(int igyjq, int igttq) {
        System.out.println("Current method: Mandelbrot.verifyResult");
        return false;
    }
}
