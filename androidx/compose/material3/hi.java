package androidx.compose.material3;

import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class hi extends Lambda implements Function1 {
    public final int w;
    public final RangeSliderState x;

    public hi(RangeSliderState rangeSliderState0, int v) {
        this.w = v;
        this.x = rangeSliderState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                ((Boolean)object0).booleanValue();
                Function0 function00 = this.x.getOnValueChangeFinished();
                if(function00 != null) {
                    function00.invoke();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                long v1 = ((IntSize)object0).unbox-impl();
                this.x.setStartThumbWidth$material3_release(((float)IntSize.getWidth-impl(v1)));
                return Unit.INSTANCE;
            }
            default: {
                long v = ((IntSize)object0).unbox-impl();
                this.x.setEndThumbWidth$material3_release(((float)IntSize.getWidth-impl(v)));
                return Unit.INSTANCE;
            }
        }
    }
}

