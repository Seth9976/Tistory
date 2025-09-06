package androidx.datastore.core;

import java.io.FileOutputStream;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class j extends ContinuationImpl {
    public FileOutputStream o;
    public long p;
    public Object q;
    public final Companion r;
    public int s;

    public j(Companion multiProcessCoordinator$Companion0, Continuation continuation0) {
        this.r = multiProcessCoordinator$Companion0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return Companion.access$getExclusiveFileLockWithRetryIfDeadlock(this.r, null, this);
    }
}

