package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public interface LocationListenerCompat extends LocationListener {
    @Override  // android.location.LocationListener
    default void onFlushComplete(int v) {
    }

    @Override  // android.location.LocationListener
    default void onLocationChanged(@NonNull List list0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.onLocationChanged(((Location)list0.get(v1)));
        }
    }

    @Override  // android.location.LocationListener
    default void onProviderDisabled(@NonNull String s) {
    }

    @Override  // android.location.LocationListener
    default void onProviderEnabled(@NonNull String s) {
    }

    @Override  // android.location.LocationListener
    default void onStatusChanged(@NonNull String s, int v, @Nullable Bundle bundle0) {
    }
}

