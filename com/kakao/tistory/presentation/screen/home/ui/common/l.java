package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function2 {
    public static final l a;

    static {
        l.a = new l();
    }

    public l() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x951914CE, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.ComposableSingletons$SlotTitleKt.lambda-1.<anonymous> (SlotTitle.kt:27)");
        }
        SlotTitleKt.SlotTitle("인기 응원글", "http://t1.daumcdn.net/brunch/service/user/2xr/image/6-d1CBljJhw2mnAT69vMQfDoNyM.png", null, ((Composer)object0), 54, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

