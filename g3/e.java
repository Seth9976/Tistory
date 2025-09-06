package g3;

import android.location.Location;
import androidx.annotation.DoNotInline;
import androidx.core.location.LocationCompat;

public abstract class e {
    @DoNotInline
    public static float a(Location location0) {
        return location0.getBearingAccuracyDegrees();
    }

    @DoNotInline
    public static float b(Location location0) {
        return location0.getSpeedAccuracyMetersPerSecond();
    }

    @DoNotInline
    public static float c(Location location0) {
        return location0.getVerticalAccuracyMeters();
    }

    @DoNotInline
    public static boolean d(Location location0) {
        return location0.hasBearingAccuracy();
    }

    @DoNotInline
    public static boolean e(Location location0) {
        return location0.hasSpeedAccuracy();
    }

    @DoNotInline
    public static boolean f(Location location0) {
        return location0.hasVerticalAccuracy();
    }

    @DoNotInline
    public static void g(Location location0) {
        try {
            int v = LocationCompat.a().getByte(location0);
            int v1 = LocationCompat.b();
            LocationCompat.a().setByte(location0, ((byte)(v & ~v1)));
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            NoSuchFieldError noSuchFieldError0 = new NoSuchFieldError();
            noSuchFieldError0.initCause(noSuchFieldException0);
            throw noSuchFieldError0;
        }
        catch(IllegalAccessException illegalAccessException0) {
            IllegalAccessError illegalAccessError0 = new IllegalAccessError();
            illegalAccessError0.initCause(illegalAccessException0);
            throw illegalAccessError0;
        }
    }

    @DoNotInline
    public static void h(Location location0) {
        try {
            int v = LocationCompat.a().getByte(location0);
            int v1 = LocationCompat.c();
            LocationCompat.a().setByte(location0, ((byte)(v & ~v1)));
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            NoSuchFieldError noSuchFieldError0 = new NoSuchFieldError();
            noSuchFieldError0.initCause(noSuchFieldException0);
            throw noSuchFieldError0;
        }
        catch(IllegalAccessException illegalAccessException0) {
            IllegalAccessError illegalAccessError0 = new IllegalAccessError();
            illegalAccessError0.initCause(illegalAccessException0);
            throw illegalAccessError0;
        }
    }

    @DoNotInline
    public static void i(Location location0) {
        try {
            int v = LocationCompat.a().getByte(location0);
            int v1 = LocationCompat.d();
            LocationCompat.a().setByte(location0, ((byte)(v & ~v1)));
        }
        catch(NoSuchFieldException | IllegalAccessException noSuchFieldException0) {
            IllegalAccessError illegalAccessError0 = new IllegalAccessError();
            illegalAccessError0.initCause(noSuchFieldException0);
            throw illegalAccessError0;
        }
    }

    @DoNotInline
    public static void j(Location location0, float f) {
        location0.setBearingAccuracyDegrees(f);
    }

    @DoNotInline
    public static void k(Location location0, float f) {
        location0.setSpeedAccuracyMetersPerSecond(f);
    }

    @DoNotInline
    public static void l(Location location0, float f) {
        location0.setVerticalAccuracyMeters(f);
    }
}

