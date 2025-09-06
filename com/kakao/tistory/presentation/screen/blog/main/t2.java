package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoFollowingList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t2 extends Lambda implements Function1 {
    public final BlogMainViewModel a;

    public t2(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        BlogMainTiara.INSTANCE.trackClickFollowingCount();
        GoFollowingList blogMainEvent$GoFollowingList0 = new GoFollowingList(((String)object0));
        this.a.sendEvent(blogMainEvent$GoFollowingList0);
        return Unit.INSTANCE;
    }
}

