package com.kakao.tistory.presentation.screen.blog.noticeList;

import androidx.compose.runtime.State;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.NoticeBottomSheet.Modify;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.NoticeBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public final NoticeBottomSheet a;
    public final State b;

    public k(NoticeBottomSheet noticeBottomSheet0, State state0) {
        this.a = noticeBottomSheet0;
        this.b = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((EntryVisibilityType)object0), "visibilityType");
        BlogNoticeListScreenKt.access$BlogNoticeScreen$lambda$1(this.b).getChangeVisibility().invoke(((Modify)this.a).getBlogName(), ((Modify)this.a).getId(), Boolean.valueOf(((Modify)this.a).getModifiable()), ((EntryVisibilityType)object0));
        return Unit.INSTANCE;
    }
}

