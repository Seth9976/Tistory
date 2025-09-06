package com.kakao.tistory.presentation.theme;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final long a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public h(long v, float f, float f1, float f2, float f3) {
        this.a = v;
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$drawBehind");
        int v = ColorKt.toArgb-8_81llA(this.a);
        int v1 = ColorKt.toArgb-8_81llA(0L);
        Canvas canvas0 = ((DrawScope)object0).getDrawContext().getCanvas();
        Paint paint0 = AndroidPaint_androidKt.Paint();
        android.graphics.Paint paint1 = paint0.asFrameworkPaint();
        paint1.setColor(v1);
        paint1.setShadowLayer(((DrawScope)object0).toPx-0680j_4(this.b), ((DrawScope)object0).toPx-0680j_4(this.c), ((DrawScope)object0).toPx-0680j_4(this.d), v);
        canvas0.drawRoundRect(0.0f, 0.0f, Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()), Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc()), ((DrawScope)object0).toPx-0680j_4(this.e), ((DrawScope)object0).toPx-0680j_4(this.e), paint0);
        return Unit.INSTANCE;
    }
}

