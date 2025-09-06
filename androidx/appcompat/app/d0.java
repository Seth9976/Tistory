package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import java.util.Calendar;

public final class d0 extends f0 {
    public final int c;
    public final i0 d;
    public final Object e;

    public d0(i0 i00, Context context0) {
        this.c = 0;
        this.d = i00;
        super(i00);
        this.e = (PowerManager)context0.getApplicationContext().getSystemService("power");
    }

    public d0(i0 i00, w0 w00) {
        this.c = 1;
        this.d = i00;
        super(i00);
        this.e = w00;
    }

    @Override  // androidx.appcompat.app.f0
    public final IntentFilter b() {
        if(this.c != 0) {
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.TIME_SET");
            intentFilter0.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter0.addAction("android.intent.action.TIME_TICK");
            return intentFilter0;
        }
        IntentFilter intentFilter1 = new IntentFilter();
        intentFilter1.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter1;
    }

    @Override  // androidx.appcompat.app.f0
    public final int c() {
        long v5;
        Location location2;
        Location location1;
        if(this.c != 0) {
            w0 w00 = (w0)this.e;
            v0 v00 = (v0)w00.c;
            if(Long.compare(v00.b, System.currentTimeMillis()) > 0) {
                return v00.a ? 2 : 1;
            }
            Context context0 = (Context)w00.a;
            int v = PermissionChecker.checkSelfPermission(context0, "android.permission.ACCESS_COARSE_LOCATION");
            Location location0 = null;
            LocationManager locationManager0 = (LocationManager)w00.b;
            if(v == 0) {
                try {
                    if(locationManager0.isProviderEnabled("network")) {
                        location1 = locationManager0.getLastKnownLocation("network");
                    }
                    else {
                        goto label_17;
                    }
                }
                catch(Exception exception0) {
                    Log.d("TwilightManager", "Failed to get last known location", exception0);
                    location1 = null;
                }
                goto label_18;
            label_17:
                location1 = null;
            label_18:
                location2 = location1;
            }
            else {
                location2 = null;
            }
            if(PermissionChecker.checkSelfPermission(context0, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                try {
                    if(locationManager0.isProviderEnabled("gps")) {
                        location0 = locationManager0.getLastKnownLocation("gps");
                    }
                }
                catch(Exception exception1) {
                    Log.d("TwilightManager", "Failed to get last known location", exception1);
                }
            }
            if(location0 == null || location2 == null) {
                if(location0 != null) {
                    location2 = location0;
                }
            }
            else if(location0.getTime() > location2.getTime()) {
                location2 = location0;
            }
            boolean z = false;
            if(location2 != null) {
                long v1 = System.currentTimeMillis();
                if(u0.d == null) {
                    u0.d = new u0();  // 初始化器: Ljava/lang/Object;-><init>()V
                }
                u0 u00 = u0.d;
                u00.a(location2.getLatitude(), location2.getLongitude(), v1 - 86400000L);
                u00.a(location2.getLatitude(), location2.getLongitude(), v1);
                if(u00.c == 1) {
                    z = true;
                }
                long v2 = u00.b;
                long v3 = u00.a;
                u00.a(location2.getLatitude(), location2.getLongitude(), v1 + 86400000L);
                long v4 = u00.b;
                if(v2 == -1L || v3 == -1L) {
                    v5 = v1 + 43200000L;
                }
                else {
                    if(v1 <= v3) {
                        v4 = v1 <= v2 ? v2 : v3;
                    }
                    v5 = v4 + 60000L;
                }
                v00.a = z;
                v00.b = v5;
                return z ? 2 : 1;
            }
            Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
            int v6 = Calendar.getInstance().get(11);
            if(v6 < 6 || v6 >= 22) {
                z = true;
            }
            return z ? 2 : 1;
        }
        return ((PowerManager)this.e).isPowerSaveMode() ? 2 : 1;
    }

    @Override  // androidx.appcompat.app.f0
    public final void d() {
        if(this.c != 0) {
            this.d.f(true, true);
            return;
        }
        this.d.f(true, true);
    }
}

