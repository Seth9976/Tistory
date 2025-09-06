package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0016\u0010\u0000\u001A\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0007\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"observe", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "Landroidx/compose/runtime/Composition;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserver;", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/tooling/RecomposeScopeObserver;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class CompositionObserverKt {
    @ExperimentalComposeRuntimeApi
    @Nullable
    public static final CompositionObserverHandle observe(@NotNull Composition composition0, @NotNull CompositionObserver compositionObserver0) {
        CompositionImpl compositionImpl0 = (CompositionImpl)CompositionKt.getCompositionService(composition0, CompositionKt.getCompositionImplServiceKey());
        return compositionImpl0 == null ? null : compositionImpl0.observe$runtime_release(compositionObserver0);
    }

    @ExperimentalComposeRuntimeApi
    @NotNull
    public static final CompositionObserverHandle observe(@NotNull RecomposeScope recomposeScope0, @NotNull RecomposeScopeObserver recomposeScopeObserver0) {
        Intrinsics.checkNotNull(recomposeScope0, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
        return ((RecomposeScopeImpl)recomposeScope0).observe$runtime_release(recomposeScopeObserver0);
    }
}

