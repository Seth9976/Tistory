package com.kakao.tistory.presentation.screen.blogswitch;

import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchIntent.SwitchBlog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function2 {
    public final BlogSwitchViewModel a;

    public r0(BlogSwitchViewModel blogSwitchViewModel0) {
        this.a = blogSwitchViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Blog)object1), "blog");
        SwitchBlog blogSwitchIntent$SwitchBlog0 = new SwitchBlog(((Number)object0).intValue(), ((Blog)object1));
        this.a.sendIntent(blogSwitchIntent$SwitchBlog0);
        return Unit.INSTANCE;
    }
}

