package com.kakao.tistory.presentation.screen.blog.noticeList;

import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListIntent.ShowDialog;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.DialogType.Delete;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function0 {
    public final BlogNoticeListViewModel a;
    public final String b;
    public final long c;

    public i0(BlogNoticeListViewModel blogNoticeListViewModel0, String s, long v) {
        this.a = blogNoticeListViewModel0;
        this.b = s;
        this.c = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogNoticeListTiara.INSTANCE.trackClickNoticeDelete();
        ShowDialog blogNoticeListIntent$ShowDialog0 = new ShowDialog(new Delete(this.b, this.c));
        this.a.sendIntent(blogNoticeListIntent$ShowDialog0);
        return Unit.INSTANCE;
    }
}

