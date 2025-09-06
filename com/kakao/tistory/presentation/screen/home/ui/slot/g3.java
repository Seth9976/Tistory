package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g3 extends Lambda implements Function1 {
    public static final g3 a;

    static {
        g3.a = new g3();
    }

    public g3() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SemanticsPropertyReceiver)object0), "$this$semantics");
        SemanticsPropertiesKt.heading(((SemanticsPropertyReceiver)object0));
        return Unit.INSTANCE;
    }
}

