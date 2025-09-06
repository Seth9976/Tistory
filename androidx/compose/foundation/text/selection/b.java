package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final int w;
    public final OffsetProvider x;

    public b(OffsetProvider offsetProvider0, int v) {
        this.w = v;
        this.x = offsetProvider0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(OffsetKt.isSpecified-k-4lQ0M(this.x.provide-F1C5BW0()));
    }
}

