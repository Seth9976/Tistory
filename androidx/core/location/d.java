package androidx.core.location;

import android.location.GnssStatus.Callback;
import android.location.GnssStatus;
import androidx.activity.j;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.k;
import g3.w;
import java.util.concurrent.Executor;

public final class d extends GnssStatus.Callback {
    public final Callback a;
    public volatile Executor b;

    public d(Callback gnssStatusCompat$Callback0) {
        Preconditions.checkArgument(gnssStatusCompat$Callback0 != null, "invalid null callback");
        this.a = gnssStatusCompat$Callback0;
    }

    @Override  // android.location.GnssStatus$Callback
    public final void onFirstFix(int v) {
        Executor executor0 = this.b;
        if(executor0 == null) {
            return;
        }
        executor0.execute(new j(this, executor0, v, 3));
    }

    @Override  // android.location.GnssStatus$Callback
    public final void onSatelliteStatusChanged(GnssStatus gnssStatus0) {
        Executor executor0 = this.b;
        if(executor0 == null) {
            return;
        }
        executor0.execute(new k(this, executor0, 7, gnssStatus0));
    }

    @Override  // android.location.GnssStatus$Callback
    public final void onStarted() {
        Executor executor0 = this.b;
        if(executor0 == null) {
            return;
        }
        executor0.execute(new w(this, executor0, 1));
    }

    @Override  // android.location.GnssStatus$Callback
    public final void onStopped() {
        Executor executor0 = this.b;
        if(executor0 == null) {
            return;
        }
        executor0.execute(new w(this, executor0, 0));
    }
}

