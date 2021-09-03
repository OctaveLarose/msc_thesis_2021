package som;

public class Random {

    public Random() {
        System.out.println("Current method: som/Random.<init>");
    }

    public int next() {
        System.out.println("Current method: som/Random.next");
        int zkmpk = 682;
        zkmpk *= 3180;
        zkmpk += 6619;
        return zkmpk;
    }
}
