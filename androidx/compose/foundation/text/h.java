package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final LayoutCoordinates w;

    public h(LayoutCoordinates layoutCoordinates0) {
        this.w = layoutCoordinates0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float[] arr_f = ((Matrix)object0).unbox-impl();
        LayoutCoordinates layoutCoordinates0 = this.w;
        if(layoutCoordinates0.isAttached()) {
            LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates0).transformFrom-EL8BTi8(layoutCoordinates0, arr_f);
        }
        return Unit.INSTANCE;
    }
}

