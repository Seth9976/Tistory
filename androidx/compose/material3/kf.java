package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class kf extends Lambda implements Function1 {
    public final DrawerState w;

    public kf(DrawerState drawerState0) {
        this.w = drawerState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Density density0 = (Density)object0;
        float f = this.w.getCurrentOffset();
        return Float.isNaN(f) ? IntOffset.box-impl(0L) : IntOffset.box-impl(IntOffsetKt.IntOffset(c.roundToInt(f), 0));
    }
}

