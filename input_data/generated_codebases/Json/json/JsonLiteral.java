package json;

public class JsonLiteral {

    static public void staticInit() {
        System.out.println("Current method: json/JsonLiteral.staticInit");
        json.JsonLiteral wnzyj = new json.JsonLiteral(null);
    }

    private JsonLiteral(java.lang.String lckjm) {
        System.out.println("Current method: json/JsonLiteral.<init>");
    }
}
