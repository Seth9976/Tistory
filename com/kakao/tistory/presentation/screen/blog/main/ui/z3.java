package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainTopEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z3 extends Lambda implements Function3 {
    public final BlogMainTopEntry a;

    public z3(BlogMainTopEntry blogMainTopEntry0) {
        this.a = blogMainTopEntry0;
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
            ComposerKt.traceEventStart(1773024474, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.blogMainTopEntryList.<anonymous> (BlogMainTopEntryList.kt:49)");
        }
        BlogMainTopEntryListKt.a(this.a, ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

