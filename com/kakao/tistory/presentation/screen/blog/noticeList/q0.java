package com.kakao.tistory.presentation.screen.blog.noticeList;

import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListIntent.ShowBottomSheet;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.NoticeBottomSheet.Modify;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q0 extends Lambda implements Function4 {
    public final BlogNoticeListViewModel a;
    public final boolean b;

    public q0(BlogNoticeListViewModel blogNoticeListViewModel0, boolean z) {
        this.a = blogNoticeListViewModel0;
        this.b = z;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        Intrinsics.checkNotNullParameter(((String)object0), "blogName");
        Intrinsics.checkNotNullParameter(((String)object2), "title");
        Intrinsics.checkNotNullParameter(((EntryVisibilityType)object3), "visibility");
        ShowBottomSheet blogNoticeListIntent$ShowBottomSheet0 = new ShowBottomSheet(new Modify(((String)object0), ((Number)object1).longValue(), ((String)object2), ((EntryVisibilityType)object3), this.b));
        this.a.sendIntent(blogNoticeListIntent$ShowBottomSheet0);
        return Unit.INSTANCE;
    }
}

