package s4;

import androidx.paging.PagingData;
import androidx.paging.SimpleProducerScope;
import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class i0 implements FunctionAdapter, FlowCollector {
    public final SimpleProducerScope a;

    public i0(SimpleProducerScope simpleProducerScope0) {
        this.a = simpleProducerScope0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        Unit unit0 = this.a.send(((PagingData)object0), continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof FlowCollector) || !(object0 instanceof FunctionAdapter) ? false : Intrinsics.areEqual(this.getFunctionDelegate(), ((FunctionAdapter)object0).getFunctionDelegate());
    }

    @Override  // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.a, SimpleProducerScope.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override
    public final int hashCode() {
        return this.getFunctionDelegate().hashCode();
    }
}

