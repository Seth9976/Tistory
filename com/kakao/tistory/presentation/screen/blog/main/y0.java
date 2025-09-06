package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.ChangeBlogInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class y0 extends Lambda implements Function1 {
    public final BlogMainViewModel a;

    public y0(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ChangeBlogInfo blogMainIntent$ChangeBlogInfo0 = new ChangeBlogInfo(((BlogInfo)object0));
        this.a.sendIntent(blogMainIntent$ChangeBlogInfo0);
        return Unit.INSTANCE;
    }
}

