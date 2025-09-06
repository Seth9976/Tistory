package com.kakao.tistory.presentation.view.search;

import androidx.compose.material3.TabPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import com.google.accompanist.pager.PagerState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y1 extends Lambda implements Function3 {
    public final PagerState a;

    public y1(PagerState pagerState0) {
        this.a = pagerState0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((List)object0), "tabPositions");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAEF14AAE, v, -1, "com.kakao.tistory.presentation.view.search.SearchResultTab.<anonymous> (SearchResultListFragment.kt:148)");
        }
        float f = ((TabPosition)((List)object0).get(this.a.getCurrentPage())).getWidth-D9Ej5fM();
        float f1 = ((TabPosition)((List)object0).get(this.a.getCurrentPage())).getLeft-D9Ej5fM();
        SearchResultListFragmentKt.access$SearchTabIndicator-i1RSzL4(f, Dp.constructor-impl(Dp.constructor-impl(this.a.getCurrentPageOffset() * f) + f1), ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

