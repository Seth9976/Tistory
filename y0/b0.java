package y0;

import androidx.compose.runtime.RecomposerKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

public final class b0 {
    public Object a;

    public final Continuation a() {
        Object object0 = this.a;
        if(object0 instanceof Continuation) {
            this.a = RecomposerKt.b;
            return (Continuation)object0;
        }
        if((Intrinsics.areEqual(object0, RecomposerKt.a) ? true : Intrinsics.areEqual(object0, RecomposerKt.b))) {
            return null;
        }
        if(object0 != null) {
            throw new IllegalStateException(("invalid pendingFrameContinuation " + object0).toString());
        }
        this.a = RecomposerKt.a;
        return null;
    }
}

