package com.kakao.tistory.presentation.view.toppost;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function3 {
    public final TopPostListActivity a;

    public q(TopPostListActivity topPostListActivity0) {
        this.a = topPostListActivity0;
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
            ComposerKt.traceEventStart(0xE33DA2B1, v, -1, "com.kakao.tistory.presentation.view.toppost.TopPostListActivity.TopPostAppbar.<anonymous> (TopPostListActivity.kt:176)");
        }
        TistoryTopAppBarButtonKt.NavigationClose(new p(this.a), ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

