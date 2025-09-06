package com.kakao.tistory.presentation.screen.blog.setting.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function3 {
    public final boolean a;
    public final Function0 b;

    public e(boolean z, Function0 function00) {
        this.a = z;
        this.b = function00;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        ((Number)object0).floatValue();
        int v = ((Number)object2).intValue();
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF90413DD, v, -1, "com.kakao.tistory.presentation.screen.blog.setting.ui.BlogSettingTopAppBar.<anonymous> (BlogSettingTopAppBar.kt:25)");
        }
        TistoryTopAppBarButtonKt.CompleteButton(this.a, this.b, ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

