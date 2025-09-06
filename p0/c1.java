package p0;

import androidx.compose.material.BottomDrawerState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class c1 extends Lambda implements Function1 {
    public final int w;
    public final BottomDrawerState x;

    public c1(BottomDrawerState bottomDrawerState0, int v) {
        this.w = v;
        this.x = bottomDrawerState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Density density0 = (Density)object0;
            return IntOffset.box-impl(IntOffsetKt.IntOffset(0, c.roundToInt(this.x.requireOffset$material_release())));
        }
        ((Number)object0).floatValue();
        return BottomDrawerState.access$requireDensity(this.x).toPx-0680j_4(56.0f);
    }
}

