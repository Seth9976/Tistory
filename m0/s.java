package m0;

import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import qd.a;

public final class s extends SuspendLambda implements Function2 {
    public int o;
    public final Job p;
    public final CursorAnimationState q;

    public s(Job job0, CursorAnimationState cursorAnimationState0, Continuation continuation0) {
        this.p = job0;
        this.q = cursorAnimationState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new s(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((s)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        CursorAnimationState cursorAnimationState0;
        Object object1;
        try {
            object1 = a.getCOROUTINE_SUSPENDED();
            cursorAnimationState0 = this.q;
            switch(this.o) {
                case 0: {
                    goto label_4;
                }
                case 1: {
                    goto label_10;
                }
                case 2: {
                    goto label_12;
                }
                case 3: {
                    goto label_14;
                }
            }
        }
        catch(Throwable throwable0) {
            CursorAnimationState.access$setCursorAlpha(cursorAnimationState0, 0.0f);
            throw throwable0;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_4:
        ResultKt.throwOnFailure(object0);
        Job job0 = this.p;
        if(job0 == null) {
            goto label_15;
        }
        else {
            this.o = 1;
            if(JobKt.cancelAndJoin(job0, this) == object1) {
                return object1;
            label_10:
                ResultKt.throwOnFailure(object0);
                goto label_15;
                try {
                label_12:
                    ResultKt.throwOnFailure(object0);
                    goto label_19;
                label_14:
                    ResultKt.throwOnFailure(object0);
                    do {
                    label_15:
                        CursorAnimationState.access$setCursorAlpha(cursorAnimationState0, 1.0f);
                        this.o = 2;
                        if(DelayKt.delay(500L, this) == object1) {
                            return object1;
                        }
                    label_19:
                        CursorAnimationState.access$setCursorAlpha(cursorAnimationState0, 0.0f);
                        this.o = 3;
                    }
                    while(DelayKt.delay(500L, this) != object1);
                    return object1;
                }
                catch(Throwable throwable0) {
                }
            }
        }
        CursorAnimationState.access$setCursorAlpha(cursorAnimationState0, 0.0f);
        throw throwable0;
    }
}

