package ca;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.room.a;
import com.kakao.kandinsky.designsystem.common.FadingEdgeBoxKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p0.u6;

public final class r1 extends Lambda implements Function3 {
    public final int w;
    public final float x;

    public r1(float f, int v) {
        this.w = v;
        this.x = f;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        switch(this.w) {
            case 0: {
                int v1 = a.c(((Number)object2), ((Modifier)object0), "$this$byOrientation", ((Composer)object1), 0x93E48145);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x93E48145, v1, -1, "com.kakao.kandinsky.designsystem.common.SliderBoundBox.<anonymous> (KDSlider.kt:200)");
                }
                Modifier modifier0 = FadingEdgeBoxKt.horizontalFadingEdge-ziNgDLE$default(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(((Modifier)object0), this.x), 0.0f, 1, null), 24.0f, 0.0f, 2, null), 0.0f, false, false, 7, null);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return modifier0;
            }
            case 1: {
                int v2 = a.c(((Number)object2), ((Modifier)object0), "$this$byOrientation", ((Composer)object1), 0x5E9C2406);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x5E9C2406, v2, -1, "com.kakao.kandinsky.designsystem.common.SliderBoundBox.<anonymous> (KDSlider.kt:206)");
                }
                Modifier modifier1 = FadingEdgeBoxKt.verticalFadingEdge-ziNgDLE$default(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxHeight$default(SizeKt.width-3ABfNKs(((Modifier)object0), this.x), 0.0f, 1, null), 0.0f, 24.0f, 1, null), 0.0f, false, false, 7, null);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return modifier1;
            }
            default: {
                int v = ((MeasureScope)object0).roundToPx-0680j_4(this.x);
                Placeable placeable0 = ((Measurable)object1).measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U(((Constraints)object2).unbox-impl(), 0, v * 2));
                return MeasureScope.layout$default(((MeasureScope)object0), placeable0.getWidth(), placeable0.getHeight() - v * 2, null, new u6(placeable0, v), 4, null);
            }
        }
    }
}

