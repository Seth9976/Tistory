package ch.hsr.geohash;

import java.io.Serializable;

public class BoundingBox implements Serializable {
    public double a;
    public double b;
    public double c;
    public double d;

    public BoundingBox(double f, double f1, double f2, double f3) {
        this.c = Math.min(f2, f3);
        this.d = Math.max(f2, f3);
        this.a = Math.min(f, f1);
        this.b = Math.max(f, f1);
    }

    public BoundingBox(BoundingBox boundingBox0) {
        this(boundingBox0.a, boundingBox0.b, boundingBox0.c, boundingBox0.d);
    }

    public BoundingBox(WGS84Point wGS84Point0, WGS84Point wGS84Point1) {
        this(wGS84Point0.getLatitude(), wGS84Point1.getLatitude(), wGS84Point0.getLongitude(), wGS84Point1.getLongitude());
    }

    public boolean contains(WGS84Point wGS84Point0) {
        return wGS84Point0.getLatitude() >= this.a && wGS84Point0.getLongitude() >= this.c && wGS84Point0.getLatitude() <= this.b && wGS84Point0.getLongitude() <= this.d;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof BoundingBox && (this.a == ((BoundingBox)object0).a && this.c == ((BoundingBox)object0).c && this.b == ((BoundingBox)object0).b && this.d == ((BoundingBox)object0).d);
    }

    public void expandToInclude(BoundingBox boundingBox0) {
        double f = boundingBox0.c;
        if(f < this.c) {
            this.c = f;
        }
        double f1 = boundingBox0.d;
        if(f1 > this.d) {
            this.d = f1;
        }
        double f2 = boundingBox0.a;
        if(f2 < this.a) {
            this.a = f2;
        }
        double f3 = boundingBox0.b;
        if(f3 > this.b) {
            this.b = f3;
        }
    }

    public WGS84Point getCenterPoint() {
        return new WGS84Point((this.a + this.b) / 2.0, (this.c + this.d) / 2.0);
    }

    public double getLatitudeSize() {
        return this.b - this.a;
    }

    public double getLongitudeSize() {
        return this.d - this.c;
    }

    public WGS84Point getLowerRight() {
        return new WGS84Point(this.a, this.d);
    }

    public double getMaxLat() {
        return this.b;
    }

    public double getMaxLon() {
        return this.d;
    }

    public double getMinLat() {
        return this.a;
    }

    public double getMinLon() {
        return this.c;
    }

    public WGS84Point getUpperLeft() {
        return new WGS84Point(this.b, this.c);
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.a);
        long v1 = Double.doubleToLongBits(this.b);
        long v2 = Double.doubleToLongBits(this.c);
        long v3 = Double.doubleToLongBits(this.d);
        return ((int)(v3 >>> 0x20 ^ v3)) + (((int)(v2 ^ v2 >>> 0x20)) + (((int)(v1 ^ v1 >>> 0x20)) + (((int)(v ^ v >>> 0x20)) + 629) * 37) * 37) * 37;
    }

    public boolean intersects(BoundingBox boundingBox0) {
        return boundingBox0.c <= this.d && boundingBox0.d >= this.c && boundingBox0.a <= this.b && boundingBox0.b >= this.a;
    }

    @Override
    public String toString() {
        return this.getUpperLeft() + " -> " + this.getLowerRight();
    }
}

