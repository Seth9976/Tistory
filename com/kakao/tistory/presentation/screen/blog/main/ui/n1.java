package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n1 extends Lambda implements Function3 {
    public final BlogMainInfo a;

    public n1(BlogMainInfo blogMainInfo0) {
        this.a = blogMainInfo0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((LazyItemScope)object0), "$this$item");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9F122631, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.blogMainInfo.<anonymous>.<anonymous> (BlogMainInfo.kt:53)");
        }
        BlogMainInfoKt.BlogMainInfo(this.a, ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

