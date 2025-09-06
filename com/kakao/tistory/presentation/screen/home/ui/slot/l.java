package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Category;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotTitleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function2 {
    public final Category a;

    public l(Category homeSlotUiState$Category0) {
        this.a = homeSlotUiState$Category0;
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
            ComposerKt.traceEventStart(-2021839547, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Category.<anonymous> (Category.kt:75)");
        }
        SlotTitleKt.SlotTitle(this.a.getTitle(), this.a.getEmoji(), PaddingKt.PaddingValues-a9UjIt4(20.0f, 22.0f, 20.0f, 12.0f), ((Composer)object0), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

