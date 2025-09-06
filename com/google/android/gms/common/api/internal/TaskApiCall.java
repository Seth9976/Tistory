package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class TaskApiCall {
    @KeepForSdk
    public static class Builder {
        public RemoteCall a;
        public boolean b;
        public Feature[] c;
        public int d;

        @NonNull
        @KeepForSdk
        public TaskApiCall build() {
            Preconditions.checkArgument(this.a != null, "execute parameter required");
            return new f0(this, this.c, this.b, this.d);
        }

        @NonNull
        @KeepForSdk
        @Deprecated
        public Builder execute(@NonNull BiConsumer biConsumer0) {
            this.a = new zacu(biConsumer0);
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder run(@NonNull RemoteCall remoteCall0) {
            this.a = remoteCall0;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setAutoResolveMissingFeatures(boolean z) {
            this.b = z;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setFeatures(@NonNull Feature[] arr_feature) {
            this.c = arr_feature;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setMethodKey(int v) {
            this.d = v;
            return this;
        }
    }

    public final Feature[] a;
    public final boolean b;
    public final int c;

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.a = null;
        this.b = false;
        this.c = 0;
    }

    @KeepForSdk
    public TaskApiCall(@Nullable Feature[] arr_feature, boolean z, int v) {
        this.a = arr_feature;
        this.b = arr_feature != null && z;
        this.c = v;
    }

    @NonNull
    @KeepForSdk
    public static Builder builder() {
        Builder taskApiCall$Builder0 = new Builder();  // 初始化器: Ljava/lang/Object;-><init>()V
        taskApiCall$Builder0.b = true;
        taskApiCall$Builder0.d = 0;
        return taskApiCall$Builder0;
    }

    @KeepForSdk
    public abstract void doExecute(@NonNull AnyClient arg1, @NonNull TaskCompletionSource arg2) throws RemoteException;

    @KeepForSdk
    public boolean shouldAutoResolveMissingFeatures() {
        return this.b;
    }

    public final int zaa() {
        return this.c;
    }

    @Nullable
    public final Feature[] zab() {
        return this.a;
    }
}

