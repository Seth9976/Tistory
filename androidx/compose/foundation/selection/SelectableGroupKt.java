package androidx.compose.foundation.selection;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import h0.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\f\u0010\u0000\u001A\u00020\u0001*\u00020\u0001H\u0007¨\u0006\u0002"}, d2 = {"selectableGroup", "Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SelectableGroupKt {
    @Stable
    @NotNull
    public static final Modifier selectableGroup(@NotNull Modifier modifier0) {
        return SemanticsModifierKt.semantics$default(modifier0, false, a.w, 1, null);
    }
}

