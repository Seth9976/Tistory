package t;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.TransitionState;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import qd.a;

public final class g0 extends SuspendLambda implements Function2 {
    public Mutex o;
    public TransitionState p;
    public int q;
    public final TransitionState r;

    public g0(TransitionState transitionState0, Continuation continuation0) {
        this.r = transitionState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new g0(this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        TransitionState transitionState1;
        Mutex mutex0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                TransitionState transitionState0 = this.r;
                ((SeekableTransitionState)transitionState0).observeTotalDuration$animation_core_release();
                mutex0 = ((SeekableTransitionState)transitionState0).getCompositionContinuationMutex$animation_core_release();
                this.o = mutex0;
                this.p = transitionState0;
                this.q = 1;
                if(mutex0.lock(null, this) == object1) {
                    return object1;
                }
                transitionState1 = transitionState0;
                break;
            }
            case 1: {
                transitionState1 = this.p;
                mutex0 = this.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            ((SeekableTransitionState)transitionState1).setComposedTargetState$animation_core_release(transitionState1.getTargetState());
            CancellableContinuation cancellableContinuation0 = ((SeekableTransitionState)transitionState1).getCompositionContinuation$animation_core_release();
            if(cancellableContinuation0 != null) {
                cancellableContinuation0.resumeWith(Result.constructor-impl(transitionState1.getTargetState()));
            }
            ((SeekableTransitionState)transitionState1).setCompositionContinuation$animation_core_release(null);
            return Unit.INSTANCE;
        }
        finally {
            mutex0.unlock(null);
        }
    }
}

