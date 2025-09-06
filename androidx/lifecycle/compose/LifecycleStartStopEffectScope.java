package androidx.lifecycle.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000B\u001A\u00020\n2\u0019\b\u0004\u0010\t\u001A\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\u000B\u0010\fR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "onStopOrDisposeEffect", "Landroidx/lifecycle/compose/LifecycleStopOrDisposeEffectResult;", "onStopOrDispose", "(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/compose/LifecycleStopOrDisposeEffectResult;", "a", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle-runtime-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LifecycleStartStopEffectScope implements LifecycleOwner {
    public static final int $stable = 8;
    public final Lifecycle a;

    public LifecycleStartStopEffectScope(@NotNull Lifecycle lifecycle0) {
        this.a = lifecycle0;
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.a;
    }

    @NotNull
    public final LifecycleStopOrDisposeEffectResult onStopOrDispose(@NotNull Function1 function10) {
        return new LifecycleStopOrDisposeEffectResult() {
            @Override  // androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult
            public void runStopOrDisposeEffect() {
                this.invoke(this.b);
            }
        };
    }
}

