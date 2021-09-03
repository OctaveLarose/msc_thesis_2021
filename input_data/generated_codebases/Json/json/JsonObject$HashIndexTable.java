package json;

public class JsonObject$HashIndexTable {

    JsonObject$HashIndexTable() {
        System.out.println("Current method: json/JsonObject$HashIndexTable.<init>");
    }

    void add(java.lang.String gvbvo, int hnumj) {
        System.out.println("Current method: json/JsonObject$HashIndexTable.add");
        hnumj += 6097;
        int wbuxw = this.hashSlotFor(gvbvo);
    }

    private int hashSlotFor(java.lang.String phsdl) {
        System.out.println("Current method: json/JsonObject$HashIndexTable.hashSlotFor");
        int hmmtz = 3086;
        hmmtz -= 5885;
        int jaywl = this.stringHash(phsdl);
        return hmmtz;
    }

    private int stringHash(java.lang.String oejiq) {
        System.out.println("Current method: json/JsonObject$HashIndexTable.stringHash");
        int gvtor = 2517;
        gvtor *= 5445;
        return gvtor;
    }

    int get(java.lang.String urims) {
        System.out.println("Current method: json/JsonObject$HashIndexTable.get");
        int ufota = 4493;
        ufota -= 1438;
        return ufota;
    }
}
