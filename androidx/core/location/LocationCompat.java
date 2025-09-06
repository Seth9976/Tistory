package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import g3.e;
import g3.f;
import g3.g;
import g3.h;
import g3.i;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public final class LocationCompat {
    public static final String EXTRA_BEARING_ACCURACY = "bearingAccuracy";
    public static final String EXTRA_IS_MOCK = "mockLocation";
    public static final String EXTRA_MSL_ALTITUDE = "androidx.core.location.extra.MSL_ALTITUDE";
    public static final String EXTRA_MSL_ALTITUDE_ACCURACY = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    public static final String EXTRA_SPEED_ACCURACY = "speedAccuracy";
    public static final String EXTRA_VERTICAL_ACCURACY = "verticalAccuracy";
    public static Method a;
    public static Field b;
    public static Integer c;
    public static Integer d;
    public static Integer e;

    public static Field a() {
        if(LocationCompat.b == null) {
            Field field0 = Location.class.getDeclaredField("mFieldsMask");
            LocationCompat.b = field0;
            field0.setAccessible(true);
        }
        return LocationCompat.b;
    }

    public static int b() {
        if(LocationCompat.d == null) {
            Field field0 = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            field0.setAccessible(true);
            LocationCompat.d = field0.getInt(null);
        }
        return (int)LocationCompat.d;
    }

    public static int c() {
        if(LocationCompat.c == null) {
            Field field0 = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            field0.setAccessible(true);
            LocationCompat.c = field0.getInt(null);
        }
        return (int)LocationCompat.c;
    }

    public static int d() {
        if(LocationCompat.e == null) {
            Field field0 = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            field0.setAccessible(true);
            LocationCompat.e = field0.getInt(null);
        }
        return (int)LocationCompat.e;
    }

    public static Bundle e(Location location0) {
        Bundle bundle0 = location0.getExtras();
        if(bundle0 == null) {
            location0.setExtras(new Bundle());
            return location0.getExtras();
        }
        return bundle0;
    }

    public static Method f() {
        if(LocationCompat.a == null) {
            Method method0 = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            LocationCompat.a = method0;
            method0.setAccessible(true);
        }
        return LocationCompat.a;
    }

    public static float getBearingAccuracyDegrees(@NonNull Location location0) {
        return e.a(location0);
    }

    public static long getElapsedRealtimeMillis(@NonNull Location location0) {
        return TimeUnit.NANOSECONDS.toMillis(location0.getElapsedRealtimeNanos());
    }

    public static long getElapsedRealtimeNanos(@NonNull Location location0) {
        return location0.getElapsedRealtimeNanos();
    }

    @FloatRange(from = 0.0)
    public static float getMslAltitudeAccuracyMeters(@NonNull Location location0) {
        return Build.VERSION.SDK_INT < 34 ? LocationCompat.e(location0).getFloat("androidx.core.location.extra.MSL_ALTITUDE_ACCURACY") : i.a(location0);
    }

    public static double getMslAltitudeMeters(@NonNull Location location0) {
        return Build.VERSION.SDK_INT < 34 ? LocationCompat.e(location0).getDouble("androidx.core.location.extra.MSL_ALTITUDE") : i.b(location0);
    }

    public static float getSpeedAccuracyMetersPerSecond(@NonNull Location location0) {
        return e.b(location0);
    }

    public static float getVerticalAccuracyMeters(@NonNull Location location0) {
        return e.c(location0);
    }

    public static boolean hasBearingAccuracy(@NonNull Location location0) {
        return e.d(location0);
    }

    public static boolean hasMslAltitude(@NonNull Location location0) {
        if(Build.VERSION.SDK_INT >= 34) {
            return i.c(location0);
        }
        Bundle bundle0 = location0.getExtras();
        return bundle0 != null && bundle0.containsKey("androidx.core.location.extra.MSL_ALTITUDE");
    }

    public static boolean hasMslAltitudeAccuracy(@NonNull Location location0) {
        if(Build.VERSION.SDK_INT >= 34) {
            return i.d(location0);
        }
        Bundle bundle0 = location0.getExtras();
        return bundle0 != null && bundle0.containsKey("androidx.core.location.extra.MSL_ALTITUDE_ACCURACY");
    }

    public static boolean hasSpeedAccuracy(@NonNull Location location0) {
        return e.e(location0);
    }

    public static boolean hasVerticalAccuracy(@NonNull Location location0) {
        return e.f(location0);
    }

    public static boolean isMock(@NonNull Location location0) {
        return location0.isFromMockProvider();
    }

    public static void removeBearingAccuracy(@NonNull Location location0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            h.a(location0);
            return;
        }
        if(v >= 29) {
            g.a(location0);
            return;
        }
        if(v >= 28) {
            f.a(location0);
            return;
        }
        e.g(location0);
    }

    public static void removeMslAltitude(@NonNull Location location0) {
        if(Build.VERSION.SDK_INT >= 34) {
            i.e(location0);
            return;
        }
        Bundle bundle0 = location0.getExtras();
        if(bundle0 != null) {
            bundle0.remove("androidx.core.location.extra.MSL_ALTITUDE");
            if(bundle0.isEmpty()) {
                location0.setExtras(null);
            }
        }
    }

    public static void removeMslAltitudeAccuracy(@NonNull Location location0) {
        if(Build.VERSION.SDK_INT >= 34) {
            i.f(location0);
            return;
        }
        Bundle bundle0 = location0.getExtras();
        if(bundle0 != null) {
            bundle0.remove("androidx.core.location.extra.MSL_ALTITUDE_ACCURACY");
            if(bundle0.isEmpty()) {
                location0.setExtras(null);
            }
        }
    }

    public static void removeSpeedAccuracy(@NonNull Location location0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            h.b(location0);
            return;
        }
        if(v >= 29) {
            g.b(location0);
            return;
        }
        if(v >= 28) {
            f.b(location0);
            return;
        }
        e.h(location0);
    }

    public static void removeVerticalAccuracy(@NonNull Location location0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            h.c(location0);
            return;
        }
        if(v >= 29) {
            g.c(location0);
            return;
        }
        if(v >= 28) {
            f.c(location0);
            return;
        }
        e.i(location0);
    }

    public static void setBearingAccuracyDegrees(@NonNull Location location0, float f) {
        e.j(location0, f);
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static void setMock(@NonNull Location location0, boolean z) {
        try {
            LocationCompat.f().invoke(location0, Boolean.valueOf(z));
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            NoSuchMethodError noSuchMethodError0 = new NoSuchMethodError();
            noSuchMethodError0.initCause(noSuchMethodException0);
            throw noSuchMethodError0;
        }
        catch(IllegalAccessException illegalAccessException0) {
            IllegalAccessError illegalAccessError0 = new IllegalAccessError();
            illegalAccessError0.initCause(illegalAccessException0);
            throw illegalAccessError0;
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
    }

    public static void setMslAltitudeAccuracyMeters(@NonNull Location location0, @FloatRange(from = 0.0) float f) {
        if(Build.VERSION.SDK_INT >= 34) {
            i.g(location0, f);
            return;
        }
        LocationCompat.e(location0).putFloat("androidx.core.location.extra.MSL_ALTITUDE_ACCURACY", f);
    }

    public static void setMslAltitudeMeters(@NonNull Location location0, double f) {
        if(Build.VERSION.SDK_INT >= 34) {
            i.h(location0, f);
            return;
        }
        LocationCompat.e(location0).putDouble("androidx.core.location.extra.MSL_ALTITUDE", f);
    }

    public static void setSpeedAccuracyMetersPerSecond(@NonNull Location location0, float f) {
        e.k(location0, f);
    }

    public static void setVerticalAccuracyMeters(@NonNull Location location0, float f) {
        e.l(location0, f);
    }
}

