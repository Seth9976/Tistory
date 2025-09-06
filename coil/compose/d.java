package coil.compose;

import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

public final class d implements FunctionAdapter, FlowCollector {
    public final AsyncImagePainter a;

    public d(AsyncImagePainter asyncImagePainter0) {
        this.a = asyncImagePainter0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        this.a.b(((State)object0));
        return Unit.INSTANCE;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof FlowCollector) || !(object0 instanceof FunctionAdapter) ? false : Intrinsics.areEqual(this.getFunctionDelegate(), ((FunctionAdapter)object0).getFunctionDelegate());
    }

    @Override  // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new AdaptedFunctionReference(2, this.a, AsyncImagePainter.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
    }

    @Override
    public final int hashCode() {
        return this.getFunctionDelegate().hashCode();
    }
}

