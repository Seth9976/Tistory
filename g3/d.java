package g3;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import androidx.core.location.GnssStatusCompat;
import androidx.core.util.Preconditions;
import java.util.Iterator;

public final class d extends GnssStatusCompat {
    public final GpsStatus a;
    public int b;
    public Iterator c;
    public int d;
    public GpsSatellite e;

    public d(GpsStatus gpsStatus0) {
        GpsStatus gpsStatus1 = (GpsStatus)Preconditions.checkNotNull(gpsStatus0);
        this.a = gpsStatus1;
        this.b = -1;
        this.c = gpsStatus1.getSatellites().iterator();
        this.d = -1;
        this.e = null;
    }

    public static int a(int v) {
        if(v > 0 && v <= 0x20) {
            return 1;
        }
        if(v >= 33 && v <= 0x40) {
            return 2;
        }
        if(v > 0x40 && v <= 88) {
            return 3;
        }
        if(v > 200 && v <= 0xEB) {
            return 5;
        }
        return v < 0xC1 || v > 200 ? 0 : 4;
    }

    public final GpsSatellite b(int v) {
        synchronized(this.a) {
            if(v < this.d) {
                this.c = this.a.getSatellites().iterator();
                this.d = -1;
            }
            int v2;
            while((v2 = this.d) < v) {
                this.d = v2 + 1;
                if(!this.c.hasNext()) {
                    this.e = null;
                    break;
                }
                Object object0 = this.c.next();
                this.e = (GpsSatellite)object0;
            }
        }
        return (GpsSatellite)Preconditions.checkNotNull(this.e);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof d ? this.a.equals(((d)object0).a) : false;
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final float getAzimuthDegrees(int v) {
        return this.b(v).getAzimuth();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final float getBasebandCn0DbHz(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final float getCarrierFrequencyHz(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final float getCn0DbHz(int v) {
        return this.b(v).getSnr();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final int getConstellationType(int v) {
        return d.a(this.b(v).getPrn());
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final float getElevationDegrees(int v) {
        return this.b(v).getElevation();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final int getSatelliteCount() {
        synchronized(this.a) {
            if(this.b == -1) {
                for(Object object0: this.a.getSatellites()) {
                    GpsSatellite gpsSatellite0 = (GpsSatellite)object0;
                    ++this.b;
                }
                ++this.b;
            }
            return this.b;
        }
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final int getSvid(int v) {
        int v1 = this.b(v).getPrn();
        switch(d.a(v1)) {
            case 2: {
                return v1 + 87;
            }
            case 3: {
                return v1 - 0x40;
            }
            case 5: {
                return v1 - 200;
            }
            default: {
                return v1;
            }
        }
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final boolean hasAlmanacData(int v) {
        return this.b(v).hasAlmanac();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final boolean hasBasebandCn0DbHz(int v) {
        return false;
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final boolean hasCarrierFrequencyHz(int v) {
        return false;
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final boolean hasEphemerisData(int v) {
        return this.b(v).hasEphemeris();
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final boolean usedInFix(int v) {
        return this.b(v).usedInFix();
    }
}

