package z;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import qd.a;

public final class x extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final ContentInViewNode q;
    public final UpdatableAnimationState r;
    public final BringIntoViewSpec s;

    public x(ContentInViewNode contentInViewNode0, UpdatableAnimationState updatableAnimationState0, BringIntoViewSpec bringIntoViewSpec0, Continuation continuation0) {
        this.q = contentInViewNode0;
        this.r = updatableAnimationState0;
        this.s = bringIntoViewSpec0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new x(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((x)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        ContentInViewNode contentInViewNode0 = this.q;
        CancellationException cancellationException0 = null;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Job job0 = JobKt.getJob(((CoroutineScope)this.p).getCoroutineContext());
                try {
                    try {
                        contentInViewNode0.w = true;
                        w w0 = new w(this.r, this.q, this.s, job0, null);
                        this.o = 1;
                        if(contentInViewNode0.o.scroll(MutatePriority.Default, w0, this) == object1) {
                            return object1;
                        label_12:
                            ResultKt.throwOnFailure(object0);
                        }
                        contentInViewNode0.r.resumeAndRemoveAll();
                        goto label_23;
                    }
                    catch(CancellationException cancellationException1) {
                        cancellationException0 = cancellationException1;
                        throw cancellationException0;
                    }
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                goto label_12;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        contentInViewNode0.w = false;
        contentInViewNode0.r.cancelAndRemoveAll(cancellationException0);
        contentInViewNode0.u = false;
        throw throwable0;
    label_23:
        contentInViewNode0.w = false;
        contentInViewNode0.r.cancelAndRemoveAll(null);
        contentInViewNode0.u = false;
        return Unit.INSTANCE;
    }
}

