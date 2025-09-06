package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A.\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u0006¨\u0006\u0007"}, d2 = {"flowWithLifecycle", "Lkotlinx/coroutines/flow/Flow;", "T", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FlowExtKt {
    @NotNull
    public static final Flow flowWithLifecycle(@NotNull Flow flow0, @NotNull Lifecycle lifecycle0, @NotNull State lifecycle$State0) {
        Intrinsics.checkNotNullParameter(flow0, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle0, "lifecycle");
        Intrinsics.checkNotNullParameter(lifecycle$State0, "minActiveState");
        return FlowKt.callbackFlow(new p(lifecycle0, lifecycle$State0, flow0, null));
    }

    public static Flow flowWithLifecycle$default(Flow flow0, Lifecycle lifecycle0, State lifecycle$State0, int v, Object object0) {
        if((v & 2) != 0) {
            lifecycle$State0 = State.STARTED;
        }
        return FlowExtKt.flowWithLifecycle(flow0, lifecycle0, lifecycle$State0);
    }
}

