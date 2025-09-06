package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Today;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a3 extends Lambda implements Function4 {
    public final Today a;
    public final int b;

    public a3(Today homeSlotUiState$Today0, int v) {
        this.a = homeSlotUiState$Today0;
        this.b = v;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((PagerScope)object0), "$this$HorizontalPager");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x90E234A7, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Today.<anonymous>.<anonymous> (Today.kt:194)");
        }
        TodayKt.access$PageContent(((com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Today)this.a.getContents().get(v % this.b)), ((Composer)object2), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

