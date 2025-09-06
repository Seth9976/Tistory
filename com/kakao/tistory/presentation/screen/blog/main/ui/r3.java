package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r3 extends Lambda implements Function1 {
    public final Brush a;
    public final long b;
    public final SolidColor c;

    public r3(Brush brush0, long v, SolidColor solidColor0) {
        this.a = brush0;
        this.b = v;
        this.c = solidColor0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$onDrawBehind");
        DrawScope.drawRect-AsUm42w$default(((DrawScope)object0), this.a, 0L, this.b, 0.0f, null, null, 0, 0x7A, null);
        DrawScope.drawRect-AsUm42w$default(((DrawScope)object0), this.c, 0L, this.b, 0.0f, null, null, 0, 0x7A, null);
        return Unit.INSTANCE;
    }
}

