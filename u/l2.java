package u;

import androidx.compose.foundation.MagnifierNode;
import androidx.compose.foundation.PlatformMagnifier;
import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import qd.a;

public final class l2 extends SuspendLambda implements Function2 {
    public int o;
    public final MagnifierNode p;

    public l2(MagnifierNode magnifierNode0, Continuation continuation0) {
        this.p = magnifierNode0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new l2(this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((l2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        MagnifierNode magnifierNode0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                goto label_12;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                goto label_17;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            PlatformMagnifier platformMagnifier0 = magnifierNode0.z;
            if(platformMagnifier0 != null) {
                platformMagnifier0.updateContent();
            }
            do {
            label_12:
                Channel channel0 = magnifierNode0.E;
                if(channel0 != null) {
                    this.o = 1;
                    if(channel0.receive(this) == object1) {
                        return object1;
                    }
                }
            label_17:
            }
            while(magnifierNode0.z == null);
            this.o = 2;
        }
        while(MonotonicFrameClockKt.withFrameMillis(o.B, this) != object1);
        return object1;
    }
}

