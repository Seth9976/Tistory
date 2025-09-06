package androidx.compose.material3;

import androidx.compose.ui.focus.FocusManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import qd.a;

public final class yi extends SuspendLambda implements Function2 {
    public int o;
    public final boolean p;
    public final FocusManager q;

    public yi(boolean z, FocusManager focusManager0, Continuation continuation0) {
        this.p = z;
        this.q = focusManager0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new yi(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((yi)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(this.p) {
                    this.o = 1;
                    if(DelayKt.delay(100L, this) == object1) {
                        return object1;
                    }
                    FocusManager.clearFocus$default(this.q, false, 1, null);
                    return Unit.INSTANCE;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                FocusManager.clearFocus$default(this.q, false, 1, null);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

