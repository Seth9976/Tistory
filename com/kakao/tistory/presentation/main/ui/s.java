package com.kakao.tistory.presentation.main.ui;

import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function1 {
    public final SolidColor a;

    public s(SolidColor solidColor0) {
        this.a = solidColor0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ContentDrawScope)object0), "$this$onDrawWithContent");
        ((ContentDrawScope)object0).drawContent();
        DrawScope.drawRect-AsUm42w$default(((ContentDrawScope)object0), this.a, 0L, 0L, 0.0f, null, null, 0, 0x7E, null);
        return Unit.INSTANCE;
    }
}

