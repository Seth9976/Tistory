package com.kakao.android.base.network;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00070\r2\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00070\rH&R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0005¨\u0006\u000F"}, d2 = {"Lcom/kakao/android/base/network/NetworkCheckInterface;", "", "isNetworkConnected", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "initNetworkCheck", "", "context", "Landroid/content/Context;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onConnected", "Lkotlin/Function0;", "onUnconnected", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface NetworkCheckInterface {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void initNetworkCheck$default(NetworkCheckInterface networkCheckInterface0, Context context0, LifecycleOwner lifecycleOwner0, Function0 function00, Function0 function01, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initNetworkCheck");
            }
            if((v & 4) != 0) {
                function00 = a.w;
            }
            if((v & 8) != 0) {
                function01 = b.w;
            }
            networkCheckInterface0.initNetworkCheck(context0, lifecycleOwner0, function00, function01);
        }
    }

    void initNetworkCheck(@NotNull Context arg1, @NotNull LifecycleOwner arg2, @NotNull Function0 arg3, @NotNull Function0 arg4);

    @NotNull
    LiveData isNetworkConnected();
}

