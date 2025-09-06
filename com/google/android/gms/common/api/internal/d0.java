package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class d0 extends RegisterListenerMethod {
    public final Builder e;

    public d0(Builder registrationMethods$Builder0, ListenerHolder listenerHolder0, Feature[] arr_feature, boolean z, int v) {
        this.e = registrationMethods$Builder0;
        super(listenerHolder0, arr_feature, z, v);
    }

    @Override  // com.google.android.gms.common.api.internal.RegisterListenerMethod
    public final void registerListener(AnyClient api$AnyClient0, TaskCompletionSource taskCompletionSource0) {
        this.e.a.accept(api$AnyClient0, taskCompletionSource0);
    }
}

