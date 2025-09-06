package com.kakao.tistory.presentation.screen.revenue.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function1 {
    public final MutableState a;

    public o(MutableState mutableState0) {
        this.a = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ContentDrawScope)object0), "$this$drawWithContent");
        if(RevenueViewKt.access$AutoSizeText$lambda$19(this.a)) {
            ((ContentDrawScope)object0).drawContent();
        }
        return Unit.INSTANCE;
    }
}

