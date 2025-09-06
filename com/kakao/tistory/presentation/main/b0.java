package com.kakao.tistory.presentation.main;

import com.kakao.android.base.utils.Logger;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.main.contract.MainIntent.ChangeCurrentBlog;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

public final class b0 implements FlowCollector {
    public final MainAppViewModel a;

    public b0(MainAppViewModel mainAppViewModel0) {
        this.a = mainAppViewModel0;
        super();
    }

    public final Unit a(Blog blog0) {
        Logger.INSTANCE.log("currentBlogFlow: " + blog0);
        ChangeCurrentBlog mainIntent$ChangeCurrentBlog0 = new ChangeCurrentBlog(blog0);
        this.a.sendIntent(mainIntent$ChangeCurrentBlog0);
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        return this.a(((Blog)object0));
    }
}

