package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.ExceptionsKt;

public final class e extends Lambda implements Function0 {
    public final Recomposer w;

    public e(Recomposer recomposer0) {
        this.w = recomposer0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object object0 = this.w.c;
        Recomposer recomposer0 = this.w;
        synchronized(object0) {
            CancellableContinuation cancellableContinuation0 = recomposer0.b();
            if(((State)recomposer0.u.getValue()).compareTo(State.ShuttingDown) > 0) {
                if(cancellableContinuation0 != null) {
                    cancellableContinuation0.resumeWith(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            }
        }
        throw ExceptionsKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", recomposer0.e);
    }
}

