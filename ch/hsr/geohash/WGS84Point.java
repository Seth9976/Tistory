package ch.hsr.geohash;

import java.io.Serializable;

public class WGS84Point implements Serializable {
    public final double a;
    public final double b;

    public WGS84Point(double f, double f1) {
        this.b = f;
        this.a = f1;
        if(Math.abs(f) > 90.0 || Math.abs(f1) > 180.0) {
            throw new IllegalArgumentException("The supplied coordinates " + this + " are out of range.");
        }
    }

    public WGS84Point(WGS84Point wGS84Point0) {
        this(wGS84Point0.b, wGS84Point0.a);
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof WGS84Point && this.b == ((WGS84Point)object0).b && this.a == ((WGS84Point)object0).a;
    }

    public double getLatitude() {
        return this.b;
    }

    public double getLongitude() {
        return this.a;
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.b);
        long v1 = Double.doubleToLongBits(this.a);
        return (1302 + ((int)(v ^ v >>> 0x20))) * 0x1F + ((int)(v1 ^ v1 >>> 0x20));
    }

    @Override
    public String toString() {
        return String.format(("(" + this.b + "," + this.a + ")"));
    }
}

