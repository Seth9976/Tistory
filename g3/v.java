package g3;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.activity.m;
import c3.h;
import java.util.List;
import java.util.concurrent.Executor;

public final class v implements LocationListener {
    public volatile s a;
    public final Executor b;

    public v(s s0, Executor executor0) {
        this.a = s0;
        this.b = executor0;
    }

    @Override  // android.location.LocationListener
    public final void onFlushComplete(int v) {
        if(this.a == null) {
            return;
        }
        h h0 = new h(this, v, 2);
        this.b.execute(h0);
    }

    @Override  // android.location.LocationListener
    public final void onLocationChanged(Location location0) {
        if(this.a == null) {
            return;
        }
        m m0 = new m(23, this, location0);
        this.b.execute(m0);
    }

    @Override  // android.location.LocationListener
    public final void onLocationChanged(List list0) {
        if(this.a == null) {
            return;
        }
        m m0 = new m(22, this, list0);
        this.b.execute(m0);
    }

    @Override  // android.location.LocationListener
    public final void onProviderDisabled(String s) {
        if(this.a == null) {
            return;
        }
        t t0 = new t(this, s, 1);
        this.b.execute(t0);
    }

    @Override  // android.location.LocationListener
    public final void onProviderEnabled(String s) {
        if(this.a == null) {
            return;
        }
        t t0 = new t(this, s, 0);
        this.b.execute(t0);
    }

    @Override  // android.location.LocationListener
    public final void onStatusChanged(String s, int v, Bundle bundle0) {
        if(this.a == null) {
            return;
        }
        u u0 = new u(v, 0, this, s, bundle0);
        this.b.execute(u0);
    }
}

