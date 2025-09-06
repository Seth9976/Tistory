package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Tip;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k2 extends Lambda implements Function3 {
    public final Tip a;

    public k2(Tip homeSlotUiState$Tip0) {
        this.a = homeSlotUiState$Tip0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$SlotContainer");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x68FE6323, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Tip.<anonymous> (Tip.kt:85)");
        }
        LazyDslKt.LazyRow(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 20.0f, 7, null), null, PaddingKt.PaddingValues-YgX7TsA$default(20.0f, 0.0f, 2, null), false, Arrangement.INSTANCE.spacedBy-0680j_4(8.0f), null, null, false, new j2(this.a), ((Composer)object1), 0x6186, 0xEA);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

