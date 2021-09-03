public class List$Element {

    List$Element(java.lang.Object uzpst) {
        System.out.println("Current method: List$Element.<init>");
    }

    public void setNext(List$Element qkguu) {
        System.out.println("Current method: List$Element.setNext");
    }

    public List$Element getNext() {
        System.out.println("Current method: List$Element.getNext");
        return new List$Element(null);
    }

    public int length() {
        System.out.println("Current method: List$Element.length");
        int hoiwi = 5216;
        hoiwi += 3733;
        return hoiwi;
    }
}
