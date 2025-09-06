package com.kakao.tistory.presentation.screen.blog.noticeList;

import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.NoticeBottomSheet.Modify;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.NoticeBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function0 {
    public final NoticeBottomSheet a;
    public final State b;

    public j(NoticeBottomSheet noticeBottomSheet0, State state0) {
        this.a = noticeBottomSheet0;
        this.b = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogNoticeListScreenKt.access$BlogNoticeScreen$lambda$1(this.b).getOnClickNoticeDelete().invoke(((Modify)this.a).getBlogName(), ((Modify)this.a).getId(), Boolean.valueOf(((Modify)this.a).getModifiable()));
        return Unit.INSTANCE;
    }
}

