package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.ui.draw.CacheDrawScope;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function1 {
    public final BlogMainInfo a;

    public r0(BlogMainInfo blogMainInfo0) {
        this.a = blogMainInfo0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CacheDrawScope)object0), "$this$drawWithCache");
        return BlogMainTopBackgroundKt.drawTopBackground-cSwnlzA(((CacheDrawScope)object0), BlogMainInfoKt.access$creatorBackgroundBrush--OWjLjI(com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfoKt.topGradientStartColor(this.a), com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfoKt.topGradientEndColor(this.a)), ((CacheDrawScope)object0).getSize-NH-jbRc());
    }
}

