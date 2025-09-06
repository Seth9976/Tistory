package com.kakao.tistory.presentation.screen.blogswitch;

import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchIntent.UpdateCurrentBlog;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

public final class m0 implements FlowCollector {
    public final BlogSwitchViewModel a;

    public m0(BlogSwitchViewModel blogSwitchViewModel0) {
        this.a = blogSwitchViewModel0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        UpdateCurrentBlog blogSwitchIntent$UpdateCurrentBlog0 = new UpdateCurrentBlog(((Blog)object0));
        this.a.sendIntent(blogSwitchIntent$UpdateCurrentBlog0);
        return Unit.INSTANCE;
    }
}

