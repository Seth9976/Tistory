package androidx.compose.material3;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

public final class bm extends ContinuationImpl {
    public SnackbarHostState o;
    public SnackbarVisuals p;
    public Mutex q;
    public Object r;
    public final SnackbarHostState s;
    public int t;

    public bm(SnackbarHostState snackbarHostState0, Continuation continuation0) {
        this.s = snackbarHostState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.showSnackbar(null, this);
    }
}

