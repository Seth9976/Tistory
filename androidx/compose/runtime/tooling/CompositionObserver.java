package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ExperimentalComposeRuntimeApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J,\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u001A\u0010\u0006\u001A\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t0\u0007H&J\u0010\u0010\n\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionObserver;", "", "onBeginComposition", "", "composition", "Landroidx/compose/runtime/Composition;", "invalidationMap", "", "Landroidx/compose/runtime/RecomposeScope;", "", "onEndComposition", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface CompositionObserver {
    void onBeginComposition(@NotNull Composition arg1, @NotNull Map arg2);

    void onEndComposition(@NotNull Composition arg1);
}

