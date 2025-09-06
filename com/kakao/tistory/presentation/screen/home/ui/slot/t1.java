package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.SubscriptionEntry;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotGridKt;
import com.kakao.tistory.presentation.theme.TColor;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t1 extends Lambda implements Function2 {
    public final List a;

    public t1(List list0) {
        this.a = list0;
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
            ComposerKt.traceEventStart(0x62891FE8, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.EntryList.<anonymous> (Subscription.kt:325)");
        }
        for(Object object2: CollectionsKt___CollectionsKt.take(this.a, 2)) {
            SlotGridKt.SlotGridItem-xfPyhaw(((SubscriptionEntry)object2), ((SubscriptionEntry)object2).isNew(), null, 0.0f, TColor.INSTANCE.getGray100-0d7_KjU(), ((Composer)object0), 0x6000, 12);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

