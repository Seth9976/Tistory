package x1;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import qd.a;

public final class n extends SuspendLambda implements Function2 {
    public int o;
    public final long p;
    public final p q;

    public n(long v, p p0, Continuation continuation0) {
        this.p = v;
        this.q = p0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new n(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((n)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        long v = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                if(DelayKt.delay(v - 1L, this) == object1) {
                    return object1;
                }
                goto label_9;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
            label_9:
                this.o = 2;
                if(DelayKt.delay(1L, this) == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        CancellableContinuationImpl cancellableContinuationImpl0 = this.q.c;
        if(cancellableContinuationImpl0 != null) {
            cancellableContinuationImpl0.resumeWith(Result.constructor-impl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(v))));
        }
        return Unit.INSTANCE;
    }
}

