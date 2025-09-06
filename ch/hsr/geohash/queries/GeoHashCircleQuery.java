package ch.hsr.geohash.queries;

import ch.hsr.geohash.BoundingBox;
import ch.hsr.geohash.GeoHash;
import ch.hsr.geohash.WGS84Point;
import ch.hsr.geohash.util.VincentyGeodesy;
import java.io.Serializable;
import java.util.List;
import r0.a;

public class GeoHashCircleQuery implements GeoHashQuery, Serializable {
    public final double a;
    public final GeoHashBoundingBoxQuery b;
    public final WGS84Point c;

    public GeoHashCircleQuery(WGS84Point wGS84Point0, double f) {
        this.a = f;
        this.c = wGS84Point0;
        this.b = new GeoHashBoundingBoxQuery(new BoundingBox(VincentyGeodesy.moveInDirection(VincentyGeodesy.moveInDirection(wGS84Point0, 0.0, f), 90.0, f), VincentyGeodesy.moveInDirection(VincentyGeodesy.moveInDirection(wGS84Point0, 180.0, f), 270.0, f)));
    }

    @Override  // ch.hsr.geohash.queries.GeoHashQuery
    public boolean contains(GeoHash geoHash0) {
        return this.b.contains(geoHash0);
    }

    @Override  // ch.hsr.geohash.queries.GeoHashQuery
    public boolean contains(WGS84Point wGS84Point0) {
        return this.b.contains(wGS84Point0);
    }

    @Override  // ch.hsr.geohash.queries.GeoHashQuery
    public List getSearchHashes() {
        return this.b.getSearchHashes();
    }

    @Override  // ch.hsr.geohash.queries.GeoHashQuery
    public String getWktBox() {
        return this.b.getWktBox();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Cicle Query [center=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", radius=");
        return this.a > 1000.0 ? a.o(stringBuilder0, this.a / 1000.0 + "km", "]") : a.o(stringBuilder0, this.a + "m", "]");
    }
}

