package com.kakao.tistory.presentation.screen.blog.noticeList;

import android.util.LongSparseArray;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeListIntent.Refresh;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

public final class u implements FlowCollector {
    public final BlogNoticeListViewModel a;

    public u(BlogNoticeListViewModel blogNoticeListViewModel0) {
        this.a = blogNoticeListViewModel0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        Intrinsics.checkNotNull(((LongSparseArray)object0));
        if(((LongSparseArray)object0).size() != 0) {
            this.a.sendIntent(Refresh.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}

