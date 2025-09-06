package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final Blog a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;

    public h(Blog blog0, Function0 function00, Function0 function01, Function0 function02) {
        this.a = blog0;
        this.b = function00;
        this.c = function01;
        this.d = function02;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD2CCED8A, v, -1, "com.kakao.tistory.presentation.widget.dialog.DefaultBlogDialog.<anonymous> (BlogDialog.kt:38)");
        }
        TistoryThemeKt.TistoryTheme(false, ComposableLambdaKt.rememberComposableLambda(0xB3D52E21, true, new g(this.a, this.b, this.c, this.d), ((Composer)object0), 54), ((Composer)object0), 0x30, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

