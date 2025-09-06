package com.kakao.tistory.presentation.design.ui.thumbnail;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final Color a;

    public e(Color color0) {
        this.a = color0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ContentDrawScope)object0), "$this$drawWithContent");
        ((ContentDrawScope)object0).drawContent();
        DrawScope.drawRect-n-J9OG0$default(((ContentDrawScope)object0), this.a.unbox-impl(), 0L, 0L, 0.0f, null, null, 0, 0x7E, null);
        return Unit.INSTANCE;
    }
}

