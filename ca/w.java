package ca;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush.Companion;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function1 {
    public final float w;
    public final boolean x;
    public final boolean y;

    public w(float f, boolean z, boolean z1) {
        this.w = f;
        this.x = z;
        this.y = z1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v;
        Float float0;
        Intrinsics.checkNotNullParameter(((CacheDrawScope)object0), "$this$drawWithCache");
        float f = ((CacheDrawScope)object0).toPx-0680j_4(this.w) / Size.getHeight-impl(((CacheDrawScope)object0).getSize-NH-jbRc());
        Companion brush$Companion0 = Brush.Companion;
        if(this.x) {
            float0 = f;
            v = 0L;
        }
        else {
            float0 = 0.0f;
            v = 0xFF00000000000000L;
        }
        Pair pair0 = TuplesKt.to(float0, Color.box-impl(v));
        Pair pair1 = TuplesKt.to(0.1f, Color.box-impl(0xFF00000000000000L));
        Pair pair2 = TuplesKt.to(0.9f, Color.box-impl(0xFF00000000000000L));
        return this.y ? ((CacheDrawScope)object0).onDrawWithContent(new v(Companion.verticalGradient-8A-3gB4$default(brush$Companion0, new Pair[]{pair0, pair1, pair2, TuplesKt.to(((float)(1.0f - f)), Color.box-impl(0L))}, 0.0f, 0.0f, 0, 14, null))) : ((CacheDrawScope)object0).onDrawWithContent(new v(Companion.verticalGradient-8A-3gB4$default(brush$Companion0, new Pair[]{pair0, pair1, pair2, TuplesKt.to(1.0f, Color.box-impl(0xFF00000000000000L))}, 0.0f, 0.0f, 0, 14, null)));
    }
}

