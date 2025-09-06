package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoEntryStatistics;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b1 extends Lambda implements Function3 {
    public final BlogMainViewModel a;

    public b1(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Intrinsics.checkNotNullParameter(((String)object0), "blogName");
        Intrinsics.checkNotNullParameter(((String)object2), "title");
        BlogMainTiara.INSTANCE.trackClickEntryStatistics();
        GoEntryStatistics blogMainEvent$GoEntryStatistics0 = new GoEntryStatistics(((String)object0), ((Number)object1).longValue(), ((String)object2));
        this.a.sendEvent(blogMainEvent$GoEntryStatistics0);
        return Unit.INSTANCE;
    }
}

