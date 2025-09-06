package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoWeb;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w1 extends Lambda implements Function3 {
    public final BlogMainViewModel a;

    public w1(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Intrinsics.checkNotNullParameter(((String)object0), "url");
        Intrinsics.checkNotNullParameter(((String)object1), "title");
        BlogMainTiara.INSTANCE.trackClickChallengeBanner(((String)object1), ((Boolean)object2).booleanValue());
        GoWeb blogMainEvent$GoWeb0 = new GoWeb(((String)object0));
        this.a.sendEvent(blogMainEvent$GoWeb0);
        return Unit.INSTANCE;
    }
}

