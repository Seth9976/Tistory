package androidx.room;

import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class d1 implements Runnable {
    public final CoroutineContext a;
    public final CancellableContinuationImpl b;
    public final RoomDatabase c;
    public final Function2 d;

    public d1(CoroutineContext coroutineContext0, CancellableContinuationImpl cancellableContinuationImpl0, RoomDatabase roomDatabase0, Function2 function20) {
        this.a = coroutineContext0;
        this.b = cancellableContinuationImpl0;
        this.c = roomDatabase0;
        this.d = function20;
    }

    @Override
    public final void run() {
        CancellableContinuationImpl cancellableContinuationImpl0;
        try {
            cancellableContinuationImpl0 = this.b;
            BuildersKt.runBlocking(this.a.minusKey(ContinuationInterceptor.Key), new c1(this.c, cancellableContinuationImpl0, this.d, null));
        }
        catch(Throwable throwable0) {
            cancellableContinuationImpl0.cancel(throwable0);
        }
    }
}

