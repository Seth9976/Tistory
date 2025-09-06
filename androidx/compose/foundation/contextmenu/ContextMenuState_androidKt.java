package androidx.compose.foundation.contextmenu;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0013\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState;", "", "close", "(Landroidx/compose/foundation/contextmenu/ContextMenuState;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ContextMenuState_androidKt {
    public static final void close(@NotNull ContextMenuState contextMenuState0) {
        contextMenuState0.setStatus(Closed.INSTANCE);
    }
}

