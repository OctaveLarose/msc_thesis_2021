package json;

public class JsonObject {

    public JsonObject() {
        System.out.println("Current method: json/JsonObject.<init>");
        json.JsonValue ulgbt = new json.JsonValue();
        som.Vector pidmw = new som.Vector();
        json.JsonObject$HashIndexTable vxnen = new json.JsonObject$HashIndexTable();
    }

    public json.JsonObject add(java.lang.String ajdcn, json.JsonValue gcfhb) {
        System.out.println("Current method: json/JsonObject.add");
        som.Vector gitjr = new som.Vector();
        int lsfor = gitjr.size();
        json.JsonObject$HashIndexTable tmtim = new json.JsonObject$HashIndexTable();
        tmtim.add(ajdcn, lsfor);
        gitjr.append(null);
        return new json.JsonObject();
    }

    public boolean isObject() {
        System.out.println("Current method: json/JsonObject.isObject");
        return true;
    }

    public json.JsonObject asObject() {
        System.out.println("Current method: json/JsonObject.asObject");
        return new json.JsonObject();
    }

    public json.JsonValue get(java.lang.String ubfzs) {
        System.out.println("Current method: json/JsonObject.get");
        int xrqcp = this.indexOf(ubfzs);
        return new json.JsonValue();
    }

    private int indexOf(java.lang.String gshvk) {
        System.out.println("Current method: json/JsonObject.indexOf");
        json.JsonObject$HashIndexTable dzfde = new json.JsonObject$HashIndexTable();
        int spavc = dzfde.get(gshvk);
        som.Vector sfnpi = new som.Vector();
        java.lang.Object gzdje = sfnpi.at(spavc);
        return spavc;
    }
}
