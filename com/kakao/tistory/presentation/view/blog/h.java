package com.kakao.tistory.presentation.view.blog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final BlogFollowerFragment a;
    public final int b;

    public h(BlogFollowerFragment blogFollowerFragment0, int v) {
        this.a = blogFollowerFragment0;
        this.b = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.Content(((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
        return Unit.INSTANCE;
    }
}

