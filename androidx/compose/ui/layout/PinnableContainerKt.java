package androidx.compose.ui.layout;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import z1.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001F\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/layout/PinnableContainer;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPinnableContainer", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalPinnableContainer", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PinnableContainerKt {
    public static final ProvidableCompositionLocal a;

    static {
        PinnableContainerKt.a = CompositionLocalKt.compositionLocalOf$default(null, g.z, 1, null);
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalPinnableContainer() {
        return PinnableContainerKt.a;
    }
}

