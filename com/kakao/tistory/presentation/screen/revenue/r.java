package com.kakao.tistory.presentation.screen.revenue;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function3 {
    public final NavActions a;

    public r(NavActions navActions0) {
        this.a = navActions0;
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
            ComposerKt.traceEventStart(-937171084, v, -1, "com.kakao.tistory.presentation.screen.revenue.RevenueScreen.<anonymous>.<anonymous> (RevenueScreen.kt:85)");
        }
        ((Composer)object1).startReplaceGroup(279060763);
        boolean z = ((Composer)object1).changed(this.a);
        NavActions navActions0 = this.a;
        q q0 = ((Composer)object1).rememberedValue();
        if(z || q0 == Composer.Companion.getEmpty()) {
            q0 = new q(navActions0);
            ((Composer)object1).updateRememberedValue(q0);
        }
        ((Composer)object1).endReplaceGroup();
        TistoryTopAppBarButtonKt.NavigationClose(q0, ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

