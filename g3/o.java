package g3;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.h;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;

public final class o implements LocationListener {
    public final LocationManager a;
    public final Executor b;
    public final Handler c;
    public Consumer d;
    public boolean e;
    public h f;

    public o(LocationManager locationManager0, Executor executor0, Consumer consumer0) {
        this.a = locationManager0;
        this.b = executor0;
        this.c = new Handler(Looper.getMainLooper());
        this.d = consumer0;
    }

    @Override  // android.location.LocationListener
    public final void onLocationChanged(Location location0) {
        synchronized(this) {
            if(this.e) {
                return;
            }
            this.e = true;
        }
        j j0 = new j(this.d, location0, 1);
        this.b.execute(j0);
        this.d = null;
        this.a.removeUpdates(this);
        h h0 = this.f;
        if(h0 != null) {
            this.c.removeCallbacks(h0);
            this.f = null;
        }
    }

    @Override  // android.location.LocationListener
    public final void onProviderDisabled(String s) {
        this.onLocationChanged(null);
    }

    @Override  // android.location.LocationListener
    public final void onProviderEnabled(String s) {
    }

    @Override  // android.location.LocationListener
    public final void onStatusChanged(String s, int v, Bundle bundle0) {
    }
}

