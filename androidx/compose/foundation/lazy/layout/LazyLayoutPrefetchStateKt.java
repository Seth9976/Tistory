package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u001D\u0010\u0003\u001A\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "lazyLayoutPrefetchState", "traversablePrefetchState", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LazyLayoutPrefetchStateKt {
    public static final long a;

    static {
        LazyLayoutPrefetchStateKt.a = ConstraintsKt.Constraints$default(0, 0, 0, 0, 5, null);
    }

    public static final long access$getZeroConstraints$p() [...] // 潜在的解密器

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier traversablePrefetchState(@NotNull Modifier modifier0, @Nullable LazyLayoutPrefetchState lazyLayoutPrefetchState0) {
        if(lazyLayoutPrefetchState0 != null) {
            Modifier modifier1 = modifier0.then(new TraversablePrefetchStateModifierElement(lazyLayoutPrefetchState0));
            return modifier1 == null ? modifier0 : modifier1;
        }
        return modifier0;
    }
}

