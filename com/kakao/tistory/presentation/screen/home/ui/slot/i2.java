package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Tip;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotTitleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i2 extends Lambda implements Function2 {
    public final Tip a;

    public i2(Tip homeSlotUiState$Tip0) {
        this.a = homeSlotUiState$Tip0;
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
            ComposerKt.traceEventStart(270350870, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Tip.<anonymous> (Tip.kt:77)");
        }
        SlotTitleKt.SlotTitle(this.a.getTitle(), this.a.getEmoji(), null, ((Composer)object0), 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

