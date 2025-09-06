package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class e0 extends UnregisterListenerMethod {
    public final Builder b;

    public e0(Builder registrationMethods$Builder0, ListenerKey listenerHolder$ListenerKey0) {
        this.b = registrationMethods$Builder0;
        super(listenerHolder$ListenerKey0);
    }

    @Override  // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final void unregisterListener(AnyClient api$AnyClient0, TaskCompletionSource taskCompletionSource0) {
        this.b.b.accept(api$AnyClient0, taskCompletionSource0);
    }
}

