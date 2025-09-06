package ch.hsr.geohash.queries;

import ch.hsr.geohash.BoundingBox;
import ch.hsr.geohash.GeoHash;
import ch.hsr.geohash.WGS84Point;
import ch.hsr.geohash.util.GeoHashSizeTable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GeoHashBoundingBoxQuery implements GeoHashQuery, Serializable {
    public final ArrayList a;
    public BoundingBox b;

    public GeoHashBoundingBoxQuery(BoundingBox boundingBox0) {
        this.a = new ArrayList(4);
        int v = GeoHashSizeTable.numberOfBitsForOverlappingGeoHash(boundingBox0);
        WGS84Point wGS84Point0 = boundingBox0.getCenterPoint();
        GeoHash geoHash0 = GeoHash.withBitPrecision(wGS84Point0.getLatitude(), wGS84Point0.getLongitude(), v);
        if(geoHash0.contains(boundingBox0.getUpperLeft()) && geoHash0.contains(boundingBox0.getLowerRight())) {
            this.a(geoHash0);
            return;
        }
        this.a(geoHash0);
        GeoHash[] arr_geoHash = geoHash0.getAdjacent();
        for(int v1 = 0; v1 < arr_geoHash.length; ++v1) {
            GeoHash geoHash1 = arr_geoHash[v1];
            if(geoHash1.getBoundingBox().intersects(boundingBox0) && !this.a.contains(geoHash1)) {
                this.a(geoHash1);
            }
        }
    }

    public final void a(GeoHash geoHash0) {
        BoundingBox boundingBox0 = this.b;
        if(boundingBox0 == null) {
            this.b = new BoundingBox(geoHash0.getBoundingBox());
        }
        else {
            boundingBox0.expandToInclude(geoHash0.getBoundingBox());
        }
        this.a.add(geoHash0);
    }

    @Override  // ch.hsr.geohash.queries.GeoHashQuery
    public boolean contains(GeoHash geoHash0) {
        for(Object object0: this.a) {
            if(geoHash0.within(((GeoHash)object0))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override  // ch.hsr.geohash.queries.GeoHashQuery
    public boolean contains(WGS84Point wGS84Point0) {
        return this.contains(GeoHash.withBitPrecision(wGS84Point0.getLatitude(), wGS84Point0.getLongitude(), 0x40));
    }

    @Override  // ch.hsr.geohash.queries.GeoHashQuery
    public List getSearchHashes() {
        return this.a;
    }

    @Override  // ch.hsr.geohash.queries.GeoHashQuery
    public String getWktBox() {
        return "BOX(" + this.b.getMinLon() + " " + this.b.getMinLat() + "," + this.b.getMaxLon() + " " + this.b.getMaxLat() + ")";
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: this.a) {
            stringBuilder0.append(((GeoHash)object0));
            stringBuilder0.append("\n");
        }
        return stringBuilder0.toString();
    }
}

