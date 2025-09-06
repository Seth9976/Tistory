package androidx.work.impl.utils;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(21)
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0018\u0010\u0000\u001A\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0003\u001A\u0004\u0018\u00010\u0004H\u0001\u001A\u0014\u0010\u0005\u001A\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001A\u00020\bH\u0001\u001A\u0014\u0010\t\u001A\u00020\n*\u00020\u00022\u0006\u0010\u000B\u001A\u00020\fH\u0001¨\u0006\r"}, d2 = {"getNetworkCapabilitiesCompat", "Landroid/net/NetworkCapabilities;", "Landroid/net/ConnectivityManager;", "network", "Landroid/net/Network;", "hasCapabilityCompat", "", "capability", "", "unregisterNetworkCallbackCompat", "", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "NetworkApi21")
public final class NetworkApi21 {
    @DoNotInline
    @Nullable
    public static final NetworkCapabilities getNetworkCapabilitiesCompat(@NotNull ConnectivityManager connectivityManager0, @Nullable Network network0) {
        Intrinsics.checkNotNullParameter(connectivityManager0, "<this>");
        return connectivityManager0.getNetworkCapabilities(network0);
    }

    @DoNotInline
    public static final boolean hasCapabilityCompat(@NotNull NetworkCapabilities networkCapabilities0, int v) {
        Intrinsics.checkNotNullParameter(networkCapabilities0, "<this>");
        return networkCapabilities0.hasCapability(v);
    }

    @DoNotInline
    public static final void unregisterNetworkCallbackCompat(@NotNull ConnectivityManager connectivityManager0, @NotNull ConnectivityManager.NetworkCallback connectivityManager$NetworkCallback0) {
        Intrinsics.checkNotNullParameter(connectivityManager0, "<this>");
        Intrinsics.checkNotNullParameter(connectivityManager$NetworkCallback0, "networkCallback");
        connectivityManager0.unregisterNetworkCallback(connectivityManager$NetworkCallback0);
    }
}

