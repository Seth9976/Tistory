package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final ContextMenuState w;

    public a(ContextMenuState contextMenuState0) {
        this.w = contextMenuState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Open contextMenuState$Status$Open0 = new Open(((Offset)object0).unbox-impl(), null);
        this.w.setStatus(contextMenuState$Status$Open0);
        return Unit.INSTANCE;
    }
}

