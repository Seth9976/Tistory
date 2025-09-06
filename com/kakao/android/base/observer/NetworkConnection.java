package com.kakao.android.base.observer;

import android.content.Context;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.lifecycle.LiveData;
import com.kakao.android.base.utils.Logger;
import f9.a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000BB\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\t¨\u0006\f"}, d2 = {"Lcom/kakao/android/base/observer/NetworkConnection;", "Landroidx/lifecycle/LiveData;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "onActive", "()V", "onInactive", "f9/a", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class NetworkConnection extends LiveData {
    public final ConnectivityManager o;
    public final com.kakao.android.base.observer.NetworkConnection.networkCallback.1 p;

    public NetworkConnection(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        Object object0 = context0.getSystemService("connectivity");
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.o = (ConnectivityManager)object0;
        this.p = new ConnectivityManager.NetworkCallback() {
            @Override  // android.net.ConnectivityManager$NetworkCallback
            public void onAvailable(@NotNull Network network0) {
                Intrinsics.checkNotNullParameter(network0, "network");
                Logger.INSTANCE.log("onAvailable()");
                boolean z = NetworkConnection.access$checkNetworkType(this.a) != a.a;
                NetworkConnection.access$postValue(this.a, Boolean.valueOf(z));
            }

            @Override  // android.net.ConnectivityManager$NetworkCallback
            public void onLost(@NotNull Network network0) {
                Intrinsics.checkNotNullParameter(network0, "network");
                Logger.INSTANCE.log("onLost()");
                this.a.postValue(Boolean.FALSE);
            }
        };
    }

    public static final a access$checkNetworkType(NetworkConnection networkConnection0) {
        Network network0 = networkConnection0.o.getActiveNetwork();
        NetworkCapabilities networkCapabilities0 = networkConnection0.o.getNetworkCapabilities(network0);
        if(networkCapabilities0 != null) {
            if(networkCapabilities0.hasTransport(1)) {
                return a.b;
            }
            return networkCapabilities0.hasTransport(0) ? a.c : a.d;
        }
        return a.a;
    }

    @Override  // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        NetworkInfo networkInfo0 = this.o.getActiveNetworkInfo();
        boolean z = networkInfo0 == null ? false : networkInfo0.isConnected();
        Logger.INSTANCE.log("onActive() : " + z);
        this.postValue(Boolean.valueOf(z));
        this.o.registerDefaultNetworkCallback(this.p);
    }

    @Override  // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        Logger.INSTANCE.log("onInactive()");
        this.o.unregisterNetworkCallback(this.p);
    }
}

