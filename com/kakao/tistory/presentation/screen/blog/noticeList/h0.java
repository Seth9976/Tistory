package com.kakao.tistory.presentation.screen.blog.noticeList;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function3 {
    public final BlogNoticeListViewModel a;

    public h0(BlogNoticeListViewModel blogNoticeListViewModel0) {
        this.a = blogNoticeListViewModel0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Intrinsics.checkNotNullParameter(((String)object0), "blogName");
        g0 g00 = new g0(this.a, ((String)object0), ((Number)object1).longValue());
        BlogNoticeListViewModel.access$checkEntryEditable(this.a, ((Boolean)object2).booleanValue(), g00);
        return Unit.INSTANCE;
    }
}

