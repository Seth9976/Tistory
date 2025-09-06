package ch.hsr.geohash.util;

import ch.hsr.geohash.BoundingBox;
import ch.hsr.geohash.GeoHash;

public class TwoGeoHashBoundingBox {
    public final BoundingBox a;
    public final GeoHash b;
    public final GeoHash c;

    public TwoGeoHashBoundingBox(GeoHash geoHash0, GeoHash geoHash1) {
        if(geoHash0.significantBits() != geoHash1.significantBits()) {
            throw new IllegalArgumentException("Does it make sense to iterate between hashes that have different precisions?");
        }
        GeoHash geoHash2 = GeoHash.fromLongValue(geoHash0.longValue(), geoHash0.significantBits());
        this.b = geoHash2;
        GeoHash geoHash3 = GeoHash.fromLongValue(geoHash1.longValue(), geoHash1.significantBits());
        this.c = geoHash3;
        BoundingBox boundingBox0 = geoHash2.getBoundingBox();
        this.a = boundingBox0;
        boundingBox0.expandToInclude(geoHash3.getBoundingBox());
    }

    public static TwoGeoHashBoundingBox fromBase32(String s) {
        return new TwoGeoHashBoundingBox(GeoHash.fromGeohashString(s.substring(0, 7)), GeoHash.fromGeohashString(s.substring(7)));
    }

    public GeoHash getBottomLeft() {
        return this.b;
    }

    public BoundingBox getBoundingBox() {
        return this.a;
    }

    public GeoHash getTopRight() {
        return this.c;
    }

    // 去混淆评级： 中等(60)
    public String toBase32() {
        return "";
    }

    public static TwoGeoHashBoundingBox withBitPrecision(BoundingBox boundingBox0, int v) {
        return new TwoGeoHashBoundingBox(GeoHash.withBitPrecision(boundingBox0.getMinLat(), boundingBox0.getMinLon(), v), GeoHash.withBitPrecision(boundingBox0.getMaxLat(), boundingBox0.getMaxLon(), v));
    }

    public static TwoGeoHashBoundingBox withCharacterPrecision(BoundingBox boundingBox0, int v) {
        return new TwoGeoHashBoundingBox(GeoHash.withCharacterPrecision(boundingBox0.getMinLat(), boundingBox0.getMinLon(), v), GeoHash.withCharacterPrecision(boundingBox0.getMaxLat(), boundingBox0.getMaxLon(), v));
    }
}

