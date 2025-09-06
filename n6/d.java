package n6;

import androidx.compose.runtime.ProduceStateScope;
import com.google.accompanist.navigation.material.BottomSheetNavigator.sheetContent.1.retainedEntry.2.invokeSuspend..inlined.transform.1;
import com.google.accompanist.navigation.material.BottomSheetNavigator;
import i4.b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class d extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final BottomSheetNavigator q;

    public d(BottomSheetNavigator bottomSheetNavigator0, Continuation continuation0) {
        this.q = bottomSheetNavigator0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new d(this.q, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(((ProduceStateScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ProduceStateScope produceStateScope0 = (ProduceStateScope)this.p;
                Flow flow0 = FlowKt.flow(new BottomSheetNavigator.sheetContent.1.retainedEntry.2.invokeSuspend..inlined.transform.1(BottomSheetNavigator.access$getBackStack(this.q), null, this.q));
                b b0 = new b(produceStateScope0, 2);
                this.o = 1;
                return flow0.collect(b0, this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

