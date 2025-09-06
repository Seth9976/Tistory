package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r2 extends Lambda implements Function1 {
    public static final r2 a;

    static {
        r2.a = new r2();
    }

    public r2() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SemanticsPropertyReceiver)object0), "$this$semantics");
        SemanticsPropertiesKt.heading(((SemanticsPropertyReceiver)object0));
        return Unit.INSTANCE;
    }
}

