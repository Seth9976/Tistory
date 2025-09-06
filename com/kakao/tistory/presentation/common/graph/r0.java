package com.kakao.tistory.presentation.common.graph;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.kakao.tistory.presentation.theme.TColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function1 {
    public static final r0 a;

    static {
        r0.a = new r0();
    }

    public r0() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$Canvas");
        DrawScope.drawLine-NGM6Ib0$default(((DrawScope)object0), TColor.INSTANCE.getGray200-0d7_KjU(), OffsetKt.Offset(0.0f, Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc()) / 2.0f), OffsetKt.Offset(Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()), Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc()) / 2.0f), Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc()), 0, PathEffect.Companion.dashPathEffect(new float[]{6.0f, 10.0f}, 0.0f), 0.0f, null, 0, 0x1D0, null);
        return Unit.INSTANCE;
    }
}

