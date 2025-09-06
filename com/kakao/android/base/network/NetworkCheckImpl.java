package com.kakao.android.base.network;

import aa.r;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.k;
import com.kakao.android.base.observer.NetworkConnection;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001A\u00020\t2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rR(\u0010\u0013\u001A\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000F0\u000F0\u000E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/kakao/android/base/network/NetworkCheckImpl;", "Lcom/kakao/android/base/network/NetworkCheckInterface;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Lkotlin/Function0;", "", "onConnected", "onUnconnected", "initNetworkCheck", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "b", "Landroidx/lifecycle/MutableLiveData;", "isNetworkConnected", "()Landroidx/lifecycle/MutableLiveData;", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class NetworkCheckImpl implements NetworkCheckInterface {
    public final MutableLiveData a;
    public final MutableLiveData b;

    public NetworkCheckImpl() {
        MutableLiveData mutableLiveData0 = new MutableLiveData(Boolean.TRUE);
        this.a = mutableLiveData0;
        this.b = mutableLiveData0;
    }

    public static final MutableLiveData access$get_isNetworkConnected$p(NetworkCheckImpl networkCheckImpl0) {
        return networkCheckImpl0.a;
    }

    @Override  // com.kakao.android.base.network.NetworkCheckInterface
    public void initNetworkCheck(@NotNull Context context0, @NotNull LifecycleOwner lifecycleOwner0, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "owner");
        Intrinsics.checkNotNullParameter(function00, "onConnected");
        Intrinsics.checkNotNullParameter(function01, "onUnconnected");
        new NetworkConnection(context0).observe(lifecycleOwner0, new k(new r(this, function00, 6, function01)));
    }

    @Override  // com.kakao.android.base.network.NetworkCheckInterface
    public LiveData isNetworkConnected() {
        return this.isNetworkConnected();
    }

    @NotNull
    public MutableLiveData isNetworkConnected() {
        return this.b;
    }
}

