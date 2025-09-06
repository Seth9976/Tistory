package w0;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.TooltipState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import qd.a;

public final class j0 extends SuspendLambda implements Function2 {
    public Throwable o;
    public int p;
    public final MutableStateFlow q;
    public final TooltipState r;

    public j0(MutableStateFlow mutableStateFlow0, TooltipState tooltipState0, Continuation continuation0) {
        this.q = mutableStateFlow0;
        this.r = tooltipState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new j0(this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Throwable throwable1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        TooltipState tooltipState0 = this.r;
        MutableStateFlow mutableStateFlow0 = this.q;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    mutableStateFlow0.tryEmit(Boxing.boxBoolean(true));
                    this.p = 1;
                    if(tooltipState0.show(MutatePriority.PreventUserInput, this) == object1) {
                        return object1;
                    label_12:
                        ResultKt.throwOnFailure(object0);
                    }
                    goto label_22;
                }
                catch(Throwable throwable0) {
                    goto label_15;
                }
            }
            case 1: {
                goto label_12;
            label_15:
                i0 i00 = new i0(tooltipState0, null);
                this.o = throwable0;
                this.p = 3;
                if(FlowKt.collectLatest(mutableStateFlow0, i00, this) == object1) {
                    return object1;
                }
                throwable1 = throwable0;
                throw throwable1;
            label_22:
                i0 i01 = new i0(tooltipState0, null);
                this.p = 2;
                return FlowKt.collectLatest(mutableStateFlow0, i01, this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throwable1 = this.o;
        ResultKt.throwOnFailure(object0);
        throw throwable1;
    }
}

