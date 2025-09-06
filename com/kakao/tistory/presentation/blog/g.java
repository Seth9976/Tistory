package com.kakao.tistory.presentation.blog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final BlogActivity a;
    public final String b;
    public final boolean c;

    public g(BlogActivity blogActivity0, String s, boolean z) {
        this.a = blogActivity0;
        this.b = s;
        this.c = z;
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
            ComposerKt.traceEventStart(0x7FB57BF, v, -1, "com.kakao.tistory.presentation.blog.BlogActivity.onCreate.<anonymous>.<anonymous> (BlogActivity.kt:41)");
        }
        BlogActivity.access$BlogApp(this.a, this.b, this.c, ((Composer)object0), 0x200);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

