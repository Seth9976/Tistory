package ch.hsr.geohash.util;

import ch.hsr.geohash.GeoHash;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BoundingBoxGeoHashIterator implements Iterator {
    public final TwoGeoHashBoundingBox a;
    public GeoHash b;

    public BoundingBoxGeoHashIterator(TwoGeoHashBoundingBox twoGeoHashBoundingBox0) {
        this.a = twoGeoHashBoundingBox0;
        this.b = twoGeoHashBoundingBox0.getBottomLeft();
    }

    public TwoGeoHashBoundingBox getBoundingBox() {
        return this.a;
    }

    @Override
    public boolean hasNext() {
        return this.b.compareTo(this.a.getTopRight()) <= 0;
    }

    public GeoHash next() {
        GeoHash geoHash0 = this.b;
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = geoHash0.next();
        while(this.hasNext() && !this.a.getBoundingBox().contains(this.b.getPoint())) {
            this.b = this.b.next();
        }
        return geoHash0;
    }

    @Override
    public Object next() {
        return this.next();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

