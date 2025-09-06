package androidx.core.os;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

public final class e extends AtomicBoolean implements OutcomeReceiver {
    public final Continuation a;

    public e(Continuation continuation0) {
        super(false);
        this.a = continuation0;
    }

    @Override  // android.os.OutcomeReceiver
    public final void onError(Throwable throwable0) {
        if(this.compareAndSet(false, true)) {
            Object object0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
            this.a.resumeWith(object0);
        }
    }

    @Override  // android.os.OutcomeReceiver
    public final void onResult(Object object0) {
        if(this.compareAndSet(false, true)) {
            this.a.resumeWith(object0);
        }
    }

    @Override
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + this.get() + ')';
    }
}

