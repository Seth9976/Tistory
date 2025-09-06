package com.kakao.tistory.presentation.screen.blog.noticeList;

import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListIntent.ChangeBlogInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function1 {
    public final BlogNoticeListViewModel a;

    public d0(BlogNoticeListViewModel blogNoticeListViewModel0) {
        this.a = blogNoticeListViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ChangeBlogInfo blogNoticeListIntent$ChangeBlogInfo0 = new ChangeBlogInfo(((BlogInfo)object0));
        this.a.sendIntent(blogNoticeListIntent$ChangeBlogInfo0);
        return Unit.INSTANCE;
    }
}

