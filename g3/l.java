package g3;

import android.location.LocationManager;
import androidx.annotation.DoNotInline;

public abstract class l {
    @DoNotInline
    public static String a(LocationManager locationManager0) {
        return locationManager0.getGnssHardwareModelName();
    }

    @DoNotInline
    public static int b(LocationManager locationManager0) {
        return locationManager0.getGnssYearOfHardware();
    }

    @DoNotInline
    public static boolean c(LocationManager locationManager0) {
        return locationManager0.isLocationEnabled();
    }
}

