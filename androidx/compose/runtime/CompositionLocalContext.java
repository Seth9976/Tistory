package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/CompositionLocalContext;", "", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "compositionLocals", "<init>", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "a", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocals$runtime_release", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CompositionLocalContext {
    public static final int $stable;
    public final PersistentCompositionLocalMap a;

    public CompositionLocalContext(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap0) {
        this.a = persistentCompositionLocalMap0;
    }

    @NotNull
    public final PersistentCompositionLocalMap getCompositionLocals$runtime_release() {
        return this.a;
    }
}

