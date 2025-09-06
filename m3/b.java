package m3;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import kotlin.coroutines.Continuation;

public final class b extends AtomicBoolean implements Consumer {
    public final Continuation a;

    public b(Continuation continuation0) {
        super(false);
        this.a = continuation0;
    }

    @Override
    public final void accept(Object object0) {
        if(this.compareAndSet(false, true)) {
            this.a.resumeWith(object0);
        }
    }

    @Override
    public final String toString() {
        return "ContinuationConsumer(resultAccepted = " + this.get() + ')';
    }
}

