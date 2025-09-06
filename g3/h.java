package g3;

import android.location.Location;
import androidx.annotation.DoNotInline;

public abstract class h {
    @DoNotInline
    public static void a(Location location0) {
        location0.removeBearingAccuracy();
    }

    @DoNotInline
    public static void b(Location location0) {
        location0.removeSpeedAccuracy();
    }

    @DoNotInline
    public static void c(Location location0) {
        location0.removeVerticalAccuracy();
    }
}

