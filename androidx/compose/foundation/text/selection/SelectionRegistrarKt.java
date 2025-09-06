package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u001D\u0010\u0004\u001A\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\"\u0010\u000B\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "selectableId", "", "hasSelection", "(Landroidx/compose/foundation/text/selection/SelectionRegistrar;J)Z", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalSelectionRegistrar", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalSelectionRegistrar", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SelectionRegistrarKt {
    public static final ProvidableCompositionLocal a;

    static {
        SelectionRegistrarKt.a = CompositionLocalKt.compositionLocalOf$default(null, c0.y, 1, null);
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalSelectionRegistrar() {
        return SelectionRegistrarKt.a;
    }

    public static final boolean hasSelection(@Nullable SelectionRegistrar selectionRegistrar0, long v) {
        if(selectionRegistrar0 != null) {
            LongObjectMap longObjectMap0 = selectionRegistrar0.getSubselections();
            return longObjectMap0 == null ? false : longObjectMap0.containsKey(v);
        }
        return false;
    }
}

