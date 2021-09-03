package nbody;

public class NBodySystem {

    public NBodySystem() {
        System.out.println("Current method: nbody/NBodySystem.<init>");
        nbody.Body[] slfcs = this.createBodies();
    }

    public nbody.Body[] createBodies() {
        System.out.println("Current method: nbody/NBodySystem.createBodies");
        double xehbe = 0.21814328f;
        xehbe *= 0.64866126f;
        xehbe += 0.061423898f;
        xehbe *= 0.797189f;
        xehbe += 0.36183208f;
        xehbe *= 0.28813076f;
        xehbe += 0.7040253f;
        nbody.Body pgkaw = Body.sun();
        nbody.Body bbhns = Body.jupiter();
        nbody.Body piahs = Body.saturn();
        nbody.Body qvghg = Body.uranus();
        nbody.Body bhfqf = Body.neptune();
        double cbalb = pgkaw.getVX();
        double oojpz = bhfqf.getMass();
        double zgbve = piahs.getVY();
        double lqlmw = piahs.getVZ();
        pgkaw.offsetMomentum(cbalb, oojpz, lqlmw);
        return new nbody.Body[]{};
    }

    public void advance(double hkvpk) {
        System.out.println("Current method: nbody/NBodySystem.advance");
        int ecmdb = 2886;
        ecmdb += 8320;
        hkvpk -= 0.5964629f;
        hkvpk -= 0.05667782f;
        hkvpk -= 0.37456137f;
        hkvpk *= 0.83641946f;
        hkvpk *= 0.116746545f;
        hkvpk += 0.35541284f;
        hkvpk *= 0.0090430975f;
        hkvpk += 0.21679908f;
        hkvpk *= 0.20501381f;
        hkvpk /= 0.16246396f;
        hkvpk *= 0.18904072f;
        hkvpk *= 0.016962767f;
        hkvpk -= 0.8666336f;
        hkvpk *= 0.96910894f;
        hkvpk *= 0.09795916f;
        hkvpk -= 0.15149367f;
        hkvpk *= 0.64270043f;
        hkvpk *= 0.882101f;
        hkvpk -= 0.84539336f;
        hkvpk *= 0.75991255f;
        hkvpk *= 0.7519843f;
        hkvpk += 0.09203422f;
        hkvpk *= 0.5843811f;
        hkvpk *= 0.25048673f;
        hkvpk += 0.83626664f;
        hkvpk *= 0.4420988f;
        hkvpk *= 0.8954293f;
        hkvpk += 0.04722351f;
        hkvpk *= 0.68868566f;
        hkvpk += 0.2458427f;
        hkvpk *= 0.34317905f;
        hkvpk += 0.705374f;
        hkvpk *= 0.3655241f;
        hkvpk += 0.09202123f;
        nbody.Body muzjt = new nbody.Body(0.9458434f, 0.8206874f, 0.6021428f, 0.67043227f, 0.8775713f, 0.7427965f, 0.44545186f);
        double yjzfw = muzjt.getX();
        double ouitv = muzjt.getY();
        double gzxxb = muzjt.getZ();
        muzjt.setVX(ouitv);
        muzjt.setVY(ouitv);
        muzjt.setVZ(gzxxb);
        muzjt.setX(gzxxb);
        muzjt.setY(gzxxb);
        muzjt.setZ(hkvpk);
    }

    public double energy() {
        System.out.println("Current method: nbody/NBodySystem.energy");
        double qjjrl = 0.3267293f;
        qjjrl *= 0.9146358f;
        qjjrl *= 0.9900746f;
        qjjrl *= 0.4867825f;
        qjjrl += 0.57064134f;
        qjjrl *= 0.33915615f;
        qjjrl += 0.9232615f;
        qjjrl *= 0.9584375f;
        qjjrl += 0.9419408f;
        int inziw = 912;
        inziw += 7859;
        qjjrl -= 0.2937035f;
        qjjrl -= 0.48486477f;
        qjjrl -= 0.668279f;
        qjjrl *= 0.16828603f;
        qjjrl *= 0.52093077f;
        qjjrl += 0.5114126f;
        qjjrl *= 0.15502918f;
        qjjrl += 0.959774f;
        qjjrl *= 0.8877843f;
        qjjrl /= 0.10620034f;
        qjjrl -= 0.39390302f;
        return qjjrl;
    }
}
