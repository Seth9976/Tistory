package m0;

import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

public final class t extends SuspendLambda implements Function2 {
    public Object o;
    public final CursorAnimationState p;

    public t(CursorAnimationState cursorAnimationState0, Continuation continuation0) {
        this.p = cursorAnimationState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new t(this.p, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((t)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CoroutineScope coroutineScope0 = (CoroutineScope)this.o;
        Job job0 = (Job)this.p.a.getAndSet(null);
        AtomicReference atomicReference0 = this.p.a;
        Job job1 = BuildersKt.launch$default(coroutineScope0, null, null, new s(job0, this.p, null), 3, null);
        do {
            if(atomicReference0.compareAndSet(null, job1)) {
                return Boxing.boxBoolean(true);
            }
        }
        while(atomicReference0.get() == null);
        return Boxing.boxBoolean(false);
    }
}

