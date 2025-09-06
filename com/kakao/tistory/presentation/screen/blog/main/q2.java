package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.RequestChangeBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q2 extends Lambda implements Function2 {
    public final BlogMainViewModel a;

    public q2(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        boolean z = ((Boolean)object1).booleanValue();
        BlogMainTiara.INSTANCE.trackClickBlock(z);
        RequestChangeBlock blogMainIntent$RequestChangeBlock0 = new RequestChangeBlock(((Number)object0).longValue(), z);
        this.a.sendIntent(blogMainIntent$RequestChangeBlock0);
        return Unit.INSTANCE;
    }
}

