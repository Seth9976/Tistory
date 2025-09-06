package sf;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobNode;
import org.jetbrains.annotations.Nullable;

public final class b extends JobNode {
    @Volatile
    @Nullable
    private volatile Object _disposer;
    public final CancellableContinuationImpl d;
    public DisposableHandle e;
    public final d f;
    public static final AtomicReferenceFieldUpdater g;

    static {
        b.g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_disposer");
    }

    public b(d d0, CancellableContinuationImpl cancellableContinuationImpl0) {
        this.f = d0;
        super();
        this.d = cancellableContinuationImpl0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.invoke(((Throwable)object0));
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.CompletionHandlerBase
    public final void invoke(Throwable throwable0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = this.d;
        if(throwable0 == null) {
            d d0 = this.f;
            if(d.b.decrementAndGet(d0) == 0) {
                Deferred[] arr_deferred = d0.a;
                ArrayList arrayList0 = new ArrayList(arr_deferred.length);
                for(int v = 0; v < arr_deferred.length; ++v) {
                    arrayList0.add(arr_deferred[v].getCompleted());
                }
                cancellableContinuationImpl0.resumeWith(arrayList0);
            }
        }
        else {
            Object object0 = cancellableContinuationImpl0.tryResumeWithException(throwable0);
            if(object0 != null) {
                cancellableContinuationImpl0.completeResume(object0);
                c c0 = (c)b.g.get(this);
                if(c0 != null) {
                    c0.a();
                }
            }
        }
    }
}

