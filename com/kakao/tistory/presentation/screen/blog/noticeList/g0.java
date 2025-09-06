package com.kakao.tistory.presentation.screen.blog.noticeList;

import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListEvent.GoEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function0 {
    public final BlogNoticeListViewModel a;
    public final String b;
    public final long c;

    public g0(BlogNoticeListViewModel blogNoticeListViewModel0, String s, long v) {
        this.a = blogNoticeListViewModel0;
        this.b = s;
        this.c = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogNoticeListTiara.INSTANCE.trackClickNoticeModify();
        GoEditor blogNoticeListEvent$GoEditor0 = new GoEditor(this.b, this.c);
        this.a.sendEvent(blogNoticeListEvent$GoEditor0);
        return Unit.INSTANCE;
    }
}

