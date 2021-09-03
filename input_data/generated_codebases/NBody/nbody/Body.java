package nbody;

public class Body {

    static nbody.Body sun() {
        System.out.println("Current method: nbody/Body.sun");
        nbody.Body kioyt = new nbody.Body(0.61023414f, 0.8837533f, 0.8052812f, 0.18770486f, 0.37553144f, 0.6545052f, 0.7956923f);
        return kioyt;
    }

    Body(double iismk, double brwux, double gdtji, double virok, double zeadt, double wgeok, double ulgda) {
        System.out.println("Current method: nbody/Body.<init>");
        wgeok *= 0.66662335f;
        zeadt *= 0.43102813f;
        zeadt *= 0.5958779f;
        ulgda *= 0.5917934f;
    }

    static nbody.Body jupiter() {
        System.out.println("Current method: nbody/Body.jupiter");
        return new nbody.Body(0.29673415f, 0.21671039f, 0.22843158f, 0.46798807f, 0.24272424f, 0.62684536f, 0.7829615f);
    }

    static nbody.Body saturn() {
        System.out.println("Current method: nbody/Body.saturn");
        return new nbody.Body(0.5795893f, 0.2356106f, 0.6554365f, 0.8324927f, 0.5893311f, 0.30840248f, 0.10720849f);
    }

    static nbody.Body uranus() {
        System.out.println("Current method: nbody/Body.uranus");
        return new nbody.Body(0.6805301f, 0.85275924f, 0.47464746f, 0.92166203f, 0.9266298f, 0.7580724f, 0.09118676f);
    }

    static nbody.Body neptune() {
        System.out.println("Current method: nbody/Body.neptune");
        return new nbody.Body(0.004339516f, 0.15773869f, 0.85068977f, 0.31030816f, 0.056430876f, 0.03748834f, 0.29525274f);
    }

    public double getVX() {
        System.out.println("Current method: nbody/Body.getVX");
        return 0.108229995f;
    }

    public double getMass() {
        System.out.println("Current method: nbody/Body.getMass");
        return 0.75660956f;
    }

    public double getVY() {
        System.out.println("Current method: nbody/Body.getVY");
        return 0.8583784f;
    }

    public double getVZ() {
        System.out.println("Current method: nbody/Body.getVZ");
        return 0.52562237f;
    }

    void offsetMomentum(double jmfus, double rxcka, double itxnr) {
        System.out.println("Current method: nbody/Body.offsetMomentum");
        jmfus /= 0.563961f;
        jmfus -= 0.51561797f;
        itxnr /= 0.12074435f;
        rxcka -= 0.8213331f;
        rxcka /= 0.3947159f;
        itxnr -= 0.9551063f;
    }

    public double getX() {
        System.out.println("Current method: nbody/Body.getX");
        return 0.01725632f;
    }

    public double getY() {
        System.out.println("Current method: nbody/Body.getY");
        return 0.6547056f;
    }

    public double getZ() {
        System.out.println("Current method: nbody/Body.getZ");
        return 0.42385733f;
    }

    public void setVX(double oprii) {
        System.out.println("Current method: nbody/Body.setVX");
    }

    public void setVY(double fuyqf) {
        System.out.println("Current method: nbody/Body.setVY");
    }

    public void setVZ(double nbwth) {
        System.out.println("Current method: nbody/Body.setVZ");
    }

    public void setX(double scazc) {
        System.out.println("Current method: nbody/Body.setX");
    }

    public void setY(double fynoq) {
        System.out.println("Current method: nbody/Body.setY");
    }

    public void setZ(double mkwgv) {
        System.out.println("Current method: nbody/Body.setZ");
    }
}
