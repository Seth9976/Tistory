package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.NetworkApi21;
import androidx.work.impl.utils.NetworkApi24;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(24)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\r¨\u0006\u000F"}, d2 = {"Landroidx/work/impl/constraints/trackers/NetworkStateTracker24;", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "Landroid/content/Context;", "context", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "readSystemState", "()Landroidx/work/impl/constraints/NetworkState;", "", "startTracking", "()V", "stopTracking", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NetworkStateTracker24 extends ConstraintTracker {
    public final ConnectivityManager f;
    public final androidx.work.impl.constraints.trackers.NetworkStateTracker24.networkCallback.1 g;

    public NetworkStateTracker24(@NotNull Context context0, @NotNull TaskExecutor taskExecutor0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(taskExecutor0, "taskExecutor");
        super(context0, taskExecutor0);
        Object object0 = this.getAppContext().getSystemService("connectivity");
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager)object0;
        this.g = new ConnectivityManager.NetworkCallback() {
            @Override  // android.net.ConnectivityManager$NetworkCallback
            public void onCapabilitiesChanged(@NotNull Network network0, @NotNull NetworkCapabilities networkCapabilities0) {
                Intrinsics.checkNotNullParameter(network0, "network");
                Intrinsics.checkNotNullParameter(networkCapabilities0, "capabilities");
                Logger.get().debug("WM-NetworkStateTracker", "Network capabilities changed: " + networkCapabilities0);
                NetworkState networkState0 = NetworkStateTrackerKt.getActiveNetworkState(this.a.f);
                this.a.setState(networkState0);
            }

            @Override  // android.net.ConnectivityManager$NetworkCallback
            public void onLost(@NotNull Network network0) {
                Intrinsics.checkNotNullParameter(network0, "network");
                Logger.get().debug("WM-NetworkStateTracker", "Network connection lost");
                NetworkState networkState0 = NetworkStateTrackerKt.getActiveNetworkState(NetworkStateTracker24.access$getConnectivityManager$p(this.a));
                this.a.setState(networkState0);
            }
        };
    }

    @NotNull
    public NetworkState readSystemState() {
        return NetworkStateTrackerKt.getActiveNetworkState(this.f);
    }

    @Override  // androidx.work.impl.constraints.trackers.ConstraintTracker
    public Object readSystemState() {
        return this.readSystemState();
    }

    @Override  // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        try {
            Logger.get().debug("WM-NetworkStateTracker", "Registering network callback");
            NetworkApi24.registerDefaultNetworkCallbackCompat(this.f, this.g);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            Logger.get().error("WM-NetworkStateTracker", "Received exception while registering network callback", illegalArgumentException0);
        }
        catch(SecurityException securityException0) {
            Logger.get().error("WM-NetworkStateTracker", "Received exception while registering network callback", securityException0);
        }
    }

    @Override  // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        try {
            Logger.get().debug("WM-NetworkStateTracker", "Unregistering network callback");
            NetworkApi21.unregisterNetworkCallbackCompat(this.f, this.g);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            Logger.get().error("WM-NetworkStateTracker", "Received exception while unregistering network callback", illegalArgumentException0);
        }
        catch(SecurityException securityException0) {
            Logger.get().error("WM-NetworkStateTracker", "Received exception while unregistering network callback", securityException0);
        }
    }
}

