package androidx.core.net;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import h3.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ConnectivityManagerCompat {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RestrictBackgroundStatus {
    }

    public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
    public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
    public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;

    @SuppressLint({"ReferencesDeprecated"})
    @Nullable
    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static NetworkInfo getNetworkInfoFromBroadcast(@NonNull ConnectivityManager connectivityManager0, @NonNull Intent intent0) {
        NetworkInfo networkInfo0 = (NetworkInfo)intent0.getParcelableExtra("networkInfo");
        return networkInfo0 == null ? null : connectivityManager0.getNetworkInfo(networkInfo0.getType());
    }

    public static int getRestrictBackgroundStatus(@NonNull ConnectivityManager connectivityManager0) {
        return a.a(connectivityManager0);
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static boolean isActiveNetworkMetered(@NonNull ConnectivityManager connectivityManager0) {
        return connectivityManager0.isActiveNetworkMetered();
    }
}

