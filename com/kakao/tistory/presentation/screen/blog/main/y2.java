package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoShare;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y2 extends Lambda implements Function2 {
    public final BlogMainViewModel a;

    public y2(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((String)object0), "blogTitle");
        Intrinsics.checkNotNullParameter(((String)object1), "blogUrl");
        BlogMainTiara.INSTANCE.trackClickShareUrl(((String)object1));
        GoShare blogMainEvent$GoShare0 = new GoShare(((String)object0), ((String)object1));
        this.a.sendEvent(blogMainEvent$GoShare0);
        return Unit.INSTANCE;
    }
}

