package com.kakao.tistory.presentation.view.toppost;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.viewmodel.TopEntriesSortType;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarSortKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function3 {
    public final TopEntriesSortType a;
    public final Function0 b;

    public r(TopEntriesSortType topEntriesSortType0, Function0 function00) {
        this.a = topEntriesSortType0;
        this.b = function00;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$TistoryCollapsingTopAppBar");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x29FD78EF, v, -1, "com.kakao.tistory.presentation.view.toppost.TopPostListActivity.TopPostAppbar.<anonymous> (TopPostListActivity.kt:172)");
        }
        TopEntriesSortType topEntriesSortType0 = this.a;
        if(topEntriesSortType0 != null) {
            TistoryTopAppBarSortKt.SortSelectButton(StringResources_androidKt.stringResource(topEntriesSortType0.getTitleRes(), ((Composer)object1), 0), this.b, ((Composer)object1), 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

