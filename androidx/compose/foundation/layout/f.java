package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final Horizontal w;

    public f(Horizontal alignment$Horizontal0) {
        this.w = alignment$Horizontal0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return this.w.align(0, ((Number)object0).intValue(), ((LayoutDirection)object1));
    }
}

