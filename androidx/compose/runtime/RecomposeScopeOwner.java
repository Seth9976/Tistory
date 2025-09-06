package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001A\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u0001H&J\u0010\u0010\u0007\u001A\u00020\b2\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0010\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u0001H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeOwner;", "", "invalidate", "Landroidx/compose/runtime/InvalidationResult;", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "instance", "recomposeScopeReleased", "", "recordReadOf", "value", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface RecomposeScopeOwner {
    @NotNull
    InvalidationResult invalidate(@NotNull RecomposeScopeImpl arg1, @Nullable Object arg2);

    void recomposeScopeReleased(@NotNull RecomposeScopeImpl arg1);

    void recordReadOf(@NotNull Object arg1);
}

