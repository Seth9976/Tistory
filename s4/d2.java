package s4;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class d2 extends Lambda implements Function1 {
    public final int w;
    public final CancellableContinuationImpl x;

    public d2(CancellableContinuationImpl cancellableContinuationImpl0, int v) {
        this.w = v;
        this.x = cancellableContinuationImpl0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = this.x;
        if(this.w != 0) {
            Throwable throwable0 = (Throwable)object0;
            cancellableContinuationImpl0.resumeWith(Unit.INSTANCE);
            return Unit.INSTANCE;
        }
        Throwable throwable1 = (Throwable)object0;
        cancellableContinuationImpl0.resumeWith(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}

