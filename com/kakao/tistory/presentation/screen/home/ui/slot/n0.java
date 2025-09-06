package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Creator;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.CreatorEntry;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotGridKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n0 extends Lambda implements Function2 {
    public final Creator a;

    public n0(Creator homeSlotUiStateContent$Creator0) {
        this.a = homeSlotUiStateContent$Creator0;
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
            ComposerKt.traceEventStart(0x47DCACF8, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.CreatorContent.<anonymous> (Creator.kt:355)");
        }
        for(Object object2: this.a.getEntryList()) {
            SlotGridKt.SlotGridItem-xfPyhaw(((CreatorEntry)object2), ((CreatorEntry)object2).isNew(), null, 0.0f, 0L, ((Composer)object0), 0, 28);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

