package g3;

import android.location.GnssStatus;
import android.os.Build.VERSION;
import androidx.core.location.GnssStatusCompat;
import androidx.core.util.Preconditions;

public final class c extends GnssStatusCompat {
    public final GnssStatus a;

    public c(GnssStatus gnssStatus0) {
        this.a = (GnssStatus)Preconditions.checkNotNull(gnssStatus0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof c ? this.a.equals(((c)object0).a) : false;
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final float getAzimuthDegrees(int v) {
        return this.a.getAzimuthDegrees(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final float getBasebandCn0DbHz(int v) {
        if(Build.VERSION.SDK_INT < 30) {
            throw new UnsupportedOperationException();
        }
        return b.a(this.a, v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final float getCarrierFrequencyHz(int v) {
        return a.a(this.a, v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final float getCn0DbHz(int v) {
        return this.a.getCn0DbHz(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final int getConstellationType(int v) {
        return this.a.getConstellationType(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final float getElevationDegrees(int v) {
        return this.a.getElevationDegrees(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final int getSatelliteCount() {
        return this.a.getSatelliteCount();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final int getSvid(int v) {
        return this.a.getSvid(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final boolean hasAlmanacData(int v) {
        return this.a.hasAlmanacData(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final boolean hasBasebandCn0DbHz(int v) {
        return Build.VERSION.SDK_INT < 30 ? false : b.b(this.a, v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final boolean hasCarrierFrequencyHz(int v) {
        return a.b(this.a, v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final boolean hasEphemerisData(int v) {
        return this.a.hasEphemerisData(v);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public final boolean usedInFix(int v) {
        return this.a.usedInFix(v);
    }
}

