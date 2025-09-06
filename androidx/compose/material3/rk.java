package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class rk extends Lambda implements Function2 {
    public final int w;
    public final SliderColors x;
    public final boolean y;

    public rk(int v, SliderColors sliderColors0, boolean z) {
        this.w = v;
        this.x = sliderColors0;
        this.y = z;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            long v = this.x.trackColor-WaAFU9c$material3_release(this.y, true);
            SliderDefaults.access$drawStopIndicator-x3O1jOs(SliderDefaults.INSTANCE, ((DrawScope)object0), ((Offset)object1).unbox-impl(), 0.0f, v);
            return Unit.INSTANCE;
        }
        long v1 = this.x.trackColor-WaAFU9c$material3_release(this.y, true);
        SliderDefaults.access$drawStopIndicator-x3O1jOs(SliderDefaults.INSTANCE, ((DrawScope)object0), ((Offset)object1).unbox-impl(), 0.0f, v1);
        return Unit.INSTANCE;
    }
}

