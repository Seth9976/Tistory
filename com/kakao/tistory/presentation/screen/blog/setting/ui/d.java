package com.kakao.tistory.presentation.screen.blog.setting.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function3 {
    public final Function0 a;

    public d(Function0 function00) {
        this.a = function00;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$TistoryTopAppBar");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFB366CF0, v, -1, "com.kakao.tistory.presentation.screen.blog.setting.ui.BlogSettingTopAppBar.<anonymous> (BlogSettingTopAppBar.kt:22)");
        }
        TistoryTopAppBarButtonKt.NavigationClose(this.a, ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

