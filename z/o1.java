package z;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import qd.a;

public final class o1 extends RestrictedSuspendLambda implements Function2 {
    public int p;
    public Object q;
    public final CoroutineContext r;
    public final Function2 s;

    public o1(CoroutineContext coroutineContext0, Function2 function20, Continuation continuation0) {
        this.r = coroutineContext0;
        this.s = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new o1(this.r, this.s, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((o1)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        AwaitPointerEventScope awaitPointerEventScope1;
        AwaitPointerEventScope awaitPointerEventScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        CoroutineContext coroutineContext0 = this.r;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                goto label_16;
            }
            case 1: {
                awaitPointerEventScope1 = (AwaitPointerEventScope)this.q;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_27;
                }
                catch(CancellationException cancellationException0) {
                    goto label_32;
                }
            }
            case 2: {
                awaitPointerEventScope1 = (AwaitPointerEventScope)this.q;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_32;
                }
            }
            case 3: {
                awaitPointerEventScope1 = (AwaitPointerEventScope)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            while(true) {
                awaitPointerEventScope0 = awaitPointerEventScope1;
            label_16:
                if(!JobKt.isActive(coroutineContext0)) {
                    return Unit.INSTANCE;
                }
                try {
                    this.q = awaitPointerEventScope0;
                    this.p = 1;
                    if(this.s.invoke(awaitPointerEventScope0, this) == object1) {
                        return object1;
                    }
                }
                catch(CancellationException cancellationException1) {
                    awaitPointerEventScope1 = awaitPointerEventScope0;
                    cancellationException0 = cancellationException1;
                    break;
                }
                awaitPointerEventScope1 = awaitPointerEventScope0;
                try {
                label_27:
                    this.q = awaitPointerEventScope1;
                    this.p = 2;
                    if(ForEachGestureKt.awaitAllPointersUp(awaitPointerEventScope1, this) != object1) {
                        continue;
                    }
                    return object1;
                }
                catch(CancellationException cancellationException0) {
                }
                break;
            }
        label_32:
            if(!JobKt.isActive(coroutineContext0)) {
                throw cancellationException0;
            }
            this.q = awaitPointerEventScope1;
            this.p = 3;
        }
        while(ForEachGestureKt.awaitAllPointersUp(awaitPointerEventScope1, this) != object1);
        return object1;
    }
}

