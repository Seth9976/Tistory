package com.kakao.tistory.presentation.main.ui;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final boolean a;

    public g(boolean z) {
        this.a = z;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SemanticsPropertyReceiver)object0), "$this$semantics");
        SemanticsPropertiesKt.setSelected(((SemanticsPropertyReceiver)object0), this.a);
        return Unit.INSTANCE;
    }
}

