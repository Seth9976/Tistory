package m3;

import androidx.core.util.Consumer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

public final class a extends AtomicBoolean implements Consumer {
    public final Continuation a;

    public a(Continuation continuation0) {
        super(false);
        this.a = continuation0;
    }

    @Override  // androidx.core.util.Consumer
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

