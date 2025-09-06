package y0;

import android.view.Choreographer.FrameCallback;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class j implements Choreographer.FrameCallback {
    public final CancellableContinuationImpl a;
    public final Function1 b;

    public j(Function1 function10, CancellableContinuationImpl cancellableContinuationImpl0) {
        this.a = cancellableContinuationImpl0;
        this.b = function10;
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        Object object0;
        try {
            object0 = Result.constructor-impl(this.b.invoke(v));
        }
        catch(Throwable throwable0) {
            object0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
        }
        this.a.resumeWith(object0);
    }
}

