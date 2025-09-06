package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"overscroll", "Landroidx/compose/ui/Modifier;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class OverscrollKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier overscroll(@NotNull Modifier modifier0, @NotNull OverscrollEffect overscrollEffect0) {
        return modifier0.then(overscrollEffect0.getEffectModifier());
    }
}

