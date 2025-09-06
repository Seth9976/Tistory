package com.kakao.tistory.presentation.view.setting;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k1 extends Lambda implements Function1 {
    public static final k1 a;

    static {
        k1.a = new k1();
    }

    public k1() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SemanticsPropertyReceiver)object0), "$this$clearAndSetSemantics");
        return Unit.INSTANCE;
    }
}

