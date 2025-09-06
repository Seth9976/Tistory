package u;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline.Rectangle;
import androidx.compose.ui.graphics.Outline.Rounded;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Dp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class w0 extends Lambda implements Function1 {
    public final BorderModifierNode w;

    public w0(BorderModifierNode borderModifierNode0) {
        this.w = borderModifierNode0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        BorderModifierNode borderModifierNode0 = this.w;
        if(((CacheDrawScope)object0).toPx-0680j_4(borderModifierNode0.getWidth-D9Ej5fM()) >= 0.0f && Size.getMinDimension-impl(((CacheDrawScope)object0).getSize-NH-jbRc()) > 0.0f) {
            float f = Math.min((Dp.equals-impl0(borderModifierNode0.getWidth-D9Ej5fM(), 0.0f) ? 1.0f : ((float)Math.ceil(((CacheDrawScope)object0).toPx-0680j_4(borderModifierNode0.getWidth-D9Ej5fM())))), ((float)Math.ceil(Size.getMinDimension-impl(((CacheDrawScope)object0).getSize-NH-jbRc()) / 2.0f)));
            long v = OffsetKt.Offset(f / 2.0f, f / 2.0f);
            long v1 = SizeKt.Size(Size.getWidth-impl(((CacheDrawScope)object0).getSize-NH-jbRc()) - f, Size.getHeight-impl(((CacheDrawScope)object0).getSize-NH-jbRc()) - f);
            boolean z = 2.0f * f > Size.getMinDimension-impl(((CacheDrawScope)object0).getSize-NH-jbRc());
            Outline outline0 = borderModifierNode0.getShape().createOutline-Pq9zytI(((CacheDrawScope)object0).getSize-NH-jbRc(), ((CacheDrawScope)object0).getLayoutDirection(), ((CacheDrawScope)object0));
            if(outline0 instanceof Generic) {
                return BorderModifierNode.access$drawGenericBorder(borderModifierNode0, ((CacheDrawScope)object0), borderModifierNode0.getBrush(), ((Generic)outline0), z, f);
            }
            if(outline0 instanceof Rounded) {
                return BorderModifierNode.access$drawRoundRectBorder-JqoCqck(borderModifierNode0, ((CacheDrawScope)object0), borderModifierNode0.getBrush(), ((Rounded)outline0), v, v1, z, f);
            }
            if(!(outline0 instanceof Rectangle)) {
                throw new NoWhenBranchMatchedException();
            }
            return BorderKt.access$drawRectBorder-NsqcLGU(((CacheDrawScope)object0), borderModifierNode0.getBrush(), v, v1, z, f);
        }
        return BorderKt.access$drawContentWithoutBorder(((CacheDrawScope)object0));
    }
}

