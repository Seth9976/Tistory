package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public class RegistrationMethods {
    @KeepForSdk
    public static class Builder {
        public RemoteCall a;
        public RemoteCall b;
        public Runnable c;
        public ListenerHolder d;
        public Feature[] e;
        public boolean f;
        public int g;

        @NonNull
        @KeepForSdk
        public RegistrationMethods build() {
            boolean z = false;
            Preconditions.checkArgument(this.a != null, "Must set register function");
            Preconditions.checkArgument(this.b != null, "Must set unregister function");
            if(this.d != null) {
                z = true;
            }
            Preconditions.checkArgument(z, "Must set holder");
            ListenerKey listenerHolder$ListenerKey0 = (ListenerKey)Preconditions.checkNotNull(this.d.getListenerKey(), "Key must not be null");
            return new RegistrationMethods(new d0(this, this.d, this.e, this.f, this.g), new e0(this, listenerHolder$ListenerKey0), this.c);
        }

        @NonNull
        @KeepForSdk
        public Builder onConnectionSuspended(@NonNull Runnable runnable0) {
            this.c = runnable0;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder register(@NonNull RemoteCall remoteCall0) {
            this.a = remoteCall0;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setAutoResolveMissingFeatures(boolean z) {
            this.f = z;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setFeatures(@NonNull Feature[] arr_feature) {
            this.e = arr_feature;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setMethodKey(int v) {
            this.g = v;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder unregister(@NonNull RemoteCall remoteCall0) {
            this.b = remoteCall0;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder withHolder(@NonNull ListenerHolder listenerHolder0) {
            this.d = listenerHolder0;
            return this;
        }
    }

    @NonNull
    @KeepForSdk
    public final RegisterListenerMethod register;
    @NonNull
    public final UnregisterListenerMethod zaa;
    @NonNull
    public final Runnable zab;

    public RegistrationMethods(d0 d00, e0 e00, Runnable runnable0) {
        this.register = d00;
        this.zaa = e00;
        this.zab = runnable0;
    }

    @NonNull
    @KeepForSdk
    public static Builder builder() {
        Builder registrationMethods$Builder0 = new Builder();  // 初始化器: Ljava/lang/Object;-><init>()V
        registrationMethods$Builder0.c = zacj.zaa;
        registrationMethods$Builder0.f = true;
        return registrationMethods$Builder0;
    }
}

