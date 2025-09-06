package sf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Deferred;
import qd.a;

public final class d {
    public final Deferred[] a;
    public static final AtomicIntegerFieldUpdater b;
    @Volatile
    private volatile int notCompletedCount;

    static {
        d.b = AtomicIntegerFieldUpdater.newUpdater(d.class, "notCompletedCount");
    }

    public d(Deferred[] arr_deferred) {
        this.a = arr_deferred;
        this.notCompletedCount = arr_deferred.length;
    }

    public final Object a(Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        Deferred[] arr_deferred = this.a;
        b[] arr_b = new b[arr_deferred.length];
        for(int v1 = 0; v1 < arr_deferred.length; ++v1) {
            Deferred deferred0 = arr_deferred[v1];
            deferred0.start();
            b b0 = new b(this, cancellableContinuationImpl0);
            b0.e = deferred0.invokeOnCompletion(b0);
            arr_b[v1] = b0;
        }
        c c0 = new c(arr_b);
        for(int v = 0; v < arr_deferred.length; ++v) {
            b b1 = arr_b[v];
            b1.getClass();
            b.g.set(b1, c0);
        }
        if(cancellableContinuationImpl0.isCompleted()) {
            c0.a();
        }
        else {
            cancellableContinuationImpl0.invokeOnCancellation(c0);
        }
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }
}

