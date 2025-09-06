package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.RefreshChallenge;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.RefreshEntryAndNoticeIfMyBlog;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

public final class r0 implements FlowCollector {
    public final BlogMainViewModel a;

    public r0(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super();
    }

    public final Unit a(EntryItem entryItem0) {
        Logger.INSTANCE.log("blogmianviewModel addedEntryItem " + entryItem0);
        if(entryItem0 != null) {
            this.a.sendIntent(RefreshEntryAndNoticeIfMyBlog.INSTANCE);
            this.a.sendIntent(RefreshChallenge.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        return this.a(((EntryItem)object0));
    }
}

