package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Blog;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Entry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u0 extends Lambda implements Function2 {
    public final Entry a;

    public u0(Entry entryListUiState$Entry0) {
        this.a = entryListUiState$Entry0;
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
            ComposerKt.traceEventStart(0xA9B23CF, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotGridItem.<anonymous> (SlotGrid.kt:164)");
        }
        Blog entryListUiState$Blog0 = this.a instanceof Blog ? ((Blog)this.a) : null;
        if(entryListUiState$Blog0 != null) {
            SlotBlogInfoKt.SlotBlogInfoOnImage(entryListUiState$Blog0, PaddingKt.PaddingValues-0680j_4(12.0f), ((Composer)object0), 0x30, 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

