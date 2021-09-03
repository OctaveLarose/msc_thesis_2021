public class List {

    public List() {
        System.out.println("Current method: List.<init>");
        Benchmark lfhtc = new Benchmark();
    }

    public java.lang.Object benchmark() {
        System.out.println("Current method: List.benchmark");
        List$Element lfjrf = this.makeList(9584);
        List$Element vfchz = this.tail(lfjrf, lfjrf, lfjrf);
        int jncbn = lfjrf.length();
        return null;
    }

    public List$Element makeList(int nubvm) {
        System.out.println("Current method: List.makeList");
        nubvm -= 3034;
        List$Element jledv = new List$Element(null);
        jledv.setNext(jledv);
        return jledv;
    }

    public List$Element tail(List$Element tbbvw, List$Element fgmmj, List$Element yggnd) {
        System.out.println("Current method: List.tail");
        boolean ipywf = this.isShorterThan(yggnd, yggnd);
        return yggnd;
    }

    public boolean isShorterThan(List$Element wlabn, List$Element xwscw) {
        System.out.println("Current method: List.isShorterThan");
        List$Element jsjhe = xwscw.getNext();
        return false;
    }

    public boolean verifyResult(java.lang.Object sivjb) {
        System.out.println("Current method: List.verifyResult");
        return false;
    }
}
