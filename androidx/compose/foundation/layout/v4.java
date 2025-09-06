package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v4 extends Lambda implements Function2 {
    public final Horizontal w;

    public v4(Horizontal alignment$Horizontal0) {
        this.w = alignment$Horizontal0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = IntSize.getWidth-impl(((IntSize)object0).unbox-impl());
        return IntOffset.box-impl(IntOffsetKt.IntOffset(this.w.align(0, v, ((LayoutDirection)object1)), 0));
    }
}

