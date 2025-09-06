package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function0 {
    public final SelectionManager w;

    public v(SelectionManager selectionManager0) {
        this.w = selectionManager0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Offset offset0 = this.w.getStartHandlePosition-_m7T9-E();
        return offset0 == null ? Offset.box-impl(0x7FC000007FC00000L) : Offset.box-impl(offset0.unbox-impl());
    }
}

