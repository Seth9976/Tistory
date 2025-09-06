package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.OnClickFollow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class x2 extends Lambda implements Function1 {
    public final BlogMainViewModel a;

    public x2(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        OnClickFollow blogMainIntent$OnClickFollow0 = new OnClickFollow(((Boolean)object0).booleanValue());
        this.a.sendIntent(blogMainIntent$OnClickFollow0);
        return Unit.INSTANCE;
    }
}

