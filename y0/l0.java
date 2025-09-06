package y0;

import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.Recomposer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;

public final class l0 extends SuspendLambda implements Function2 {
    public final Recomposer o;
    public final ControlledComposition p;

    public l0(Recomposer recomposer0, ControlledComposition controlledComposition0, Continuation continuation0) {
        this.o = recomposer0;
        this.p = controlledComposition0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new l0(this.o, this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((l0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        CancellableContinuation cancellableContinuation0;
        ResultKt.throwOnFailure(object0);
        ControlledComposition controlledComposition0 = Recomposer.access$performRecompose(this.o, this.p, null);
        Object object1 = this.o.c;
        Recomposer recomposer0 = this.o;
        synchronized(object1) {
            if(controlledComposition0 != null) {
                recomposer0.j.add(controlledComposition0);
            }
            --recomposer0.q;
            cancellableContinuation0 = recomposer0.b();
        }
        if(cancellableContinuation0 != null) {
            cancellableContinuation0.resumeWith(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}

