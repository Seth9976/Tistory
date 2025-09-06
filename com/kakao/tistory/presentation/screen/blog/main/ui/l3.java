package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l3 extends Lambda implements Function3 {
    public final boolean a;
    public final Function0 b;

    public l3(boolean z, Function0 function00) {
        this.a = z;
        this.b = function00;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$TistoryTopAppBarLayout");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE903EEF8, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainAppBar.<anonymous>.<anonymous>.<anonymous> (BlogMainTopAppBar.kt:35)");
        }
        if(this.a) {
            TistoryTopAppBarButtonKt.NavigationBack(this.b, ((Composer)object1), 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

