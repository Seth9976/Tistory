package com.kakao.tistory.presentation.screen.blog.noticeList;

import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListEvent.GoStatistics;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function3 {
    public final BlogNoticeListViewModel a;

    public f0(BlogNoticeListViewModel blogNoticeListViewModel0) {
        this.a = blogNoticeListViewModel0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Intrinsics.checkNotNullParameter(((String)object0), "blogName");
        Intrinsics.checkNotNullParameter(((String)object2), "title");
        BlogNoticeListTiara.INSTANCE.trackClickNoticeStatistics();
        GoStatistics blogNoticeListEvent$GoStatistics0 = new GoStatistics(((String)object0), ((Number)object1).longValue(), ((String)object2));
        this.a.sendEvent(blogNoticeListEvent$GoStatistics0);
        return Unit.INSTANCE;
    }
}

