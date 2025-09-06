package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final Vertical w;

    public h(Vertical alignment$Vertical0) {
        this.w = alignment$Vertical0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        LayoutDirection layoutDirection0 = (LayoutDirection)object1;
        return this.w.align(0, ((Number)object0).intValue());
    }
}

