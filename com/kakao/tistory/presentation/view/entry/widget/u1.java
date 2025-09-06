package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u1 extends Lambda implements Function1 {
    public final long a;

    public u1(long v) {
        this.a = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$Canvas");
        Rect rect0 = SizeKt.toRect-uvyYCjk(((DrawScope)object0).getSize-NH-jbRc());
        float f = ((DrawScope)object0).toPx-0680j_4(1.0f);
        DrawScope.drawLine-NGM6Ib0$default(((DrawScope)object0), this.a, rect0.getTopLeft-F1C5BW0(), rect0.getBottomLeft-F1C5BW0(), f, 0, null, 0.0f, null, 0, 0x1F0, null);
        float f1 = ((DrawScope)object0).toPx-0680j_4(1.0f);
        DrawScope.drawLine-NGM6Ib0$default(((DrawScope)object0), this.a, rect0.getBottomLeft-F1C5BW0(), rect0.getBottomRight-F1C5BW0(), f1, 0, null, 0.0f, null, 0, 0x1F0, null);
        return Unit.INSTANCE;
    }
}

