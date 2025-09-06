package androidx.core.location;

import android.location.GnssStatus.Callback;
import android.location.GnssStatus;
import androidx.core.util.Preconditions;

public final class c extends GnssStatus.Callback {
    public final Callback a;

    public c(Callback gnssStatusCompat$Callback0) {
        Preconditions.checkArgument(gnssStatusCompat$Callback0 != null, "invalid null callback");
        this.a = gnssStatusCompat$Callback0;
    }

    @Override  // android.location.GnssStatus$Callback
    public final void onFirstFix(int v) {
    }

    @Override  // android.location.GnssStatus$Callback
    public final void onSatelliteStatusChanged(GnssStatus gnssStatus0) {
        GnssStatusCompat.wrap(gnssStatus0);
    }

    @Override  // android.location.GnssStatus$Callback
    public final void onStarted() {
    }

    @Override  // android.location.GnssStatus$Callback
    public final void onStopped() {
    }
}

