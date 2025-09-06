package com.kakao.tistory.presentation.screen.blog.noticeList;

import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o0 extends Lambda implements Function4 {
    public final BlogNoticeListViewModel a;

    public o0(BlogNoticeListViewModel blogNoticeListViewModel0) {
        this.a = blogNoticeListViewModel0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        Intrinsics.checkNotNullParameter(((String)object0), "blogName");
        Intrinsics.checkNotNullParameter(((EntryVisibilityType)object3), "visibility");
        n0 n00 = new n0(((EntryVisibilityType)object3), this.a, ((String)object0), ((Number)object1).longValue());
        BlogNoticeListViewModel.access$checkEntryEditable(this.a, ((Boolean)object2).booleanValue(), n00);
        return Unit.INSTANCE;
    }
}

