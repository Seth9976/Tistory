package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoAuthWeb;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x1 extends Lambda implements Function1 {
    public final BlogMainViewModel a;

    public x1(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "title");
        BlogMainTiara.INSTANCE.trackClickChallengeAuth(((String)object0));
        GoAuthWeb blogMainEvent$GoAuthWeb0 = new GoAuthWeb("https://accounts.kakao.com/weblogin/account");
        this.a.sendEvent(blogMainEvent$GoAuthWeb0);
        return Unit.INSTANCE;
    }
}

