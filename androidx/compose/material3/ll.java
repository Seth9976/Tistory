package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;

public final class ll extends Lambda implements Function1 {
    public final RangeSliderState w;
    public final BooleanRef x;

    public ll(RangeSliderState rangeSliderState0, BooleanRef ref$BooleanRef0) {
        this.w = rangeSliderState0;
        this.x = ref$BooleanRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = Offset.getX-impl(PointerEventKt.positionChange(((PointerInputChange)object0)));
        boolean z = this.x.element;
        RangeSliderState rangeSliderState0 = this.w;
        if(rangeSliderState0.isRtl$material3_release()) {
            f = -f;
        }
        rangeSliderState0.onDrag$material3_release(z, f);
        return Unit.INSTANCE;
    }
}

