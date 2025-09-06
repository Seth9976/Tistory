package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final OffsetProvider w;
    public final boolean x;
    public final boolean y;

    public f(OffsetProvider offsetProvider0, boolean z, boolean z1) {
        this.w = offsetProvider0;
        this.x = z;
        this.y = z1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = this.w.provide-F1C5BW0();
        ((SemanticsPropertyReceiver)object0).set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo((this.x ? Handle.SelectionStart : Handle.SelectionEnd), v, (this.y ? SelectionHandleAnchor.Left : SelectionHandleAnchor.Right), OffsetKt.isSpecified-k-4lQ0M(v), null));
        return Unit.INSTANCE;
    }
}

