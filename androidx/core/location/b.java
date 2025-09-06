package androidx.core.location;

import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Consumer;
import g3.m;
import g3.p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.Executor;

public abstract class b {
    public static Class a;
    public static Method b;

    @DoNotInline
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void a(LocationManager locationManager0, @NonNull String s, @Nullable CancellationSignal cancellationSignal0, @NonNull Executor executor0, @NonNull Consumer consumer0) {
        Objects.requireNonNull(consumer0);
        locationManager0.getCurrentLocation(s, cancellationSignal0, executor0, new m(consumer0));
    }

    @DoNotInline
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static boolean b(LocationManager locationManager0, Handler handler0, Executor executor0, Callback gnssStatusCompat$Callback0) {
        SimpleArrayMap simpleArrayMap0 = p.a;
        synchronized(simpleArrayMap0) {
            c c0 = (c)simpleArrayMap0.get(gnssStatusCompat$Callback0);
            if(c0 == null) {
                c0 = new c(gnssStatusCompat$Callback0);
            }
            if(locationManager0.registerGnssStatusCallback(executor0, c0)) {
                simpleArrayMap0.put(gnssStatusCompat$Callback0, c0);
                return true;
            }
            return false;
        }
    }

    @DoNotInline
    public static boolean c(LocationManager locationManager0, String s, LocationRequestCompat locationRequestCompat0, Executor executor0, LocationListenerCompat locationListenerCompat0) {
        if(Build.VERSION.SDK_INT >= 30) {
            try {
                if(b.a == null) {
                    b.a = LocationRequest.class;
                }
                if(b.b == null) {
                    Method method0 = LocationManager.class.getDeclaredMethod("requestLocationUpdates", b.a, Executor.class, LocationListener.class);
                    b.b = method0;
                    method0.setAccessible(true);
                }
                LocationRequest locationRequest0 = locationRequestCompat0.toLocationRequest(s);
                if(locationRequest0 != null) {
                    b.b.invoke(locationManager0, locationRequest0, executor0, locationListenerCompat0);
                    return true;
                }
                return false;
            }
            catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException | ClassNotFoundException | UnsupportedOperationException unused_ex) {
            }
        }
        return false;
    }
}

