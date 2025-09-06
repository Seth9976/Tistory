package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.kakao.tistory.presentation.theme.TColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function1 {
    public final float a;

    public y(float f) {
        this.a = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ContentDrawScope)object0), "$this$drawWithContent");
        ((ContentDrawScope)object0).drawContent();
        float f = ((ContentDrawScope)object0).toPx-0680j_4(this.a);
        DrawScope.drawRoundRect-u-Aw5IA$default(((ContentDrawScope)object0), Color.copy-wmQWz5c$default(TColor.INSTANCE.getBlack-0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, CornerRadiusKt.CornerRadius(f, f), null, 0.0f, null, 0, 0xF6, null);
        return Unit.INSTANCE;
    }
}

