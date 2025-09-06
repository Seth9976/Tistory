package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Subscription;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotTitleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class x1 extends Lambda implements Function2 {
    public final Subscription a;

    public x1(Subscription homeSlotUiState$Subscription0) {
        this.a = homeSlotUiState$Subscription0;
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
            ComposerKt.traceEventStart(-2015997082, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Subscription.<anonymous> (Subscription.kt:81)");
        }
        SlotTitleKt.SlotTitle(this.a.getTitle(), this.a.getEmoji(), null, ((Composer)object0), 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

