package ch.hsr.geohash.queries;

import ch.hsr.geohash.GeoHash;
import ch.hsr.geohash.WGS84Point;
import java.util.List;

public interface GeoHashQuery {
    boolean contains(GeoHash arg1);

    boolean contains(WGS84Point arg1);

    List getSearchHashes();

    String getWktBox();
}

