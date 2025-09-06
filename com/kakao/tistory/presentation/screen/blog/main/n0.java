package com.kakao.tistory.presentation.screen.blog.main;

import android.util.LongSparseArray;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.RefreshEntryAndNoticeIfMyBlog;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

public final class n0 implements FlowCollector {
    public final BlogMainViewModel a;

    public n0(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super();
    }

    public final Unit a(LongSparseArray longSparseArray0) {
        Logger.INSTANCE.log("blogmianviewModel updatedCommentCounts " + longSparseArray0);
        Intrinsics.checkNotNull(longSparseArray0);
        if(longSparseArray0.size() != 0) {
            this.a.sendIntent(RefreshEntryAndNoticeIfMyBlog.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        return this.a(((LongSparseArray)object0));
    }
}

