package com.kakao.tistory.presentation.screen.blog.noticeList;

import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListIntent.UpdateCurrentUserId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

public final class s implements FlowCollector {
    public final BlogNoticeListViewModel a;

    public s(BlogNoticeListViewModel blogNoticeListViewModel0) {
        this.a = blogNoticeListViewModel0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        this.a.sendIntent(new UpdateCurrentUserId((((User)object0) == null ? null : ((User)object0).getId())));
        return Unit.INSTANCE;
    }
}

