package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i3 extends Lambda implements Function1 {
    public static final i3 a;

    static {
        i3.a = new i3();
    }

    public i3() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SemanticsPropertyReceiver)object0), "$this$semantics");
        SemanticsPropertiesKt.setTraversalIndex(((SemanticsPropertyReceiver)object0), 1.0f);
        return Unit.INSTANCE;
    }
}

