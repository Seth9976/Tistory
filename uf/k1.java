package uf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BroadcastChannel;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.intrinsics.CancellableKt;

public final class k1 extends a {
    public final Continuation e;

    public k1(CoroutineContext coroutineContext0, BroadcastChannel broadcastChannel0, Function2 function20) {
        super(coroutineContext0, broadcastChannel0, false);
        this.e = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function20, this, this);
    }

    @Override  // kotlinx.coroutines.JobSupport
    public final void onStart() {
        CancellableKt.startCoroutineCancellable(this.e, this);
    }

    @Override  // kotlinx.coroutines.channels.a
    public final ReceiveChannel openSubscription() {
        ReceiveChannel receiveChannel0 = this.d.openSubscription();
        this.start();
        return receiveChannel0;
    }
}

