package androidx.compose.runtime;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import md.b;

public final class f extends Lambda implements Function1 {
    public final Recomposer w;
    public final Throwable x;

    public f(Recomposer recomposer0, Throwable throwable0) {
        this.w = recomposer0;
        this.x = throwable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        Object object1 = this.w.c;
        Recomposer recomposer0 = this.w;
        Throwable throwable1 = this.x;
        synchronized(object1) {
            if(throwable1 == null) {
                throwable1 = null;
            }
            else if(throwable0 != null) {
                if(throwable0 instanceof CancellationException) {
                    throwable0 = null;
                }
                if(throwable0 != null) {
                    b.addSuppressed(throwable1, throwable0);
                }
            }
            recomposer0.e = throwable1;
            recomposer0.u.setValue(State.ShutDown);
            return Unit.INSTANCE;
        }
    }
}

