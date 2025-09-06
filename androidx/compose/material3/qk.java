package androidx.compose.material3;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class qk extends Lambda implements Function1 {
    public final long A;
    public final float B;
    public final float C;
    public final Function2 D;
    public final Function3 E;
    public final Object F;
    public final int w;
    public final long x;
    public final long y;
    public final long z;

    public qk(Object object0, long v, long v1, long v2, long v3, float f, float f1, Function2 function20, Function3 function30, int v4) {
        this.w = v4;
        this.F = object0;
        this.x = v;
        this.y = v1;
        this.z = v2;
        this.A = v3;
        this.B = f;
        this.C = f1;
        this.D = function20;
        this.E = function30;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            float[] arr_f = ((SliderState)this.F).getTickFractions$material3_release();
            float f = ((SliderState)this.F).getCoercedValueAsFraction$material3_release();
            float f1 = ((DrawScope)object0).toDp-u2uoSUM(((SliderState)this.F).getTrackHeight$material3_release());
            float f2 = ((DrawScope)object0).toDp-u2uoSUM(0);
            float f3 = ((DrawScope)object0).toDp-u2uoSUM(((SliderState)this.F).getThumbWidth$material3_release());
            SliderDefaults.access$drawTrack-ngJ0SCU(SliderDefaults.INSTANCE, ((DrawScope)object0), arr_f, 0.0f, f, this.x, this.y, this.z, this.A, f1, f2, f3, this.B, this.C, this.D, this.E, false);
            return Unit.INSTANCE;
        }
        float[] arr_f1 = ((RangeSliderState)this.F).getTickFractions$material3_release();
        float f4 = ((RangeSliderState)this.F).getCoercedActiveRangeStartAsFraction$material3_release();
        float f5 = ((RangeSliderState)this.F).getCoercedActiveRangeEndAsFraction$material3_release();
        float f6 = ((DrawScope)object0).toDp-u2uoSUM(((RangeSliderState)this.F).getTrackHeight$material3_release());
        float f7 = ((DrawScope)object0).toDp-u2uoSUM(((RangeSliderState)this.F).getStartThumbWidth$material3_release());
        float f8 = ((DrawScope)object0).toDp-u2uoSUM(((RangeSliderState)this.F).getEndThumbWidth$material3_release());
        SliderDefaults.access$drawTrack-ngJ0SCU(SliderDefaults.INSTANCE, ((DrawScope)object0), arr_f1, f4, f5, this.x, this.y, this.z, this.A, f6, f7, f8, this.B, this.C, this.D, this.E, true);
        return Unit.INSTANCE;
    }
}

