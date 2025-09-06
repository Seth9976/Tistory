package com.kakao.tistory.presentation.screen.blog.noticeList;

import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListIntent.Refresh;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function0 {
    public final BlogNoticeListViewModel a;

    public e0(BlogNoticeListViewModel blogNoticeListViewModel0) {
        this.a = blogNoticeListViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendIntent(Refresh.INSTANCE);
        return Unit.INSTANCE;
    }
}

