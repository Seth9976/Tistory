package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.TodayEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class s2 extends Lambda implements Function2 {
    public final ColumnScope a;
    public final TodayEntry b;
    public final int c;

    public s2(ColumnScope columnScope0, TodayEntry homeSlotUiStateContent$TodayEntry0, int v) {
        this.a = columnScope0;
        this.b = homeSlotUiStateContent$TodayEntry0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TodayKt.a(this.a, this.b, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
        return Unit.INSTANCE;
    }
}

