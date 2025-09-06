package p0;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class nb extends Lambda implements Function1 {
    public final float w;
    public final BorderStroke x;

    public nb(float f, BorderStroke borderStroke0) {
        this.w = f;
        this.x = borderStroke0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((ContentDrawScope)object0).drawContent();
        float f = this.w;
        if(!Dp.equals-impl0(f, 0.0f)) {
            float f1 = ((ContentDrawScope)object0).getDensity() * f;
            float f2 = Size.getHeight-impl(((ContentDrawScope)object0).getSize-NH-jbRc()) - f1 / 2.0f;
            long v = OffsetKt.Offset(Size.getWidth-impl(((ContentDrawScope)object0).getSize-NH-jbRc()), f2);
            DrawScope.drawLine-1RTmtNc$default(((ContentDrawScope)object0), this.x.getBrush(), OffsetKt.Offset(0.0f, f2), v, f1, 0, null, 0.0f, null, 0, 0x1F0, null);
        }
        return Unit.INSTANCE;
    }
}

