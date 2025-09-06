package ch.hsr.geohash.util;

import ch.hsr.geohash.GeoHash;
import java.util.HashSet;
import java.util.Random;

public class BoundingBoxSampler {
    public final TwoGeoHashBoundingBox a;
    public final HashSet b;
    public final int c;
    public final Random d;

    public BoundingBoxSampler(TwoGeoHashBoundingBox twoGeoHashBoundingBox0) {
        this.b = new HashSet();
        this.d = new Random();
        this.a = twoGeoHashBoundingBox0;
        long v = GeoHash.stepsBetween(twoGeoHashBoundingBox0.getBottomLeft(), twoGeoHashBoundingBox0.getTopRight());
        if(v > 0x7FFFFFFFL) {
            throw new IllegalArgumentException("This bounding box is too big too sample using this algorithm");
        }
        this.c = (int)v;
    }

    public BoundingBoxSampler(TwoGeoHashBoundingBox twoGeoHashBoundingBox0, long v) {
        this(twoGeoHashBoundingBox0);
        this.d = new Random(v);
    }

    public TwoGeoHashBoundingBox getBoundingBox() {
        return this.a;
    }

    public GeoHash next() {
        HashSet hashSet0 = this.b;
        int v = this.c;
        if(hashSet0.size() == v) {
            return null;
        }
        Random random0 = this.d;
        int v1;
        for(v1 = random0.nextInt(v + 1); hashSet0.contains(v1); v1 = random0.nextInt(v + 1)) {
        }
        hashSet0.add(v1);
        GeoHash geoHash0 = this.a.getBottomLeft().next(v1);
        return this.a.getBoundingBox().contains(geoHash0.getPoint()) ? geoHash0 : this.next();
    }
}

