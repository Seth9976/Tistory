package coil.network;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"coil/network/RealNetworkObserver$networkCallback$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "", "onAvailable", "(Landroid/net/Network;)V", "onLost", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RealNetworkObserver.networkCallback.1 extends ConnectivityManager.NetworkCallback {
    public final a a;

    public RealNetworkObserver.networkCallback.1(a a0) {
        this.a = a0;
        super();
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public void onAvailable(@NotNull Network network0) {
        a.a(this.a, network0, true);
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public void onLost(@NotNull Network network0) {
        a.a(this.a, network0, false);
    }
}

