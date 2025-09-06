package g3;

import android.location.GnssMeasurementsEvent.Callback;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import java.util.concurrent.Executor;

public abstract class n {
    @DoNotInline
    public static boolean a(LocationManager locationManager0, @NonNull String s) {
        return locationManager0.hasProvider(s);
    }

    @DoNotInline
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean b(@NonNull LocationManager locationManager0, @NonNull Executor executor0, @NonNull GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0) {
        return locationManager0.registerGnssMeasurementsCallback(executor0, gnssMeasurementsEvent$Callback0);
    }

    @DoNotInline
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void c(LocationManager locationManager0, @NonNull String s, @NonNull LocationRequest locationRequest0, @NonNull Executor executor0, @NonNull LocationListener locationListener0) {
        locationManager0.requestLocationUpdates(s, locationRequest0, executor0, locationListener0);
    }
}

