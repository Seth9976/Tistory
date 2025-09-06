package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function3 {
    public final TextStyle a;

    public g(TextStyle textStyle0) {
        this.a = textStyle0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$SlotGridItem");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDBCA0580, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.ComposableSingletons$SlotGridKt.lambda-4.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SlotGrid.kt:97)");
        }
        TextKt.Text--4IGK_g("응원 독자님 등 4명 응원", BackgroundKt.background-bw27NRU$default(PlaceHolderKt.notVisibleWhenLoading(Modifier.Companion, ((Composer)object1), 6), 0L, null, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, this.a, ((Composer)object1), 390, 0x180C30, 0xD7F8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

