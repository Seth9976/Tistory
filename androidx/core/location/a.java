package androidx.core.location;

import android.location.GnssMeasurementsEvent.Callback;
import android.location.GnssStatus.Callback;
import android.location.LocationManager;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Preconditions;
import g3.p;
import java.util.concurrent.Executor;

public abstract class a {
    @DoNotInline
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean a(@NonNull LocationManager locationManager0, @NonNull GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0) {
        return locationManager0.registerGnssMeasurementsCallback(gnssMeasurementsEvent$Callback0);
    }

    @DoNotInline
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean b(@NonNull LocationManager locationManager0, @NonNull GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0, @NonNull Handler handler0) {
        return locationManager0.registerGnssMeasurementsCallback(gnssMeasurementsEvent$Callback0, handler0);
    }

    @DoNotInline
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static boolean c(LocationManager locationManager0, Handler handler0, Executor executor0, Callback gnssStatusCompat$Callback0) {
        Preconditions.checkArgument(handler0 != null);
        SimpleArrayMap simpleArrayMap0 = p.a;
        synchronized(simpleArrayMap0) {
            d d0 = (d)simpleArrayMap0.get(gnssStatusCompat$Callback0);
            if(d0 == null) {
                d0 = new d(gnssStatusCompat$Callback0);
            }
            else {
                d0.b = null;
            }
            Preconditions.checkArgument(executor0 != null, "invalid null executor");
            Preconditions.checkState(d0.b == null);
            d0.b = executor0;
            if(locationManager0.registerGnssStatusCallback(d0, handler0)) {
                simpleArrayMap0.put(gnssStatusCompat$Callback0, d0);
                return true;
            }
            return false;
        }
    }

    @DoNotInline
    public static void d(@NonNull LocationManager locationManager0, @NonNull GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0) {
        locationManager0.unregisterGnssMeasurementsCallback(gnssMeasurementsEvent$Callback0);
    }

    @DoNotInline
    public static void e(LocationManager locationManager0, Object object0) {
        if(object0 instanceof d) {
            ((d)object0).b = null;
        }
        locationManager0.unregisterGnssStatusCallback(((GnssStatus.Callback)object0));
    }
}

