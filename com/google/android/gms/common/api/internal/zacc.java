package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

public final class zacc extends zap {
    public TaskCompletionSource b;

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onDestroy() {
        super.onDestroy();
        this.b.trySetException(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    public static zacc zaa(@NonNull Activity activity0) {
        LifecycleFragment lifecycleFragment0 = LifecycleCallback.getFragment(activity0);
        zacc zacc0 = (zacc)lifecycleFragment0.getCallbackOrNull("GmsAvailabilityHelper", zacc.class);
        if(zacc0 != null) {
            if(zacc0.b.getTask().isComplete()) {
                zacc0.b = new TaskCompletionSource();
            }
            return zacc0;
        }
        zacc zacc1 = new zacc(lifecycleFragment0, GoogleApiAvailability.getInstance());  // 初始化器: Lcom/google/android/gms/common/api/internal/zap;-><init>(Lcom/google/android/gms/common/api/internal/LifecycleFragment;Lcom/google/android/gms/common/GoogleApiAvailability;)V
        zacc1.b = new TaskCompletionSource();
        zacc1.mLifecycleFragment.addCallback("GmsAvailabilityHelper", zacc1);
        return zacc1;
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void zab(ConnectionResult connectionResult0, int v) {
        String s = connectionResult0.getErrorMessage();
        if(s == null) {
            s = "Error connecting to Google Play services";
        }
        this.b.setException(new ApiException(new Status(connectionResult0, s, connectionResult0.getErrorCode())));
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void zac() {
        Activity activity0 = this.mLifecycleFragment.getLifecycleActivity();
        if(activity0 == null) {
            this.b.trySetException(new ApiException(new Status(8)));
            return;
        }
        int v = this.zac.isGooglePlayServicesAvailable(activity0);
        if(v == 0) {
            this.b.trySetResult(null);
            return;
        }
        if(!this.b.getTask().isComplete()) {
            this.zah(new ConnectionResult(v, null), 0);
        }
    }

    public final Task zad() {
        return this.b.getTask();
    }
}

