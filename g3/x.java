package g3;

import android.location.LocationRequest.Builder;
import android.location.LocationRequest;
import androidx.annotation.DoNotInline;
import androidx.core.location.LocationRequestCompat;

public abstract class x {
    @DoNotInline
    public static LocationRequest a(LocationRequestCompat locationRequestCompat0) {
        return new LocationRequest.Builder(locationRequestCompat0.getIntervalMillis()).setQuality(locationRequestCompat0.getQuality()).setMinUpdateIntervalMillis(locationRequestCompat0.getMinUpdateIntervalMillis()).setDurationMillis(locationRequestCompat0.getDurationMillis()).setMaxUpdates(locationRequestCompat0.getMaxUpdates()).setMinUpdateDistanceMeters(locationRequestCompat0.getMinUpdateDistanceMeters()).setMaxUpdateDelayMillis(locationRequestCompat0.getMaxUpdateDelayMillis()).build();
    }
}

