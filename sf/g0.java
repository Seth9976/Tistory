package sf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.intrinsics.CancellableKt;

public final class g0 extends o {
    public final Continuation d;

    public g0(CoroutineContext coroutineContext0, Function2 function20) {
        super(coroutineContext0, true, false);
        this.d = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function20, this, this);
    }

    @Override  // kotlinx.coroutines.JobSupport
    public final void onStart() {
        CancellableKt.startCoroutineCancellable(this.d, this);
    }
}

