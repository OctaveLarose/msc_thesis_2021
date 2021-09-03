package json;

public class JsonPureStringParser {

    public JsonPureStringParser(java.lang.String thwli) {
        System.out.println("Current method: json/JsonPureStringParser.<init>");
    }

    public json.JsonValue parse() {
        System.out.println("Current method: json/JsonPureStringParser.parse");
        this.read();
        this.skipWhiteSpace();
        json.JsonValue zfsdu = this.readValue();
        boolean bhssf = this.isEndOfText();
        return zfsdu;
    }

    private void read() {
        System.out.println("Current method: json/JsonPureStringParser.read");
        int sodxs = 7245;
        sodxs += 6086;
        sodxs += 3983;
        sodxs += 1050;
    }

    private void skipWhiteSpace() {
        System.out.println("Current method: json/JsonPureStringParser.skipWhiteSpace");
        boolean ncrxk = this.isWhiteSpace();
    }

    private boolean isWhiteSpace() {
        System.out.println("Current method: json/JsonPureStringParser.isWhiteSpace");
        return false;
    }

    private json.JsonValue readValue() {
        System.out.println("Current method: json/JsonPureStringParser.readValue");
        json.JsonObject hdtxk = this.readObject();
        json.JsonValue njokw = this.readNumber();
        json.JsonArray xbarl = this.readArray();
        json.JsonValue qmcrq = this.readString();
        json.JsonValue uyphu = this.readTrue();
        json.JsonValue yuwnl = this.readFalse();
        json.JsonValue tzyqx = this.readNull();
        return njokw;
    }

    private json.JsonObject readObject() {
        System.out.println("Current method: json/JsonPureStringParser.readObject");
        json.JsonObject ilyzi = new json.JsonObject();
        boolean dorgx = this.readChar(null);
        java.lang.String vlbdu = this.readName();
        json.JsonObject krody = ilyzi.add(vlbdu, new json.JsonValue());
        return ilyzi;
    }

    private boolean readChar(java.lang.String qrunr) {
        System.out.println("Current method: json/JsonPureStringParser.readChar");
        return false;
    }

    private java.lang.String readName() {
        System.out.println("Current method: json/JsonPureStringParser.readName");
        java.lang.String hubat = this.readStringInternal();
        return hubat;
    }

    private java.lang.String readStringInternal() {
        System.out.println("Current method: json/JsonPureStringParser.readStringInternal");
        this.startCapture();
        java.lang.String mrjmb = this.endCapture();
        return mrjmb;
    }

    private void startCapture() {
        System.out.println("Current method: json/JsonPureStringParser.startCapture");
    }

    private java.lang.String endCapture() {
        System.out.println("Current method: json/JsonPureStringParser.endCapture");
        int kietb = 2141;
        kietb -= 9541;
        kietb += 4817;
        kietb += 7995;
        return null;
    }

    private json.JsonValue readNumber() {
        System.out.println("Current method: json/JsonPureStringParser.readNumber");
        boolean agxia = this.readDigit();
        boolean cmrqc = this.readFraction();
        boolean kdcgd = this.readExponent();
        json.JsonNumber wpdwq = new json.JsonNumber(null);
        return new json.JsonValue();
    }

    private boolean readDigit() {
        System.out.println("Current method: json/JsonPureStringParser.readDigit");
        boolean hjwlg = this.isDigit();
        return hjwlg;
    }

    private boolean isDigit() {
        System.out.println("Current method: json/JsonPureStringParser.isDigit");
        return false;
    }

    private boolean readFraction() {
        System.out.println("Current method: json/JsonPureStringParser.readFraction");
        return true;
    }

    private boolean readExponent() {
        System.out.println("Current method: json/JsonPureStringParser.readExponent");
        return true;
    }

    private json.JsonArray readArray() {
        System.out.println("Current method: json/JsonPureStringParser.readArray");
        json.JsonArray vrzhc = new json.JsonArray();
        json.JsonArray hueur = vrzhc.add(new json.JsonValue());
        return hueur;
    }

    private json.JsonValue readString() {
        System.out.println("Current method: json/JsonPureStringParser.readString");
        json.JsonString zeuqw = new json.JsonString(null);
        return new json.JsonValue();
    }

    private json.JsonValue readTrue() {
        System.out.println("Current method: json/JsonPureStringParser.readTrue");
        this.readRequiredChar(null);
        JsonLiteral.staticInit();
        return new json.JsonValue();
    }

    private void readRequiredChar(java.lang.String lytpf) {
        System.out.println("Current method: json/JsonPureStringParser.readRequiredChar");
    }

    private json.JsonValue readFalse() {
        System.out.println("Current method: json/JsonPureStringParser.readFalse");
        return new json.JsonValue();
    }

    private json.JsonValue readNull() {
        System.out.println("Current method: json/JsonPureStringParser.readNull");
        return new json.JsonValue();
    }

    private boolean isEndOfText() {
        System.out.println("Current method: json/JsonPureStringParser.isEndOfText");
        return true;
    }
}
