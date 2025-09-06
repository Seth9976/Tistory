package com.kakao.tistory.presentation.widget.common;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m2 extends Lambda implements Function1 {
    public static final m2 a;

    static {
        m2.a = new m2();
    }

    public m2() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SemanticsPropertyReceiver)object0), "$this$semantics");
        SemanticsPropertiesKt.setRole-kuIjeqM(((SemanticsPropertyReceiver)object0), 0);
        return Unit.INSTANCE;
    }
}

