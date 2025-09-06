package g3;

import android.location.Location;
import androidx.annotation.DoNotInline;

public abstract class g {
    @DoNotInline
    public static void a(Location location0) {
        if(!location0.hasBearingAccuracy()) {
            return;
        }
        double f = location0.getElapsedRealtimeUncertaintyNanos();
        f.a(location0);
        location0.setElapsedRealtimeUncertaintyNanos(f);
    }

    @DoNotInline
    public static void b(Location location0) {
        if(!location0.hasSpeedAccuracy()) {
            return;
        }
        double f = location0.getElapsedRealtimeUncertaintyNanos();
        f.b(location0);
        location0.setElapsedRealtimeUncertaintyNanos(f);
    }

    @DoNotInline
    public static void c(Location location0) {
        if(!location0.hasVerticalAccuracy()) {
            return;
        }
        double f = location0.getElapsedRealtimeUncertaintyNanos();
        f.c(location0);
        location0.setElapsedRealtimeUncertaintyNanos(f);
    }
}

