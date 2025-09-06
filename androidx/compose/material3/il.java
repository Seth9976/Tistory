package androidx.compose.material3;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.c;

public final class il extends Lambda implements Function1 {
    public final int w;
    public final ClosedFloatingPointRange x;
    public final RangeSliderState y;

    public il(ClosedFloatingPointRange closedFloatingPointRange0, RangeSliderState rangeSliderState0, int v) {
        this.w = v;
        this.x = closedFloatingPointRange0;
        this.y = rangeSliderState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            ClosedFloatingPointRange closedFloatingPointRange0 = this.x;
            float f = c.coerceIn(((Number)object0).floatValue(), ((Number)closedFloatingPointRange0.getStart()).floatValue(), ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue());
            RangeSliderState rangeSliderState0 = this.y;
            if(rangeSliderState0.getStartSteps$material3_release() > 0) {
                int v = rangeSliderState0.getStartSteps$material3_release();
                if(v + 1 >= 0) {
                    float f1 = f;
                    float f2 = f1;
                    for(int v1 = 0; true; ++v1) {
                        float f3 = MathHelpersKt.lerp(((Number)closedFloatingPointRange0.getStart()).floatValue(), ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue(), ((float)v1) / ((float)(rangeSliderState0.getStartSteps$material3_release() + 1)));
                        float f4 = f3 - f;
                        if(Math.abs(f4) <= f1) {
                            f1 = Math.abs(f4);
                            f2 = f3;
                        }
                        if(v1 == v + 1) {
                            break;
                        }
                    }
                    f = f2;
                }
            }
            if(f == rangeSliderState0.getActiveRangeStart()) {
                return false;
            }
            long v2 = SliderKt.SliderRange(f, rangeSliderState0.getActiveRangeEnd());
            if(!SliderRange.equals-impl0(v2, SliderKt.SliderRange(rangeSliderState0.getActiveRangeStart(), rangeSliderState0.getActiveRangeEnd()))) {
                if(rangeSliderState0.getOnValueChange$material3_release() == null) {
                    rangeSliderState0.setActiveRangeStart(SliderRange.getStart-impl(v2));
                    rangeSliderState0.setActiveRangeEnd(SliderRange.getEndInclusive-impl(v2));
                }
                else {
                    Function1 function10 = rangeSliderState0.getOnValueChange$material3_release();
                    if(function10 != null) {
                        function10.invoke(SliderRange.box-impl(v2));
                    }
                }
            }
            Function0 function00 = rangeSliderState0.getOnValueChangeFinished();
            if(function00 != null) {
                function00.invoke();
            }
            return true;
        }
        ClosedFloatingPointRange closedFloatingPointRange1 = this.x;
        float f5 = c.coerceIn(((Number)object0).floatValue(), ((Number)closedFloatingPointRange1.getStart()).floatValue(), ((Number)closedFloatingPointRange1.getEndInclusive()).floatValue());
        RangeSliderState rangeSliderState1 = this.y;
        if(rangeSliderState1.getEndSteps$material3_release() > 0) {
            int v3 = rangeSliderState1.getEndSteps$material3_release();
            if(v3 + 1 >= 0) {
                float f6 = f5;
                float f7 = f6;
                for(int v4 = 0; true; ++v4) {
                    float f8 = MathHelpersKt.lerp(((Number)closedFloatingPointRange1.getStart()).floatValue(), ((Number)closedFloatingPointRange1.getEndInclusive()).floatValue(), ((float)v4) / ((float)(rangeSliderState1.getEndSteps$material3_release() + 1)));
                    float f9 = f8 - f5;
                    if(Math.abs(f9) <= f6) {
                        f6 = Math.abs(f9);
                        f7 = f8;
                    }
                    if(v4 == v3 + 1) {
                        break;
                    }
                }
                f5 = f7;
            }
        }
        if(f5 == rangeSliderState1.getActiveRangeEnd()) {
            return false;
        }
        long v5 = SliderKt.SliderRange(rangeSliderState1.getActiveRangeStart(), f5);
        if(!SliderRange.equals-impl0(v5, SliderKt.SliderRange(rangeSliderState1.getActiveRangeStart(), rangeSliderState1.getActiveRangeEnd()))) {
            if(rangeSliderState1.getOnValueChange$material3_release() == null) {
                rangeSliderState1.setActiveRangeStart(SliderRange.getStart-impl(v5));
                rangeSliderState1.setActiveRangeEnd(SliderRange.getEndInclusive-impl(v5));
            }
            else {
                Function1 function11 = rangeSliderState1.getOnValueChange$material3_release();
                if(function11 != null) {
                    function11.invoke(SliderRange.box-impl(v5));
                }
            }
        }
        Function0 function01 = rangeSliderState1.getOnValueChangeFinished();
        if(function01 != null) {
            function01.invoke();
        }
        return true;
    }
}

