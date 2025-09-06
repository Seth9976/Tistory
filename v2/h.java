package v2;

import androidx.compose.ui.platform.InfiniteAnimationPolicyKt;
import androidx.compose.ui.window.PopupLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class h extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final PopupLayout q;

    public h(PopupLayout popupLayout0, Continuation continuation0) {
        this.q = popupLayout0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new h(this.q, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((h)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        CoroutineScope coroutineScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                coroutineScope0 = (CoroutineScope)this.p;
                goto label_9;
            }
            case 1: {
                coroutineScope0 = (CoroutineScope)this.p;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            this.q.pollForLocationOnScreenChange();
        label_9:
            if(!CoroutineScopeKt.isActive(coroutineScope0)) {
                break;
            }
            this.p = coroutineScope0;
            this.o = 1;
            if(InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(b.y, this) != object1) {
                continue;
            }
            return object1;
        }
        return Unit.INSTANCE;
    }
}

