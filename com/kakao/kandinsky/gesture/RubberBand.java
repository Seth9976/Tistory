package com.kakao.kandinsky.gesture;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J \u0010\b\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\t"}, d2 = {"Lcom/kakao/kandinsky/gesture/RubberBand;", "", "Landroidx/compose/ui/geometry/Offset;", "offset", "Landroidx/compose/ui/geometry/Size;", "size", "calculateBandOffset-ywzJ3js", "(JJ)J", "calculateBandOffset", "gesture_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RubberBand {
    @NotNull
    public static final RubberBand INSTANCE;

    static {
        RubberBand.INSTANCE = new RubberBand();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final long calculateBandOffset-ywzJ3js(long v, long v1) {
        int v2 = -1;
        int v3 = Float.compare(Offset.getX-impl(v), 0.0f) <= 0 ? -1 : 1;
        if(Offset.getY-impl(v) > 0.0f) {
            v2 = 1;
        }
        float f = Size.getWidth-impl(v1);
        float f1 = Size.getWidth-impl(v1);
        float f2 = Size.getHeight-impl(v1);
        return OffsetKt.Offset(f1 * (1.0f - 1.0f / (Math.abs(Offset.getX-impl(v)) * 0.55f / f + 1.0f)) * ((float)v3), Size.getHeight-impl(v1) * (1.0f - 1.0f / (Math.abs(Offset.getY-impl(v)) * 0.55f / f2 + 1.0f)) * ((float)v2));
    }
}

