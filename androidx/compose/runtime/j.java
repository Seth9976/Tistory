package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import qd.a;
import y0.g0;

public final class j extends SuspendLambda implements Function2 {
    public ObserverHandle o;
    public int p;
    public Object q;
    public final Recomposer r;
    public final Function3 s;
    public final MonotonicFrameClock t;

    public j(Recomposer recomposer0, Function3 function30, MonotonicFrameClock monotonicFrameClock0, Continuation continuation0) {
        this.r = recomposer0;
        this.s = function30;
        this.t = monotonicFrameClock0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new j(this.r, this.s, this.t, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        List list0;
        Throwable throwable1;
        ObserverHandle observerHandle1;
        Job job0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                job0 = JobKt.getJob(((CoroutineScope)this.q).getCoroutineContext());
                Recomposer.access$registerRunnerJob(this.r, job0);
                i i0 = new i(this.r);
                ObserverHandle observerHandle0 = Snapshot.Companion.registerApplyObserver(i0);
                Companion.access$addRunning(Recomposer.Companion, this.r.x);
                try {
                    synchronized(this.r.c) {
                        list0 = this.r.e();
                    }
                    int v1 = list0.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        ((ControlledComposition)list0.get(v2)).invalidateAll();
                    }
                    g0 g00 = new g0(this.s, this.t, null);
                    this.q = job0;
                    this.o = observerHandle0;
                    this.p = 1;
                    if(CoroutineScopeKt.coroutineScope(g00, this) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    observerHandle1 = observerHandle0;
                    throwable1 = throwable0;
                    goto label_40;
                }
                observerHandle1 = observerHandle0;
                break;
            }
            case 1: {
                observerHandle1 = this.o;
                job0 = (Job)this.q;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable1) {
                }
            label_40:
                observerHandle1.dispose();
                Object object3 = this.r.c;
                Recomposer recomposer0 = this.r;
                synchronized(object3) {
                    if(recomposer0.d == job0) {
                        recomposer0.d = null;
                    }
                    recomposer0.b();
                }
                Companion.access$removeRunning(Recomposer.Companion, this.r.x);
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        observerHandle1.dispose();
        Object object4 = this.r.c;
        Recomposer recomposer1 = this.r;
        synchronized(object4) {
            if(recomposer1.d == job0) {
                recomposer1.d = null;
            }
            recomposer1.b();
        }
        Companion.access$removeRunning(Recomposer.Companion, this.r.x);
        return Unit.INSTANCE;
    }
}

