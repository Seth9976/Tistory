package g3;

import android.annotation.SuppressLint;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Looper;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.core.location.LocationListenerCompat;
import androidx.core.location.LocationManagerCompat;
import androidx.core.location.LocationRequestCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class k {
    public static Class a;
    public static Method b;

    @SuppressLint({"BanUncheckedReflection"})
    @DoNotInline
    public static boolean a(LocationManager locationManager0, String s, LocationRequestCompat locationRequestCompat0, LocationListenerCompat locationListenerCompat0, Looper looper0) {
        try {
            if(k.a == null) {
                k.a = LocationRequest.class;
            }
            if(k.b == null) {
                Method method0 = LocationManager.class.getDeclaredMethod("requestLocationUpdates", k.a, LocationListener.class, Looper.class);
                k.b = method0;
                method0.setAccessible(true);
            }
            LocationRequest locationRequest0 = locationRequestCompat0.toLocationRequest(s);
            if(locationRequest0 != null) {
                k.b.invoke(locationManager0, locationRequest0, locationListenerCompat0, looper0);
                return true;
            }
        }
        catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException | ClassNotFoundException | UnsupportedOperationException unused_ex) {
        }
        return false;
    }

    @SuppressLint({"BanUncheckedReflection"})
    @DoNotInline
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static boolean b(LocationManager locationManager0, String s, LocationRequestCompat locationRequestCompat0, v v0) {
        try {
            if(k.a == null) {
                k.a = LocationRequest.class;
            }
            if(k.b == null) {
                Method method0 = LocationManager.class.getDeclaredMethod("requestLocationUpdates", k.a, LocationListener.class, Looper.class);
                k.b = method0;
                method0.setAccessible(true);
            }
            LocationRequest locationRequest0 = locationRequestCompat0.toLocationRequest(s);
            if(locationRequest0 != null) {
                synchronized(LocationManagerCompat.d) {
                    k.b.invoke(locationManager0, locationRequest0, v0, Looper.getMainLooper());
                    LocationManagerCompat.b(locationManager0, v0);
                    return true;
                }
            }
        }
        catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException | ClassNotFoundException | UnsupportedOperationException unused_ex) {
        }
        return false;
    }
}

