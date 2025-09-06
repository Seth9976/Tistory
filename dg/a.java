package dg;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.sync.MutexImpl;

public final class a extends Lambda implements Function1 {
    public final int w;
    public final MutexImpl x;
    public final b y;

    public a(MutexImpl mutexImpl0, b b0, int v) {
        this.w = v;
        this.x = mutexImpl0;
        this.y = b0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Throwable throwable0 = (Throwable)object0;
            MutexImpl.access$getOwner$FU$p().set(this.x, this.y.b);
            this.x.unlock(this.y.b);
            return Unit.INSTANCE;
        }
        Throwable throwable1 = (Throwable)object0;
        this.x.unlock(this.y.b);
        return Unit.INSTANCE;
    }
}

