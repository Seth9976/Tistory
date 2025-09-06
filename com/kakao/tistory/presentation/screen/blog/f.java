package com.kakao.tistory.presentation.screen.blog;

import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogIntent.UpdateBlogInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final BlogViewModel a;

    public f(BlogViewModel blogViewModel0) {
        this.a = blogViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((BlogInfo)object0), "it");
        UpdateBlogInfo blogIntent$UpdateBlogInfo0 = new UpdateBlogInfo(((BlogInfo)object0));
        this.a.sendIntent(blogIntent$UpdateBlogInfo0);
        return Unit.INSTANCE;
    }
}

