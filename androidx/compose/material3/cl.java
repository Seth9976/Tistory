package androidx.compose.material3;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class cl extends Lambda implements Function1 {
    public final int w;
    public final SliderState x;

    public cl(SliderState sliderState0, int v) {
        this.w = v;
        this.x = sliderState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                long v = ((IntSize)object0).unbox-impl();
                this.x.setThumbWidth$material3_release(((float)IntSize.getWidth-impl(v)));
                return Unit.INSTANCE;
            }
            case 1: {
                SliderState sliderState0 = this.x;
                float f = c.coerceIn(((Number)object0).floatValue(), ((Number)sliderState0.getValueRange().getStart()).floatValue(), ((Number)sliderState0.getValueRange().getEndInclusive()).floatValue());
                if(sliderState0.getSteps() > 0) {
                    int v1 = sliderState0.getSteps();
                    if(v1 + 1 >= 0) {
                        float f1 = f;
                        float f2 = f1;
                        for(int v2 = 0; true; ++v2) {
                            float f3 = MathHelpersKt.lerp(((Number)sliderState0.getValueRange().getStart()).floatValue(), ((Number)sliderState0.getValueRange().getEndInclusive()).floatValue(), ((float)v2) / ((float)(sliderState0.getSteps() + 1)));
                            float f4 = f3 - f;
                            if(Math.abs(f4) <= f1) {
                                f1 = Math.abs(f4);
                                f2 = f3;
                            }
                            if(v2 == v1 + 1) {
                                break;
                            }
                        }
                        f = f2;
                    }
                }
                if(f == sliderState0.getValue()) {
                    return false;
                }
                if(f != sliderState0.getValue()) {
                    if(sliderState0.getOnValueChange$material3_release() == null) {
                        sliderState0.setValue(f);
                    }
                    else {
                        Function1 function10 = sliderState0.getOnValueChange$material3_release();
                        if(function10 != null) {
                            function10.invoke(f);
                        }
                    }
                }
                Function0 function00 = sliderState0.getOnValueChangeFinished();
                if(function00 != null) {
                    function00.invoke();
                }
                return true;
            }
            default: {
                this.x.dispatchRawDelta(0.0f);
                this.x.getGestureEndAction$material3_release().invoke();
                return Unit.INSTANCE;
            }
        }
    }
}

