package z;

import androidx.compose.foundation.gestures.TransformEvent.TransformStopped;
import androidx.compose.foundation.gestures.TransformableKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class u3 extends RestrictedSuspendLambda implements Function2 {
    public int p;
    public Object q;
    public final x3 r;
    public final CoroutineScope s;

    public u3(x3 x30, CoroutineScope coroutineScope0, Continuation continuation0) {
        this.r = x30;
        this.s = coroutineScope0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new u3(this.r, this.s, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((u3)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        x3 x30 = this.r;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AwaitPointerEventScope awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                try {
                    try {
                        this.p = 1;
                        if(TransformableKt.access$detectZoom(awaitPointerEventScope0, x30.r, x30.u, x30.t, this) == object1) {
                            return object1;
                        label_9:
                            ResultKt.throwOnFailure(object0);
                        }
                    }
                    catch(CancellationException cancellationException0) {
                        if(!CoroutineScopeKt.isActive(this.s)) {
                            throw cancellationException0;
                        }
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    x30.u.trySend-JP2dKIU(TransformEvent.TransformStopped.INSTANCE);
                    throw throwable0;
                }
            }
            case 1: {
                goto label_9;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        x30.u.trySend-JP2dKIU(TransformEvent.TransformStopped.INSTANCE);
        return Unit.INSTANCE;
    }
}

