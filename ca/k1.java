package ca;

import android.util.Range;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import com.kakao.kandinsky.designsystem.common.KDSliderKt;
import com.kakao.kandinsky.designsystem.common.TickSliderOptions;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

public final class k1 extends Lambda implements Function3 {
    public final TickSliderOptions A;
    public final ClosedFloatingPointRange B;
    public final Function2 C;
    public final MutableFloatState D;
    public final MutableState E;
    public final float w;
    public final float x;
    public final DraggableState y;
    public final boolean z;

    public k1(float f, float f1, DraggableState draggableState0, boolean z, TickSliderOptions tickSliderOptions0, ClosedFloatingPointRange closedFloatingPointRange0, Function2 function20, MutableFloatState mutableFloatState0, MutableState mutableState0) {
        this.w = f;
        this.x = f1;
        this.y = draggableState0;
        this.z = z;
        this.A = tickSliderOptions0;
        this.B = closedFloatingPointRange0;
        this.C = function20;
        this.D = mutableFloatState0;
        this.E = mutableState0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxScope)object0), "$this$SliderBoundBox");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4A19E99A, v, -1, "com.kakao.kandinsky.designsystem.common.KDSlider.<anonymous>.<anonymous> (KDSlider.kt:165)");
        }
        ((Composer)object1).startMovableGroup(1026816200, ((Composer)object1).consume(OrientationKt.getLocalOrientation()));
        float f = KDSliderKt.access$KDSlider$valueToOffset(this.x, this.D);
        Range range0 = KDSliderKt.access$KDSlider$lambda$8(this.E);
        KDSliderKt.access$Slider(this.y, this.z, this.A, ((boolean)((Float.compare(this.w, this.x) == 0 ? 1 : 0) ^ 1)), f, range0, this.B, this.C, ((Composer)object1), 0x40188);
        ((Composer)object1).endMovableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

