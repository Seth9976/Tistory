package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import g3.c;
import g3.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class GnssStatusCompat {
    public static abstract class Callback {
        public void onFirstFix(@IntRange(from = 0L) int v) {
        }

        public void onSatelliteStatusChanged(@NonNull GnssStatusCompat gnssStatusCompat0) {
        }

        public void onStarted() {
        }

        public void onStopped() {
        }
    }

    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConstellationType {
    }

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_BEIDOU = 5;
    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_GALILEO = 6;
    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_GLONASS = 3;
    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_GPS = 1;
    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_IRNSS = 7;
    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_QZSS = 4;
    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_SBAS = 2;
    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_UNKNOWN;

    @FloatRange(from = 0.0, to = 360.0)
    public abstract float getAzimuthDegrees(@IntRange(from = 0L) int arg1);

    @FloatRange(from = 0.0, to = 63.0)
    public abstract float getBasebandCn0DbHz(@IntRange(from = 0L) int arg1);

    @FloatRange(from = 0.0)
    public abstract float getCarrierFrequencyHz(@IntRange(from = 0L) int arg1);

    @FloatRange(from = 0.0, to = 63.0)
    public abstract float getCn0DbHz(@IntRange(from = 0L) int arg1);

    public abstract int getConstellationType(@IntRange(from = 0L) int arg1);

    @FloatRange(from = -90.0, to = 90.0)
    public abstract float getElevationDegrees(@IntRange(from = 0L) int arg1);

    @IntRange(from = 0L)
    public abstract int getSatelliteCount();

    @IntRange(from = 1L, to = 200L)
    public abstract int getSvid(@IntRange(from = 0L) int arg1);

    public abstract boolean hasAlmanacData(@IntRange(from = 0L) int arg1);

    public abstract boolean hasBasebandCn0DbHz(@IntRange(from = 0L) int arg1);

    public abstract boolean hasCarrierFrequencyHz(@IntRange(from = 0L) int arg1);

    public abstract boolean hasEphemerisData(@IntRange(from = 0L) int arg1);

    public abstract boolean usedInFix(@IntRange(from = 0L) int arg1);

    @NonNull
    @RequiresApi(24)
    public static GnssStatusCompat wrap(@NonNull GnssStatus gnssStatus0) {
        return new c(gnssStatus0);
    }

    @SuppressLint({"ReferencesDeprecated"})
    @NonNull
    public static GnssStatusCompat wrap(@NonNull GpsStatus gpsStatus0) {
        return new d(gpsStatus0);
    }
}

