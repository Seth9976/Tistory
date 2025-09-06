package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001A\u00020\u00042\u000E\b\u0004\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/DisposableEffectScope;", "", "()V", "onDispose", "Landroidx/compose/runtime/DisposableEffectResult;", "onDisposeEffect", "Lkotlin/Function0;", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DisposableEffectScope {
    public static final int $stable;

    @NotNull
    public final DisposableEffectResult onDispose(@NotNull Function0 function00) {
        return new DisposableEffectResult() {
            @Override  // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                this.a.invoke();
            }
        };
    }
}

