package androidx.core.location;

import android.location.GnssMeasurementsEvent.Callback;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.activity.h;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.ExecutorCompat;
import androidx.core.util.Consumer;
import androidx.core.util.ObjectsCompat;
import f2.d;
import g3.j;
import g3.k;
import g3.l;
import g3.n;
import g3.o;
import g3.p;
import g3.q;
import g3.r;
import g3.s;
import g3.v;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

public final class LocationManagerCompat {
    public static Class a;
    public static Method b;
    public static Method c;
    public static final WeakHashMap d;

    static {
        LocationManagerCompat.d = new WeakHashMap();
    }

    public static boolean a(LocationManager locationManager0, Executor executor0, GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0) {
        if(Build.VERSION.SDK_INT != 30) {
            throw new IllegalStateException();
        }
        try {
            if(LocationManagerCompat.a == null) {
                LocationManagerCompat.a = Class.forName("android.location.GnssRequest$Builder");
            }
            if(LocationManagerCompat.b == null) {
                Method method0 = LocationManagerCompat.a.getDeclaredMethod("build", null);
                LocationManagerCompat.b = method0;
                method0.setAccessible(true);
            }
            if(LocationManagerCompat.c == null) {
                Class[] arr_class = {Class.forName("android.location.GnssRequest"), Executor.class, GnssMeasurementsEvent.Callback.class};
                Method method1 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", arr_class);
                LocationManagerCompat.c = method1;
                method1.setAccessible(true);
            }
            Object object0 = LocationManagerCompat.c.invoke(locationManager0, LocationManagerCompat.b.invoke(LocationManagerCompat.a.getDeclaredConstructor(null).newInstance(null), null), executor0, gnssMeasurementsEvent$Callback0);
            if(object0 != null && ((Boolean)object0).booleanValue()) {
                return true;
            }
        }
        catch(ClassNotFoundException | InvocationTargetException | NoSuchMethodException | IllegalAccessException | InstantiationException unused_ex) {
        }
        return false;
    }

    public static void b(LocationManager locationManager0, v v0) {
        s s0 = (s)ObjectsCompat.requireNonNull(v0.a);
        WeakReference weakReference0 = new WeakReference(v0);
        WeakReference weakReference1 = (WeakReference)LocationManagerCompat.d.put(s0, weakReference0);
        v v1 = weakReference1 == null ? null : ((v)weakReference1.get());
        if(v1 != null) {
            v1.a = null;
            locationManager0.removeUpdates(v1);
        }
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void getCurrentLocation(@NonNull LocationManager locationManager0, @NonNull String s, @Nullable CancellationSignal cancellationSignal0, @NonNull Executor executor0, @NonNull Consumer consumer0) {
        if(Build.VERSION.SDK_INT >= 30) {
            b.a(locationManager0, s, cancellationSignal0, executor0, consumer0);
            return;
        }
        if(cancellationSignal0 != null) {
            cancellationSignal0.throwIfCanceled();
        }
        Location location0 = locationManager0.getLastKnownLocation(s);
        if(location0 != null && SystemClock.elapsedRealtime() - LocationCompat.getElapsedRealtimeMillis(location0) < 10000L) {
            executor0.execute(new j(consumer0, location0, 0));
            return;
        }
        o o0 = new o(locationManager0, executor0, consumer0);
        locationManager0.requestLocationUpdates(s, 0L, 0.0f, o0, Looper.getMainLooper());
        if(cancellationSignal0 != null) {
            cancellationSignal0.setOnCancelListener(new d(o0, 1));
        }
        synchronized(o0) {
            if(o0.e) {
                return;
            }
            h h0 = new h(o0, 21);
            o0.f = h0;
            o0.c.postDelayed(h0, 30000L);
        }
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @Deprecated
    public static void getCurrentLocation(@NonNull LocationManager locationManager0, @NonNull String s, @Nullable androidx.core.os.CancellationSignal cancellationSignal0, @NonNull Executor executor0, @NonNull Consumer consumer0) {
        LocationManagerCompat.getCurrentLocation(locationManager0, s, (cancellationSignal0 == null ? null : ((CancellationSignal)cancellationSignal0.getCancellationSignalObject())), executor0, consumer0);
    }

    @Nullable
    public static String getGnssHardwareModelName(@NonNull LocationManager locationManager0) {
        return Build.VERSION.SDK_INT < 28 ? null : l.a(locationManager0);
    }

    public static int getGnssYearOfHardware(@NonNull LocationManager locationManager0) {
        return Build.VERSION.SDK_INT < 28 ? 0 : l.b(locationManager0);
    }

    public static boolean hasProvider(@NonNull LocationManager locationManager0, @NonNull String s) {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            return n.a(locationManager0, s);
        }
        if(locationManager0.getAllProviders().contains(s)) {
            return true;
        }
        try {
            return locationManager0.getProvider(s) == null ? false : true;
        }
        catch(SecurityException unused_ex) {
            return false;
        }
    }

    // 去混淆评级： 低(20)
    public static boolean isLocationEnabled(@NonNull LocationManager locationManager0) {
        return Build.VERSION.SDK_INT < 28 ? locationManager0.isProviderEnabled("network") || locationManager0.isProviderEnabled("gps") : l.c(locationManager0);
    }

    @RequiresApi(24)
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssMeasurementsCallback(@NonNull LocationManager locationManager0, @NonNull GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0, @NonNull Handler handler0) {
        int v = Build.VERSION.SDK_INT;
        if(v > 30) {
            return a.b(locationManager0, gnssMeasurementsEvent$Callback0, handler0);
        }
        if(v == 30) {
            return LocationManagerCompat.a(locationManager0, ExecutorCompat.create(handler0), gnssMeasurementsEvent$Callback0);
        }
        SimpleArrayMap simpleArrayMap0 = p.b;
        synchronized(simpleArrayMap0) {
            LocationManagerCompat.unregisterGnssMeasurementsCallback(locationManager0, gnssMeasurementsEvent$Callback0);
            if(a.b(locationManager0, gnssMeasurementsEvent$Callback0, handler0)) {
                simpleArrayMap0.put(gnssMeasurementsEvent$Callback0, gnssMeasurementsEvent$Callback0);
                return true;
            }
            return false;
        }
    }

    @RequiresApi(24)
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssMeasurementsCallback(@NonNull LocationManager locationManager0, @NonNull Executor executor0, @NonNull GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0) {
        int v = Build.VERSION.SDK_INT;
        if(v > 30) {
            return n.b(locationManager0, executor0, gnssMeasurementsEvent$Callback0);
        }
        if(v == 30) {
            return LocationManagerCompat.a(locationManager0, executor0, gnssMeasurementsEvent$Callback0);
        }
        SimpleArrayMap simpleArrayMap0 = p.b;
        synchronized(simpleArrayMap0) {
            q q0 = new q(gnssMeasurementsEvent$Callback0, executor0);
            LocationManagerCompat.unregisterGnssMeasurementsCallback(locationManager0, gnssMeasurementsEvent$Callback0);
            if(a.a(locationManager0, q0)) {
                simpleArrayMap0.put(gnssMeasurementsEvent$Callback0, q0);
                return true;
            }
            return false;
        }
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@NonNull LocationManager locationManager0, @NonNull Callback gnssStatusCompat$Callback0, @NonNull Handler handler0) {
        return Build.VERSION.SDK_INT < 30 ? LocationManagerCompat.registerGnssStatusCallback(locationManager0, new r(handler0), gnssStatusCompat$Callback0) : LocationManagerCompat.registerGnssStatusCallback(locationManager0, ExecutorCompat.create(handler0), gnssStatusCompat$Callback0);
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@NonNull LocationManager locationManager0, @NonNull Executor executor0, @NonNull Callback gnssStatusCompat$Callback0) {
        if(Build.VERSION.SDK_INT >= 30) {
            return b.b(locationManager0, null, executor0, gnssStatusCompat$Callback0);
        }
        Looper looper0 = Looper.myLooper();
        if(looper0 == null) {
            looper0 = Looper.getMainLooper();
        }
        return a.c(locationManager0, new Handler(looper0), executor0, gnssStatusCompat$Callback0);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void removeUpdates(@NonNull LocationManager locationManager0, @NonNull LocationListenerCompat locationListenerCompat0) {
        WeakHashMap weakHashMap0 = LocationManagerCompat.d;
        synchronized(weakHashMap0) {
            ArrayList arrayList0 = null;
            for(Object object0: weakHashMap0.values()) {
                v v1 = (v)((WeakReference)object0).get();
                if(v1 != null) {
                    s s0 = (s)ObjectsCompat.requireNonNull(v1.a);
                    if(s0.b == locationListenerCompat0) {
                        if(arrayList0 == null) {
                            arrayList0 = new ArrayList();
                        }
                        arrayList0.add(s0);
                        v1.a = null;
                        locationManager0.removeUpdates(v1);
                    }
                }
            }
            if(arrayList0 != null) {
                for(Object object1: arrayList0) {
                    LocationManagerCompat.d.remove(((s)object1));
                }
            }
        }
        locationManager0.removeUpdates(locationListenerCompat0);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void requestLocationUpdates(@NonNull LocationManager locationManager0, @NonNull String s, @NonNull LocationRequestCompat locationRequestCompat0, @NonNull LocationListenerCompat locationListenerCompat0, @NonNull Looper looper0) {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            n.c(locationManager0, s, locationRequestCompat0.toLocationRequest(), ExecutorCompat.create(new Handler(looper0)), locationListenerCompat0);
            return;
        }
        if(k.a(locationManager0, s, locationRequestCompat0, locationListenerCompat0, looper0)) {
            return;
        }
        locationManager0.requestLocationUpdates(s, locationRequestCompat0.getIntervalMillis(), locationRequestCompat0.getMinUpdateDistanceMeters(), locationListenerCompat0, looper0);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void requestLocationUpdates(@NonNull LocationManager locationManager0, @NonNull String s, @NonNull LocationRequestCompat locationRequestCompat0, @NonNull Executor executor0, @NonNull LocationListenerCompat locationListenerCompat0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 0x1F) {
            n.c(locationManager0, s, locationRequestCompat0.toLocationRequest(), executor0, locationListenerCompat0);
            return;
        }
        if(v >= 30 && b.c(locationManager0, s, locationRequestCompat0, executor0, locationListenerCompat0)) {
            return;
        }
        v v1 = new v(new s(s, locationListenerCompat0), executor0);
        if(k.b(locationManager0, s, locationRequestCompat0, v1)) {
            return;
        }
        synchronized(LocationManagerCompat.d) {
            locationManager0.requestLocationUpdates(s, locationRequestCompat0.getIntervalMillis(), locationRequestCompat0.getMinUpdateDistanceMeters(), v1, Looper.getMainLooper());
            LocationManagerCompat.b(locationManager0, v1);
        }
    }

    @RequiresApi(24)
    public static void unregisterGnssMeasurementsCallback(@NonNull LocationManager locationManager0, @NonNull GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0) {
        if(Build.VERSION.SDK_INT >= 30) {
            a.d(locationManager0, gnssMeasurementsEvent$Callback0);
            return;
        }
        SimpleArrayMap simpleArrayMap0 = p.b;
        synchronized(simpleArrayMap0) {
            GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback1 = (GnssMeasurementsEvent.Callback)simpleArrayMap0.remove(gnssMeasurementsEvent$Callback0);
            if(gnssMeasurementsEvent$Callback1 != null) {
                if(gnssMeasurementsEvent$Callback1 instanceof q) {
                    ((q)gnssMeasurementsEvent$Callback1).b = null;
                }
                a.d(locationManager0, gnssMeasurementsEvent$Callback1);
            }
        }
    }

    public static void unregisterGnssStatusCallback(@NonNull LocationManager locationManager0, @NonNull Callback gnssStatusCompat$Callback0) {
        SimpleArrayMap simpleArrayMap0 = p.a;
        synchronized(simpleArrayMap0) {
            Object object0 = simpleArrayMap0.remove(gnssStatusCompat$Callback0);
            if(object0 != null) {
                a.e(locationManager0, object0);
            }
        }
    }
}

