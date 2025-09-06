package u;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DisposableHandle;
import qd.a;

public final class r1 extends SuspendLambda implements Function2 {
    public int o;
    public final MutableInteractionSource p;
    public final FocusInteraction q;
    public final DisposableHandle r;

    public r1(MutableInteractionSource mutableInteractionSource0, FocusInteraction focusInteraction0, DisposableHandle disposableHandle0, Continuation continuation0) {
        this.p = mutableInteractionSource0;
        this.q = focusInteraction0;
        this.r = disposableHandle0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new r1(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((r1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                if(this.p.emit(this.q, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        DisposableHandle disposableHandle0 = this.r;
        if(disposableHandle0 != null) {
            disposableHandle0.dispose();
        }
        return Unit.INSTANCE;
    }
}

