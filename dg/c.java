package dg;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.selects.SelectInstanceInternal;
import kotlinx.coroutines.sync.MutexImpl;

public final class c implements SelectInstanceInternal {
    public final SelectInstanceInternal a;
    public final Object b;
    public final MutexImpl c;

    public c(MutexImpl mutexImpl0, SelectInstanceInternal selectInstanceInternal0, Object object0) {
        this.c = mutexImpl0;
        this.a = selectInstanceInternal0;
        this.b = object0;
    }

    @Override  // kotlinx.coroutines.selects.SelectInstance
    public final void disposeOnCompletion(DisposableHandle disposableHandle0) {
        this.a.disposeOnCompletion(disposableHandle0);
    }

    @Override  // kotlinx.coroutines.selects.SelectInstance
    public final CoroutineContext getContext() {
        return this.a.getContext();
    }

    @Override  // kotlinx.coroutines.Waiter
    public final void invokeOnCancellation(Segment segment0, int v) {
        this.a.invokeOnCancellation(segment0, v);
    }

    @Override  // kotlinx.coroutines.selects.SelectInstance
    public final void selectInRegistrationPhase(Object object0) {
        MutexImpl.access$getOwner$FU$p().set(this.c, this.b);
        this.a.selectInRegistrationPhase(object0);
    }

    @Override  // kotlinx.coroutines.selects.SelectInstance
    public final boolean trySelect(Object object0, Object object1) {
        boolean z = this.a.trySelect(object0, object1);
        if(z) {
            MutexImpl.access$getOwner$FU$p().set(this.c, this.b);
        }
        return z;
    }
}

