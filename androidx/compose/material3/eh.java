package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;
import r0.a;

public final class eh extends Lambda implements Function1 {
    public final Function0 w;
    public final PaddingValues x;

    public eh(Function0 function00, PaddingValues paddingValues0) {
        this.w = function00;
        this.x = paddingValues0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = ((Size)this.w.invoke()).unbox-impl();
        float f = Size.getWidth-impl(v);
        if(f > 0.0f) {
            float f1 = ((ContentDrawScope)object0).toPx-0680j_4(4.0f);
            LayoutDirection layoutDirection0 = ((ContentDrawScope)object0).getLayoutDirection();
            float f2 = ((ContentDrawScope)object0).toPx-0680j_4(this.x.calculateLeftPadding-u2uoSUM(layoutDirection0)) - f1;
            float f3 = f1 * 2.0f + (f + f2);
            float f4 = OutlinedTextFieldKt.outlineCutout.1.WhenMappings.$EnumSwitchMapping$0[((ContentDrawScope)object0).getLayoutDirection().ordinal()] == 1 ? Size.getWidth-impl(((ContentDrawScope)object0).getSize-NH-jbRc()) - f3 : c.coerceAtLeast(f2, 0.0f);
            if(OutlinedTextFieldKt.outlineCutout.1.WhenMappings.$EnumSwitchMapping$0[((ContentDrawScope)object0).getLayoutDirection().ordinal()] == 1) {
                f3 = Size.getWidth-impl(((ContentDrawScope)object0).getSize-NH-jbRc()) - c.coerceAtLeast(f2, 0.0f);
            }
            float f5 = Size.getHeight-impl(v);
            DrawContext drawContext0 = ((ContentDrawScope)object0).getDrawContext();
            long v1 = drawContext0.getSize-NH-jbRc();
            drawContext0.getCanvas().save();
            try {
                drawContext0.getTransform().clipRect-N_I0leg(f4, -f5 / 2.0f, f3, f5 / 2.0f, 0);
                ((ContentDrawScope)object0).drawContent();
                return Unit.INSTANCE;
            }
            finally {
                a.y(drawContext0, v1);
            }
        }
        ((ContentDrawScope)object0).drawContent();
        return Unit.INSTANCE;
    }
}

