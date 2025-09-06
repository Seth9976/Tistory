package g3;

import android.location.Location;
import androidx.annotation.DoNotInline;

public abstract class i {
    @DoNotInline
    public static float a(Location location0) {
        return location0.getMslAltitudeAccuracyMeters();
    }

    @DoNotInline
    public static double b(Location location0) {
        return location0.getMslAltitudeMeters();
    }

    @DoNotInline
    public static boolean c(Location location0) {
        return location0.hasMslAltitude();
    }

    @DoNotInline
    public static boolean d(Location location0) {
        return location0.hasMslAltitudeAccuracy();
    }

    @DoNotInline
    public static void e(Location location0) {
        location0.removeMslAltitude();
    }

    @DoNotInline
    public static void f(Location location0) {
        location0.removeMslAltitudeAccuracy();
    }

    @DoNotInline
    public static void g(Location location0, float f) {
        location0.setMslAltitudeAccuracyMeters(f);
    }

    @DoNotInline
    public static void h(Location location0, double f) {
        location0.setMslAltitudeMeters(f);
    }
}

