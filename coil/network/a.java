package coil.network;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest.Builder;
import kotlin.jvm.internal.Intrinsics;

public final class a implements NetworkObserver {
    public final ConnectivityManager a;
    public final Listener b;
    public final RealNetworkObserver.networkCallback.1 c;

    public a(ConnectivityManager connectivityManager0, Listener networkObserver$Listener0) {
        this.a = connectivityManager0;
        this.b = networkObserver$Listener0;
        RealNetworkObserver.networkCallback.1 realNetworkObserver$networkCallback$10 = new RealNetworkObserver.networkCallback.1(this);
        this.c = realNetworkObserver$networkCallback$10;
        connectivityManager0.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), realNetworkObserver$networkCallback$10);
    }

    public static final void a(a a0, Network network0, boolean z) {
        boolean z2;
        Network[] arr_network = a0.a.getAllNetworks();
        boolean z1 = false;
        for(int v = 0; v < arr_network.length; ++v) {
            Network network1 = arr_network[v];
            if(Intrinsics.areEqual(network1, network0)) {
                z2 = z;
            }
            else {
                NetworkCapabilities networkCapabilities0 = a0.a.getNetworkCapabilities(network1);
                z2 = networkCapabilities0 != null && networkCapabilities0.hasCapability(12);
            }
            if(z2) {
                z1 = true;
                break;
            }
        }
        a0.b.onConnectivityChange(z1);
    }

    @Override  // coil.network.NetworkObserver
    public final boolean isOnline() {
        ConnectivityManager connectivityManager0 = this.a;
        Network[] arr_network = connectivityManager0.getAllNetworks();
        for(int v = 0; v < arr_network.length; ++v) {
            NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(arr_network[v]);
            if(networkCapabilities0 != null && networkCapabilities0.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override  // coil.network.NetworkObserver
    public final void shutdown() {
        this.a.unregisterNetworkCallback(this.c);
    }
}

