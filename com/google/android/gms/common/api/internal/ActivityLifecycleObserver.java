package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;

@KeepForSdk
public abstract class ActivityLifecycleObserver {
    @NonNull
    @KeepForSdk
    public static final ActivityLifecycleObserver of(@NonNull Activity activity0) {
        a a0;
        synchronized(activity0) {
            LifecycleFragment lifecycleFragment0 = LifecycleCallback.getFragment(activity0);
            a0 = (a)lifecycleFragment0.getCallbackOrNull("LifecycleObserverOnStop", a.class);
            if(a0 == null) {
                a0 = new a(lifecycleFragment0);  // 初始化器: Lcom/google/android/gms/common/api/internal/LifecycleCallback;-><init>(Lcom/google/android/gms/common/api/internal/LifecycleFragment;)V
                a0.a = new ArrayList();
                a0.mLifecycleFragment.addCallback("LifecycleObserverOnStop", a0);
            }
        }
        return new zab(a0);
    }

    @NonNull
    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(@NonNull Runnable arg1);
}

