package z;

import androidx.compose.foundation.gestures.PressGestureScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

public final class h1 extends SuspendLambda implements Function3 {
    public final int o;

    public h1(int v, int v1, Continuation continuation0) {
        this.o = v1;
        super(v, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        switch(this.o) {
            case 0: {
                CoroutineScope coroutineScope0 = (CoroutineScope)object0;
                return new h1(3, 0, ((Continuation)object2)).invokeSuspend(Unit.INSTANCE);
            }
            case 1: {
                CoroutineScope coroutineScope1 = (CoroutineScope)object0;
                return new h1(3, 1, ((Continuation)object2)).invokeSuspend(Unit.INSTANCE);
            }
            case 2: {
                CoroutineScope coroutineScope2 = (CoroutineScope)object0;
                return new h1(3, 2, ((Continuation)object2)).invokeSuspend(Unit.INSTANCE);
            }
            case 3: {
                CoroutineScope coroutineScope3 = (CoroutineScope)object0;
                ((Number)object1).floatValue();
                return new h1(3, 3, ((Continuation)object2)).invokeSuspend(Unit.INSTANCE);
            }
            default: {
                PressGestureScope pressGestureScope0 = (PressGestureScope)object0;
                return new h1(3, 4, ((Continuation)object2)).invokeSuspend(Unit.INSTANCE);
            }
        }
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            case 3: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
        }
    }
}

