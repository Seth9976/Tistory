package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001A\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004\"\u001B\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"coroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/Lifecycle;", "getCoroutineScope", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;", "eventFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/lifecycle/Lifecycle$Event;", "getEventFlow", "(Landroidx/lifecycle/Lifecycle;)Lkotlinx/coroutines/flow/Flow;", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LifecycleKt {
    @NotNull
    public static final LifecycleCoroutineScope getCoroutineScope(@NotNull Lifecycle lifecycle0) {
        Intrinsics.checkNotNullParameter(lifecycle0, "<this>");
        while(true) {
            LifecycleCoroutineScope lifecycleCoroutineScope0 = (LifecycleCoroutineScopeImpl)lifecycle0.getInternalScopeRef().get();
            if(lifecycleCoroutineScope0 != null) {
                return lifecycleCoroutineScope0;
            }
            LifecycleCoroutineScope lifecycleCoroutineScope1 = new LifecycleCoroutineScopeImpl(lifecycle0, SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()));
            AtomicReference atomicReference0 = lifecycle0.getInternalScopeRef();
            do {
                if(atomicReference0.compareAndSet(null, lifecycleCoroutineScope1)) {
                    ((LifecycleCoroutineScopeImpl)lifecycleCoroutineScope1).register();
                    return lifecycleCoroutineScope1;
                }
            }
            while(atomicReference0.get() == null);
        }
    }

    @NotNull
    public static final Flow getEventFlow(@NotNull Lifecycle lifecycle0) {
        Intrinsics.checkNotNullParameter(lifecycle0, "<this>");
        return FlowKt.flowOn(FlowKt.callbackFlow(new z(lifecycle0, null)), Dispatchers.getMain().getImmediate());
    }
}

