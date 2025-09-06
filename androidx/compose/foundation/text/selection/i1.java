package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class i1 extends Lambda implements Function1 {
    public final int w;
    public final Density x;
    public final MutableState y;

    public i1(Density density0, MutableState mutableState0, int v) {
        this.w = v;
        this.x = density0;
        this.y = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            long v = ((DpSize)object0).unbox-impl();
            IntSize intSize0 = IntSize.box-impl(IntSizeKt.IntSize(this.x.roundToPx-0680j_4(DpSize.getWidth-D9Ej5fM(v)), this.x.roundToPx-0680j_4(DpSize.getHeight-D9Ej5fM(v))));
            this.y.setValue(intSize0);
            return Unit.INSTANCE;
        }
        long v1 = ((DpSize)object0).unbox-impl();
        IntSize intSize1 = IntSize.box-impl(IntSizeKt.IntSize(this.x.roundToPx-0680j_4(DpSize.getWidth-D9Ej5fM(v1)), this.x.roundToPx-0680j_4(DpSize.getHeight-D9Ej5fM(v1))));
        this.y.setValue(intSize1);
        return Unit.INSTANCE;
    }
}

