package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u4 extends Lambda implements Function2 {
    public final Alignment w;

    public u4(Alignment alignment0) {
        this.w = alignment0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = ((IntSize)object0).unbox-impl();
        return IntOffset.box-impl(this.w.align-KFBX0sM(0L, v, ((LayoutDirection)object1)));
    }
}

