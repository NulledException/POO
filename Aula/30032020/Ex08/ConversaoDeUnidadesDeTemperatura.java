public class ConversaoDeUnidadesDeTemperatura {

    public ConversaoDeUnidadesDeTemperatura() {
    }

    public double cToF(double c) {
        return (((c / 5) * 9) + 32);
    }

    public double fToC(double f) {
        return ((5 / 9) * (f - 32));
    }

    public double cToK(double c) {
        return (c + 273.15);
    }

    public double kToC(double k) {
        return (k - 273.15);
    }

    public double cToRe(double c) {
        return (c * (4 / 5));
    }

    public double reToC(double re) {
        return ((5 / 4) * re);
    }

    public double kToR(double k) {
        return (k * 1.8);
    }

    public double rToK(double r) {
        return (r / 1.8);
    }

    public double kToF(double k) {
        double resp = kToC(k);
        return cToF(resp);
    }

    public double fToK(double f) {
        double resp = fToC(f);
        return cToK(resp);
    }

    public double fToRe(double f) {
        double resp = fToC(f);
        return cToRe(resp);
    }

    public double reToF(double re) {
        double resp = reToC(re);
        return cToF(resp);
    }

    public double reToK(double re) {
        double resp = reToC(re);
        return cToK(resp);
    }

    public double kToRe(double k) {
        double resp = kToC(k);
        return cToRe(resp);
    }

    public double cToR(double c) {
        double resp = cToK(c);
        return kToR(resp);
    }

    public double rToC(double r) {
        double resp = rToK(r);
        return kToC(resp);
    }

    public double rToF(double r) {
        double resp = rToK(r);
        return kToF(resp);
    }

    public double fToR(double f) {
        double resp = fToK(f);
        return kToR(resp);
    }

    public double rToRe(double r) {
        double resp = rToK(r);
        return kToRe(resp);
    }

    public double reToR(double re) {
        double resp = reToK(re);
        return kToR(resp);
    }
}