package ch.hsr.geohash.util;

import ch.hsr.geohash.BoundingBox;

public class GeoHashSizeTable {
    public static final double[] a;
    public static final double[] b;

    static {
        GeoHashSizeTable.a = new double[0x40];
        GeoHashSizeTable.b = new double[0x40];
        for(int v = 0; v < 0x40; ++v) {
            GeoHashSizeTable.a[v] = GeoHashSizeTable.dLat(v);
            GeoHashSizeTable.b[v] = GeoHashSizeTable.dLon(v);
        }
    }

    public static final double dLat(int v) {
        return 180.0 / Math.pow(2.0, v / 2);
    }

    public static final double dLon(int v) {
        return 360.0 / Math.pow(2.0, (v + 1) / 2);
    }

    public static final int numberOfBitsForOverlappingGeoHash(BoundingBox boundingBox0) {
        double f = boundingBox0.getLatitudeSize();
        double f1 = boundingBox0.getLongitudeSize();
        int v;
        for(v = 0x3F; (GeoHashSizeTable.a[v] < f || GeoHashSizeTable.b[v] < f1) && v > 0; --v) {
        }
        return v;
    }
}

