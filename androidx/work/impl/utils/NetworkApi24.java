package androidx.work.impl.utils;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(24)
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"registerDefaultNetworkCallbackCompat", "", "Landroid/net/ConnectivityManager;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "NetworkApi24")
public final class NetworkApi24 {
    @DoNotInline
    public static final void registerDefaultNetworkCallbackCompat(@NotNull ConnectivityManager connectivityManager0, @NotNull ConnectivityManager.NetworkCallback connectivityManager$NetworkCallback0) {
        Intrinsics.checkNotNullParameter(connectivityManager0, "<this>");
        Intrinsics.checkNotNullParameter(connectivityManager$NetworkCallback0, "networkCallback");
        connectivityManager0.registerDefaultNetworkCallback(connectivityManager$NetworkCallback0);
    }
}

