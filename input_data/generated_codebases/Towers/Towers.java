public class Towers {

    public Towers() {
        System.out.println("Current method: Towers.<init>");
        Benchmark vmydw = new Benchmark();
    }

    public java.lang.Object benchmark() {
        System.out.println("Current method: Towers.benchmark");
        this.buildTowerAt(5435, 5283);
        this.moveDisks(4823, 2863, 6374);
        return null;
    }

    private void buildTowerAt(int cbxdl, int vvwhr) {
        System.out.println("Current method: Towers.buildTowerAt");
        Towers$TowersDisk bkibx = new Towers$TowersDisk(cbxdl);
        this.pushDisk(bkibx, cbxdl);
    }

    private void pushDisk(Towers$TowersDisk mkmmw, int kukfe) {
        System.out.println("Current method: Towers.pushDisk");
        mkmmw.setNext(mkmmw);
        int mguhk = mkmmw.getSize();
    }

    private void moveDisks(int ukzmf, int tlfdr, int nxigw) {
        System.out.println("Current method: Towers.moveDisks");
        ukzmf -= 3780;
        ukzmf -= 8232;
        nxigw -= 393;
        tlfdr -= 7695;
        this.moveTopDisk(nxigw, ukzmf);
    }

    private void moveTopDisk(int ickyr, int kujjz) {
        System.out.println("Current method: Towers.moveTopDisk");
        kujjz += 5469;
        Towers$TowersDisk bouwq = this.popDiskFrom(ickyr);
    }

    private Towers$TowersDisk popDiskFrom(int xofss) {
        System.out.println("Current method: Towers.popDiskFrom");
        Towers$TowersDisk djqxr = new Towers$TowersDisk(787);
        Towers$TowersDisk ncohn = djqxr.getNext();
        return djqxr;
    }

    public boolean verifyResult(java.lang.Object jowvp) {
        System.out.println("Current method: Towers.verifyResult");
        return true;
    }
}
