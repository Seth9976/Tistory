package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.net.ConnectivityManagerCompat;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.NetworkApi21;
import androidx.work.impl.utils.NetworkApi23;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\b\u001A%\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0018\u0010\n\u001A\u00020\t*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000B\"\u001E\u0010\u0010\u001A\u00020\u0005*\u00020\b8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u000E\u0010\u000F\u001A\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "NetworkStateTracker", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroid/net/ConnectivityManager;", "", "isActiveNetworkValidated", "(Landroid/net/ConnectivityManager;)Z", "getActiveNetworkState", "(Landroid/net/ConnectivityManager;)Landroidx/work/impl/constraints/NetworkState;", "getActiveNetworkState$annotations", "(Landroid/net/ConnectivityManager;)V", "activeNetworkState", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class NetworkStateTrackerKt {
    public static final String a;

    // 去混淆评级： 低(20)
    static {
        Intrinsics.checkNotNullExpressionValue("WM-NetworkStateTracker", "tagWithPrefix(\"NetworkStateTracker\")");
        NetworkStateTrackerKt.a = "WM-NetworkStateTracker";
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final ConstraintTracker NetworkStateTracker(@NotNull Context context0, @NotNull TaskExecutor taskExecutor0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(taskExecutor0, "taskExecutor");
        return new NetworkStateTracker24(context0, taskExecutor0);
    }

    public static final String access$getTAG$p() [...] // 潜在的解密器

    @NotNull
    public static final NetworkState getActiveNetworkState(@NotNull ConnectivityManager connectivityManager0) {
        Intrinsics.checkNotNullParameter(connectivityManager0, "<this>");
        NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
        boolean z = false;
        boolean z1 = networkInfo0 != null && networkInfo0.isConnected();
        boolean z2 = NetworkStateTrackerKt.isActiveNetworkValidated(connectivityManager0);
        boolean z3 = ConnectivityManagerCompat.isActiveNetworkMetered(connectivityManager0);
        if(networkInfo0 != null && !networkInfo0.isRoaming()) {
            z = true;
        }
        return new NetworkState(z1, z2, z3, z);
    }

    public static void getActiveNetworkState$annotations(ConnectivityManager connectivityManager0) {
    }

    public static final boolean isActiveNetworkValidated(@NotNull ConnectivityManager connectivityManager0) {
        Intrinsics.checkNotNullParameter(connectivityManager0, "<this>");
        try {
            NetworkCapabilities networkCapabilities0 = NetworkApi21.getNetworkCapabilitiesCompat(connectivityManager0, NetworkApi23.getActiveNetworkCompat(connectivityManager0));
            if(networkCapabilities0 != null) {
                return NetworkApi21.hasCapabilityCompat(networkCapabilities0, 16);
            }
        }
        catch(SecurityException securityException0) {
            Logger.get().error("WM-NetworkStateTracker", "Unable to validate active network", securityException0);
        }
        return false;
    }
}

