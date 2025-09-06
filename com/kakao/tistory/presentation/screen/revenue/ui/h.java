package com.kakao.tistory.presentation.screen.revenue.ui;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final String a;

    public h(String s) {
        this.a = s;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SemanticsPropertyReceiver)object0), "$this$clearAndSetSemantics");
        SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.a);
        return Unit.INSTANCE;
    }
}

