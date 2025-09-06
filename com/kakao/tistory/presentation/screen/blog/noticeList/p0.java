package com.kakao.tistory.presentation.screen.blog.noticeList;

import com.kakao.tistory.presentation.screen.blog.main.contract.RestrictType;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p0 extends Lambda implements Function3 {
    public final BlogNoticeListViewModel a;
    public final boolean b;

    public p0(BlogNoticeListViewModel blogNoticeListViewModel0, boolean z) {
        this.a = blogNoticeListViewModel0;
        this.b = z;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Intrinsics.checkNotNullParameter(((String)object0), "blogName");
        BlogNoticeListViewModel.access$onClickEntry(this.a, ((String)object0), ((Number)object1).longValue(), this.b, ((RestrictType)object2));
        return Unit.INSTANCE;
    }
}

