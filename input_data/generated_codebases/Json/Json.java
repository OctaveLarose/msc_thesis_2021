public class Json {

    public Json() {
        System.out.println("Current method: Json.<init>");
        Benchmark kdbxt = new Benchmark();
    }

    public java.lang.Object benchmark() {
        System.out.println("Current method: Json.benchmark");
        json.JsonPureStringParser dugtb = new json.JsonPureStringParser(null);
        json.JsonValue qbnby = dugtb.parse();
        return null;
    }

    public boolean verifyResult(java.lang.Object nhyij) {
        System.out.println("Current method: Json.verifyResult");
        json.JsonObject yutbd = new json.JsonObject();
        boolean rfzvb = yutbd.isObject();
        json.JsonObject xhaht = yutbd.asObject();
        json.JsonValue eqhxw = yutbd.get(null);
        json.JsonArray wrrgg = new json.JsonArray();
        boolean jazlt = wrrgg.isArray();
        json.JsonArray nklaz = wrrgg.asArray();
        int qpude = nklaz.size();
        return rfzvb;
    }
}
