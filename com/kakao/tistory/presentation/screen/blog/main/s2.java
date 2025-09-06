package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoFollowerList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s2 extends Lambda implements Function1 {
    public final BlogMainViewModel a;

    public s2(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        BlogMainTiara.INSTANCE.trackClickFollowerCount();
        GoFollowerList blogMainEvent$GoFollowerList0 = new GoFollowerList(((String)object0));
        this.a.sendEvent(blogMainEvent$GoFollowerList0);
        return Unit.INSTANCE;
    }
}

