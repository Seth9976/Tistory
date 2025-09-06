package ca;

import android.util.Range;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.designsystem.common.KDSliderKt;
import com.kakao.kandinsky.designsystem.common.TickSliderOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

public final class q1 extends Lambda implements Function2 {
    public final float A;
    public final Range B;
    public final ClosedFloatingPointRange C;
    public final Function2 D;
    public final int E;
    public final DraggableState w;
    public final boolean x;
    public final TickSliderOptions y;
    public final boolean z;

    public q1(DraggableState draggableState0, boolean z, TickSliderOptions tickSliderOptions0, boolean z1, float f, Range range0, ClosedFloatingPointRange closedFloatingPointRange0, Function2 function20, int v) {
        this.w = draggableState0;
        this.x = z;
        this.y = tickSliderOptions0;
        this.z = z1;
        this.A = f;
        this.B = range0;
        this.C = closedFloatingPointRange0;
        this.D = function20;
        this.E = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        KDSliderKt.access$Slider(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)));
        return Unit.INSTANCE;
    }
}

