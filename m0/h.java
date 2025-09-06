package m0;

import androidx.activity.d0;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import qd.a;

public final class h extends SuspendLambda implements Function2 {
    public int o;
    public final MutableSharedFlow p;
    public final ComposeInputMethodManager q;

    public h(MutableSharedFlow mutableSharedFlow0, ComposeInputMethodManager composeInputMethodManager0, Continuation continuation0) {
        this.p = mutableSharedFlow0;
        this.q = composeInputMethodManager0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new h(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((h)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                if(MonotonicFrameClockKt.withFrameMillis(m0.a.y, this) == object1) {
                    return object1;
                }
                goto label_8;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
            label_8:
                d0 d00 = new d0(this.q, 7);
                this.o = 2;
                if(this.p.collect(d00, this) == object1) {
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
        throw new KotlinNothingValueException();
    }
}

