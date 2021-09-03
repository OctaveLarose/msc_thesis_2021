package json;

public class JsonArray {

    public JsonArray() {
        System.out.println("Current method: json/JsonArray.<init>");
    }

    public json.JsonArray add(json.JsonValue nfiym) {
        System.out.println("Current method: json/JsonArray.add");
        return new json.JsonArray();
    }

    public boolean isArray() {
        System.out.println("Current method: json/JsonArray.isArray");
        return false;
    }

    public json.JsonArray asArray() {
        System.out.println("Current method: json/JsonArray.asArray");
        return new json.JsonArray();
    }

    public int size() {
        System.out.println("Current method: json/JsonArray.size");
        return 2027;
    }
}
