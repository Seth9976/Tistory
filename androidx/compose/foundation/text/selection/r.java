package androidx.compose.foundation.text.selection;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function0 {
    public final SelectableInfo w;
    public final int x;

    public r(SelectableInfo selectableInfo0, int v) {
        this.w = selectableInfo0;
        this.x = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w.getTextLayoutResult().getLineForOffset(this.x);
    }
}

