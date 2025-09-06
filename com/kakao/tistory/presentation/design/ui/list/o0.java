package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class o0 extends Lambda implements Function0 {
    public final HapticFeedback a;
    public final Function0 b;

    public o0(HapticFeedback hapticFeedback0, Function0 function00) {
        this.a = hapticFeedback0;
        this.b = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int v = HapticFeedbackType.Companion.getLongPress-5zf0vsI();
        this.a.performHapticFeedback-CdsT49E(v);
        this.b.invoke();
        return Unit.INSTANCE;
    }
}

