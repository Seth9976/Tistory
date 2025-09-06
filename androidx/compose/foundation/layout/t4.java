package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t4 extends Lambda implements Function2 {
    public final Vertical w;

    public t4(Vertical alignment$Vertical0) {
        this.w = alignment$Vertical0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = ((IntSize)object0).unbox-impl();
        LayoutDirection layoutDirection0 = (LayoutDirection)object1;
        return IntOffset.box-impl(IntOffsetKt.IntOffset(0, this.w.align(0, IntSize.getHeight-impl(v))));
    }
}

