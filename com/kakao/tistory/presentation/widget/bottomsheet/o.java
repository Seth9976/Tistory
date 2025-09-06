package com.kakao.tistory.presentation.widget.bottomsheet;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function1 {
    public final String a;
    public final Function0 b;

    public o(String s, Function0 function00) {
        this.a = s;
        this.b = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SemanticsPropertyReceiver)object0), "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.a);
        SemanticsPropertiesKt.onClick$default(((SemanticsPropertyReceiver)object0), null, new n(this.b), 1, null);
        return Unit.INSTANCE;
    }
}

