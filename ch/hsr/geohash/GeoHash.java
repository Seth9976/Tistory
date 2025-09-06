package ch.hsr.geohash;

import java.io.Serializable;
import java.util.HashMap;

public final class GeoHash implements Serializable, Comparable {
    public static final long FIRST_BIT_FLAGGED = 0x8000000000000000L;
    public WGS84Point a;
    public BoundingBox b;
    protected long bits;
    public static final int[] c;
    public static final char[] d;
    public static final HashMap e;
    protected byte significantBits;

    static {
        GeoHash.c = new int[]{16, 8, 4, 2, 1};
        GeoHash.d = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        GeoHash.e = new HashMap();
        for(int v = 0; v < 0x20; ++v) {
            GeoHash.e.put(Character.valueOf(GeoHash.d[v]), v);
        }
    }

    public GeoHash() {
        this.bits = 0L;
        this.significantBits = 0;
    }

    public GeoHash(double f, double f1, int v) {
        this.bits = 0L;
        this.significantBits = 0;
        this.a = new WGS84Point(f, f1);
        int v1 = Math.min(v, 0x40);
        double[] arr_f = {-90.0, 90.0};
        double[] arr_f1 = {-180.0, 180.0};
        for(int v2 = 1; this.significantBits < v1; v2 ^= 1) {
            if(v2 == 0) {
                double f3 = (arr_f[0] + arr_f[1]) / 2.0;
                if(f >= f3) {
                    this.addOnBitToEnd();
                    arr_f[0] = f3;
                }
                else {
                    this.addOffBitToEnd();
                    arr_f[1] = f3;
                }
            }
            else {
                double f2 = (arr_f1[0] + arr_f1[1]) / 2.0;
                if(f1 >= f2) {
                    this.addOnBitToEnd();
                    arr_f1[0] = f2;
                }
                else {
                    this.addOffBitToEnd();
                    arr_f1[1] = f2;
                }
            }
        }
        GeoHash.c(this, arr_f, arr_f1);
        this.bits <<= 0x40 - v1;
    }

    public static void a(GeoHash geoHash0, double[] arr_f, boolean z) {
        double f = (arr_f[0] + arr_f[1]) / 2.0;
        if(z) {
            geoHash0.addOnBitToEnd();
            arr_f[0] = f;
            return;
        }
        geoHash0.addOffBitToEnd();
        arr_f[1] = f;
    }

    public final void addOffBitToEnd() {
        this.significantBits = (byte)(this.significantBits + 1);
        this.bits <<= 1;
    }

    public final void addOnBitToEnd() {
        this.significantBits = (byte)(this.significantBits + 1);
        this.bits = this.bits << 1 | 1L;
    }

    public static long b(int v, long v1) {
        long v2 = 0L;
        for(int v3 = 0; v3 < v; ++v3) {
            if((v1 & 0x8000000000000000L) == 0x8000000000000000L) {
                v2 |= 1L;
            }
            v2 <<= 1;
            v1 <<= 2;
        }
        return v2 >>> 1;
    }

    public static void c(GeoHash geoHash0, double[] arr_f, double[] arr_f1) {
        geoHash0.b = new BoundingBox(new WGS84Point(arr_f[0], arr_f1[0]), new WGS84Point(arr_f[1], arr_f1[1]));
    }

    public int compareTo(GeoHash geoHash0) {
        int v = Long.compare(this.bits ^ 0x8000000000000000L, 0x8000000000000000L ^ geoHash0.bits);
        return v == 0 ? Integer.compare(this.significantBits, geoHash0.significantBits) : v;
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo(((GeoHash)object0));
    }

    public boolean contains(WGS84Point wGS84Point0) {
        return this.b.contains(wGS84Point0);
    }

    public boolean enclosesCircleAroundPoint(WGS84Point wGS84Point0, double f) {
        return false;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof GeoHash && ((GeoHash)object0).significantBits == this.significantBits && ((GeoHash)object0).bits == this.bits;
    }

    public static GeoHash fromBinaryString(String s) {
        GeoHash geoHash0 = new GeoHash();
        for(int v = 0; v < s.length(); ++v) {
            switch(s.charAt(v)) {
                case 0x30: {
                    geoHash0.addOffBitToEnd();
                    break;
                }
                case 49: {
                    geoHash0.addOnBitToEnd();
                    break;
                }
                default: {
                    throw new IllegalArgumentException(s + " is not a valid geohash as a binary string");
                }
            }
        }
        geoHash0.bits <<= 0x40 - geoHash0.significantBits;
        return geoHash0.recombineLatLonBitsToHash(geoHash0.getRightAlignedLatitudeBits(), geoHash0.getRightAlignedLongitudeBits());
    }

    public static GeoHash fromGeohashString(String s) {
        double[] arr_f = {-90.0, 90.0};
        double[] arr_f1 = {-180.0, 180.0};
        GeoHash geoHash0 = new GeoHash();
        int v = 1;
        for(int v1 = 0; v1 < s.length(); ++v1) {
            int v2 = (int)(((Integer)GeoHash.e.get(Character.valueOf(s.charAt(v1)))));
            for(int v3 = 0; v3 < 5; ++v3) {
                int v4 = GeoHash.c[v3];
                if(v == 0) {
                    GeoHash.a(geoHash0, arr_f, (v4 & v2) != 0);
                }
                else {
                    GeoHash.a(geoHash0, arr_f1, (v4 & v2) != 0);
                }
                v ^= 1;
            }
        }
        geoHash0.a = new WGS84Point((arr_f[0] + arr_f[1]) / 2.0, (arr_f1[0] + arr_f1[1]) / 2.0);
        GeoHash.c(geoHash0, arr_f, arr_f1);
        geoHash0.bits <<= 0x40 - geoHash0.significantBits;
        return geoHash0;
    }

    public static GeoHash fromLongValue(long v, int v1) {
        double[] arr_f = {-90.0, 90.0};
        double[] arr_f1 = {-180.0, 180.0};
        GeoHash geoHash0 = new GeoHash();
        String s;
        for(s = Long.toBinaryString(v); s.length() < 0x40; s = "0" + s) {
        }
        int v3 = 1;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(v3 == 0) {
                GeoHash.a(geoHash0, arr_f, s.charAt(v2) != 0x30);
            }
            else {
                GeoHash.a(geoHash0, arr_f1, s.charAt(v2) != 0x30);
            }
            v3 ^= 1;
        }
        geoHash0.a = new WGS84Point((arr_f[0] + arr_f[1]) / 2.0, (arr_f1[0] + arr_f1[1]) / 2.0);
        GeoHash.c(geoHash0, arr_f, arr_f1);
        geoHash0.bits <<= 0x40 - geoHash0.significantBits;
        return geoHash0;
    }

    public static GeoHash fromOrd(long v, int v1) {
        return GeoHash.fromLongValue(v << 0x40 - v1, v1);
    }

    // 去混淆评级： 低(20)
    public static String geoHashStringWithCharacterPrecision(double f, double f1, int v) {
        return "";
    }

    public GeoHash[] getAdjacent() {
        GeoHash geoHash0 = this.getNorthernNeighbour();
        GeoHash geoHash1 = this.getEasternNeighbour();
        GeoHash geoHash2 = this.getSouthernNeighbour();
        GeoHash geoHash3 = this.getWesternNeighbour();
        return new GeoHash[]{geoHash0, geoHash0.getEasternNeighbour(), geoHash1, geoHash2.getEasternNeighbour(), geoHash2, geoHash2.getWesternNeighbour(), geoHash3, geoHash0.getWesternNeighbour()};
    }

    public BoundingBox getBoundingBox() {
        return this.b;
    }

    public WGS84Point getBoundingBoxCenterPoint() {
        return this.b.getCenterPoint();
    }

    public int getCharacterPrecision() {
        int v = this.significantBits;
        if(v % 5 != 0) {
            throw new IllegalStateException("precision of GeoHash is not divisble by 5: " + this);
        }
        return v / 5;
    }

    public GeoHash getEasternNeighbour() {
        long[] arr_v = this.getRightAlignedLatitudeBits();
        long[] arr_v1 = this.getRightAlignedLongitudeBits();
        long v = arr_v1[0] + 1L;
        arr_v1[0] = v;
        arr_v1[0] = v & -1L >>> ((int)(0x40L - arr_v1[1]));
        return this.recombineLatLonBitsToHash(arr_v, arr_v1);
    }

    public GeoHash getNorthernNeighbour() {
        long[] arr_v = this.getRightAlignedLatitudeBits();
        long[] arr_v1 = this.getRightAlignedLongitudeBits();
        long v = arr_v[0] + 1L;
        arr_v[0] = v;
        arr_v[0] = v & -1L >>> ((int)(0x40L - arr_v[1]));
        return this.recombineLatLonBitsToHash(arr_v, arr_v1);
    }

    public int[] getNumberOfLatLonBits() {
        return this.significantBits % 2 == 0 ? new int[]{this.significantBits / 2, this.significantBits / 2} : new int[]{this.significantBits / 2, this.significantBits / 2 + 1};
    }

    public WGS84Point getPoint() {
        return this.a;
    }

    public long[] getRightAlignedLatitudeBits() {
        long v = this.bits << 1;
        return new long[]{GeoHash.b(this.getNumberOfLatLonBits()[0], v), ((long)this.getNumberOfLatLonBits()[0])};
    }

    public long[] getRightAlignedLongitudeBits() {
        long v = this.bits;
        return new long[]{GeoHash.b(this.getNumberOfLatLonBits()[1], v), ((long)this.getNumberOfLatLonBits()[1])};
    }

    public GeoHash getSouthernNeighbour() {
        long[] arr_v = this.getRightAlignedLatitudeBits();
        long[] arr_v1 = this.getRightAlignedLongitudeBits();
        long v = arr_v[0] - 1L;
        arr_v[0] = v;
        arr_v[0] = v & -1L >>> ((int)(0x40L - arr_v[1]));
        return this.recombineLatLonBitsToHash(arr_v, arr_v1);
    }

    public GeoHash getWesternNeighbour() {
        long[] arr_v = this.getRightAlignedLatitudeBits();
        long[] arr_v1 = this.getRightAlignedLongitudeBits();
        long v = arr_v1[0] - 1L;
        arr_v1[0] = v;
        arr_v1[0] = v & -1L >>> ((int)(0x40L - arr_v1[1]));
        return this.recombineLatLonBitsToHash(arr_v, arr_v1);
    }

    @Override
    public int hashCode() {
        return (0x20F + ((int)(this.bits ^ this.bits >>> 0x20))) * 0x1F + this.significantBits;
    }

    public long longValue() {
        return this.bits;
    }

    public GeoHash next() {
        return this.next(1);
    }

    public GeoHash next(int v) {
        return GeoHash.fromOrd(this.ord() + ((long)v), ((int)this.significantBits));
    }

    public long ord() {
        return this.bits >>> 0x40 - this.significantBits;
    }

    public GeoHash prev() {
        return this.next(-1);
    }

    public GeoHash recombineLatLonBitsToHash(long[] arr_v, long[] arr_v1) {
        GeoHash geoHash0 = new GeoHash();
        arr_v[0] <<= (int)(0x40L - arr_v[1]);
        arr_v1[0] <<= (int)(0x40L - arr_v1[1]);
        double[] arr_f = {-90.0, 90.0};
        double[] arr_f1 = {-180.0, 180.0};
        int v1 = 0;
        for(int v = 0; ((long)v) < arr_v[1] + arr_v1[1]; ++v) {
            if(v1 == 0) {
                GeoHash.a(geoHash0, arr_f1, (arr_v1[0] & 0x8000000000000000L) == 0x8000000000000000L);
                arr_v1[0] <<= 1;
            }
            else {
                GeoHash.a(geoHash0, arr_f, (arr_v[0] & 0x8000000000000000L) == 0x8000000000000000L);
                arr_v[0] <<= 1;
            }
            v1 ^= 1;
        }
        geoHash0.bits <<= 0x40 - geoHash0.significantBits;
        GeoHash.c(geoHash0, arr_f, arr_f1);
        geoHash0.a = geoHash0.b.getCenterPoint();
        return geoHash0;
    }

    public int significantBits() {
        return this.significantBits;
    }

    public static long stepsBetween(GeoHash geoHash0, GeoHash geoHash1) {
        if(geoHash0.significantBits() != geoHash1.significantBits()) {
            throw new IllegalArgumentException("It is only valid to compare the number of steps between two hashes if they have the same number of significant bits");
        }
        return geoHash1.ord() - geoHash0.ord();
    }

    public String toBase32() [...] // 潜在的解密器

    public String toBinaryString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        long v = this.bits;
        for(int v1 = 0; v1 < this.significantBits; ++v1) {
            if((v & 0x8000000000000000L) == 0x8000000000000000L) {
                stringBuilder0.append('1');
            }
            else {
                stringBuilder0.append('0');
            }
            v <<= 1;
        }
        return stringBuilder0.toString();
    }

    // 去混淆评级： 低(30)
    @Override
    public String toString() {
        return this.significantBits % 5 == 0 ? String.format("%s -> %s -> %s", Long.toBinaryString(this.bits), this.b, "") : String.format("%s -> %s, bits: %d", Long.toBinaryString(this.bits), this.b, this.significantBits);
    }

    public static GeoHash withBitPrecision(double f, double f1, int v) {
        if(v > 0x40) {
            throw new IllegalArgumentException("A Geohash can only be 64 bits long!");
        }
        if(Math.abs(f) > 90.0 || Math.abs(f1) > 180.0) {
            throw new IllegalArgumentException("Can\'t have lat/lon values out of (-90,90)/(-180/180)");
        }
        return new GeoHash(f, f1, v);
    }

    public static GeoHash withCharacterPrecision(double f, double f1, int v) {
        if(v > 12) {
            throw new IllegalArgumentException("A geohash can only be 12 character long.");
        }
        return v * 5 > 60 ? new GeoHash(f, f1, 60) : new GeoHash(f, f1, v * 5);
    }

    public boolean within(GeoHash geoHash0) {
        return (this.bits & (geoHash0.significantBits == 0 ? 0L : 0x8000000000000000L >> geoHash0.significantBits - 1)) == geoHash0.bits;
    }
}

