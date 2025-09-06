package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.common.tiara.TistoryGNBTiaraKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoSearch;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a3 extends Lambda implements Function1 {
    public final BlogMainViewModel a;

    public a3(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        TistoryGNBTiaraKt.trackClickAppBarSearch(BlogMainTiara.INSTANCE, false);
        GoSearch blogMainEvent$GoSearch0 = new GoSearch(((String)object0));
        this.a.sendEvent(blogMainEvent$GoSearch0);
        return Unit.INSTANCE;
    }
}

