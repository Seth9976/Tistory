package com.kakao.tistory.presentation.view.editor;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e5 extends Lambda implements Function1 {
    public static final e5 a;

    static {
        e5.a = new e5();
    }

    public e5() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SemanticsPropertyReceiver)object0), "$this$clearAndSetSemantics");
        return Unit.INSTANCE;
    }
}

